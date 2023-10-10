<?php
$action = $_POST['action'];
$username = $_POST['username'];
$password = $_POST['password'];

if (!$username || !$password) {
    echo 'Username and password are required.';
    exit;
}

if ($action === 'register' && !isset($_POST['user_type'])) {
    echo 'User type is required for registration.';
    exit;
}

$filename = 'users.csv';

if ($action == 'login') {
    $file = fopen($filename, 'r');
    $login_successful = false;
    while (($data = fgetcsv($file)) !== FALSE) {
        if ($data[0] === $username && $data[1] === $password) {
            $login_successful = true;
            $user_type = $data[2];
            break;
        }
    }
    fclose($file);
    if ($login_successful) {
        if ($user_type === 'teacher') {
            header('Location: teacher_page.html');
            exit;
        } elseif ($user_type === 'student') {
            header('Location: student_page.php');
            exit;
        } else {
            echo 'Unknown user type.';
        }
    } else {
        echo 'Invalid credentials.';
    }
} elseif ($action == 'register') {
    $user_type = $_POST['user_type'];
    $file = fopen($filename, 'r');
    $username_exists = false;
    while (($data = fgetcsv($file)) !== FALSE) {
        if ($data[0] === $username) {
            $username_exists = true;
            break;
        }
    }
    fclose($file);
    if ($username_exists) {
        echo 'Username already exists.';
        exit;
    }
    $file = fopen($filename, 'a');
    fputcsv($file, array($username, $password, $user_type));
    fclose($file);
    echo 'Registration successful.';
} else {
    echo 'Invalid action.';
}
?>
