<?php
$student_username = $_POST['student_username'];

$filename = 'booked_bookings.csv';
$file = fopen($filename, 'r');
$bookings = [];
while (($data = fgetcsv($file)) !== FALSE) {
    if ($data[3] == $student_username) {
        $bookings[] = [
            'room_name' => $data[0],
            'room_type' => $data[1],
            'date' => $data[2]
        ];
    }
}
fclose($file);
echo json_encode($bookings);
?>
