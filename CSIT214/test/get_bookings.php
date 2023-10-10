<?php
$filename = 'available_bookings.csv';
$file = fopen($filename, 'r');
fgetcsv($file);  // Skip header row
$bookings = [];
while (($data = fgetcsv($file)) !== FALSE) {
    $bookings[] = [
        'room_name' => $data[0],
        'room_type' => $data[1],
        'date' => $data[2]
    ];
}
fclose($file);
echo json_encode($bookings);
?>
