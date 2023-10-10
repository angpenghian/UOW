<?php
$index = $_POST['index'];
$new_date = $_POST['new_date'];

$filename = 'bookings.csv';
$file = fopen($filename, 'r');
$bookings = [];
while (($data = fgetcsv($file)) !== FALSE) {
    $bookings[] = $data;
}
fclose($file);

if (isset($bookings[$index])) {
    $bookings[$index][2] = $new_date;  // Update the date of the booking
    $file = fopen($filename, 'w');
    foreach ($bookings as $booking) {
        fputcsv($file, $booking);
    }
    fclose($file);
    echo 'Booking date updated!';
} else {
    echo 'Booking not found.';
}
?>
