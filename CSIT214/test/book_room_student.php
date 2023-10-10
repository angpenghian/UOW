<?php
$index = $_POST['index'];
$student_username = $_POST['student_username'];

$filename = 'available_bookings.csv';
$file = fopen($filename, 'r');
fgetcsv($file);  // Skip header row
$bookings = [];
while (($data = fgetcsv($file)) !== FALSE) {
    $bookings[] = $data;
}
fclose($file);

if (isset($bookings[$index])) {
    $booking = $bookings[$index];
    $booking[] = $student_username;  // Add the student_username to the booking

    // Remove the booked room from available_bookings.csv
    unset($bookings[$index]);  // Remove the booking from the array

    $file = fopen($filename, 'w');
    fputcsv($file, ['room_name', 'room_type', 'date']);  // Write back the header
    foreach ($bookings as $data) {
        fputcsv($file, $data);
    }
    fclose($file);

    // Add the booked room to booked_bookings.csv
    $file = fopen('booked_bookings.csv', 'a');
    fputcsv($file, $booking);
    fclose($file);

    echo 'Successfully booked!';
} else {
    echo 'Booking no longer available.';
}
?>
