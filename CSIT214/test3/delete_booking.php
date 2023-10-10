<?php
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $index = $_POST['index'];

    $file_path = 'available_bookings.csv';
    $file = fopen($file_path, 'r');
    $bookings = [];

    while (($line = fgetcsv($file)) !== FALSE) {
        $bookings[] = $line;
    }
    fclose($file);

    if (isset($bookings[$index])) {
        array_splice($bookings, $index, 1);

        $file = fopen($file_path, 'w');
        foreach ($bookings as $booking) {
            fputcsv($file, $booking);
        }
        fclose($file);

        echo 'Successfully deleted booking';
    } else {
        echo 'Invalid booking index';
    }
} else {
    echo 'Invalid request';
}
?>
