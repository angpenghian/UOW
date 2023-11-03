<?php
session_start();
$file_path = 'users.csv';

$response = array();

if (isset($_POST['login'])) {
    $username = $_POST['username'];
    $password = $_POST['password'];
    $role = $_POST['login_role'];

    // Check credentials
    $credentials_valid = false;
    $file = fopen($file_path, 'r');
    while (($line = fgetcsv($file)) !== FALSE) {
        if ($line[0] == $username && $line[1] == $password && $line[2] == $role) {
            $_SESSION['username'] = $username;
            $_SESSION['role'] = $role;
            $credentials_valid = true;
            break;
        }
    }
    fclose($file);

    if ($credentials_valid) {
        $response['success'] = true;
        $response['redirect_url'] = ($role == 'teacher' ? 'teacher_page.php' : 'student_page.php');
    } else {
        $response['success'] = false;
        $response['message'] = 'Invalid Credentials';
    }
} elseif (isset($_POST['register'])) {
    $username = $_POST['username'];
    $password = $_POST['password'];
    $role = $_POST['reg_role'];

    // Check if username already exists
    $username_exists = false;
    $file = fopen($file_path, 'r');
    while (($line = fgetcsv($file)) !== FALSE) {
        if ($line[0] == $username) {
            $username_exists = true;
            break;
        }
    }
    fclose($file);

    if ($username_exists) {
        $response['success'] = false;
        $response['message'] = 'Username already exists';
    } else {
        // Register new user
        $file = fopen($file_path, 'a');
        fputcsv($file, [$username, $password, $role]);
        fclose($file);
        $response['success'] = true;
        $response['message'] = 'Registration Successful';
    }
}

echo json_encode($response);
?>
