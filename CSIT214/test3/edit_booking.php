<?php
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $index = $_POST['index'];
    $room_name = $_POST['room_name'];
    $room_type = $_POST['room_type'];
    $date = $_POST['date'];

    $file_path = 'available_bookings.csv';
    $file = fopen($file_path, 'r');
    $bookings = [];

    while (($line = fgetcsv($file)) !== FALSE) {
        $bookings[] = $line;
    }
    fclose($file);

    if (isset($bookings[$index])) {
        $bookings[$index] = [$room_name, $room_type, $date];

        $file = fopen($file_path, 'w');
        foreach ($bookings as $booking) {
            fputcsv($file, $booking);
        }
        fclose($file);

        echo 'Successfully updated booking';
    } else {
        echo 'Invalid booking index';
    }
} else {
    echo 'Invalid request';
}
?>
