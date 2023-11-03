<?php
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $student_username = $_POST['student_username'];
    $file_path = 'booked_bookings.csv';
    $file = fopen($file_path, 'r');
    $bookings = [];

    while (($line = fgetcsv($file)) !== FALSE) {
        if ($line[5] == $student_username) {
            $bookings[] = [
                'room_name' => $line[0],
                'room_type' => $line[1],
                'room_capacity' => $line[2],
                'room_price' => $line[3],
                'date' => $line[4],
            ];
        }
    }

    fclose($file);
    echo json_encode($bookings);
} else {
    echo 'Invalid request';
}
?>
