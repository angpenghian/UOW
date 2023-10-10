<?php
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $student_username = $_POST['student_username'];
    $file_path = 'booked_bookings.csv';
    $file = fopen($file_path, 'r');
    $bookings = [];

    while (($line = fgetcsv($file)) !== FALSE) {
        if ($line[3] == $student_username) {
            $bookings[] = [
                'room_name' => $line[0],
                'room_type' => $line[1],
                'date' => $line[2],
            ];
        }
    }

    fclose($file);
    echo json_encode($bookings);
} else {
    echo 'Invalid request';
}
?>
