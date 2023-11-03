<?php
session_start();
$file_path = 'users.csv';

if (isset($_POST['login'])) {
    $username = $_POST['username'];
    $password = $_POST['password'];
    $role = $_POST['login_role'];

    // Check credentials
    $file = fopen($file_path, 'r');
    while (($line = fgetcsv($file)) !== FALSE) {
        if ($line[0] == $username && $line[1] == $password && $line[2] == $role) {
            $_SESSION['username'] = $username;
            $_SESSION['role'] = $role;
            fclose($file);
            header('Location: ' . ($role == 'teacher' ? 'teacher_page.php' : 'student_page.php'));
            exit();
        }
    }
    fclose($file);
    echo 'Invalid Credentials';
} elseif (isset($_POST['register'])) {
    $username = $_POST['username'];
    $password = $_POST['password'];
    $role = $_POST['reg_role'];

    // Check if username already exists
    $file = fopen($file_path, 'r');
    while (($line = fgetcsv($file)) !== FALSE) {
        if ($line[0] == $username) {
            fclose($file);
            echo 'Username already exists';
            exit();
        }
    }
    fclose($file);

    // Register new user
    $file = fopen($file_path, 'a');
    fputcsv($file, [$username, $password, $role]);
    fclose($file);
    echo 'Registration Successful';
}
?>
