<?php
$file_path = 'available_bookings.csv';
$file = fopen($file_path, 'r');
$bookings = [];

while (($line = fgetcsv($file)) !== FALSE) {
    $bookings[] = [
        'room_name' => $line[0],
        'room_type' => $line[1],
        'date' => $line[2],
    ];
}

fclose($file);
echo json_encode($bookings);
?>
