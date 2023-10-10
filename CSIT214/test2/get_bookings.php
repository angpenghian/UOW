<?php
$file_path = 'available_bookings.csv';
$file = fopen($file_path, 'r');
$bookings = [];

if ($file) {
    while (($row = fgetcsv($file)) !== FALSE) {
        $bookings[] = [
            'room_name' => $row[0],
            'room_type' => $row[1],
            'room_capacity' => $row[2],
            'room_price' => $row[3],
            'date' => $row[4]
        ];
    }
    fclose($file);
}

echo json_encode(array_slice($bookings, 1));  // Exclude header row
?>