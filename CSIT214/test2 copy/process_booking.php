<?php

if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $room_name = $_POST['room_name'];
    $room_type = $_POST['room_type'];
    $room_capacity = $_POST['room_capacity'];
    $room_price = $_POST['room_price'];
    $date = $_POST['date'];

    $file_path = 'available_bookings.csv';
    $file = fopen($file_path, 'a');
    
    if ($file) {
        fputcsv($file, [$room_name, $room_type, $room_capacity, $room_price, $date]);
        fclose($file);
        echo 'Booking successfully created';  // Success message
    } else {
        echo 'Error creating booking';  // Error message
    }
} else {
    echo 'Invalid request';  // Error message for invalid requests
}

?>
