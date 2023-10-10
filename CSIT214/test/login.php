<?php
// login.php
session_start();  // Start the session

// Assume $username is obtained from a form or some other input
$username = $_POST['username'];
$password = $_POST['password'];

// ... Validate the username and password ...

// If validation is successful, set the username in the session
$_SESSION['username'] = $username;

// ... Continue with the login process ...
?>
