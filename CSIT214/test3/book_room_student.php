<?php
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $index = $_POST['index'];
    $student_username = $_POST['student_username'];

    $file_path = 'available_bookings.csv';
    $file = fopen($file_path, 'r');
    $bookings = [];

    while (($line = fgetcsv($file)) !== FALSE) {
        $bookings[] = $line;
    }
    fclose($file);

    if (isset($bookings[$index])) {
        $booking = $bookings[$index];
        array_splice($bookings, $index, 1);

        $file = fopen($file_path, 'w');
        foreach ($bookings as $booking) {
            fputcsv($file, $booking);
        }
        fclose($file);

        $file_path = 'booked_bookings.csv';
        $file = fopen($file_path, 'a');
        fputcsv($file, array_merge($booking, [$student_username]));
        fclose($file);

        echo 'Successfully booked';
    } else {
        echo 'Invalid booking index';
    }
} else {
    echo 'Invalid request';
}
?>
