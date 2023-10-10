<?php
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $room_name = $_POST['room_name'];
    $room_type = $_POST['room_type'];
    $date = $_POST['date'];
    
    $filename = 'available_bookings.csv';
    $file = fopen($filename, 'a');  // Open the file in append mode
    fputcsv($file, [$room_name, $room_type, $date]);  // Write the new booking to the file
    fclose($file);
    
    echo 'Room booked successfully!';
} else {
    // Handle the case where the form hasn't been submitted
    echo 'Please submit the form to book a room.';
}
?>
