<?php session_start(); ?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Teacher Page</title>
</head>
<body>

<h2>Create Room Booking</h2>

<form id="booking-form">
    <label for="room_name">Room Name:</label><br>
    <input type="text" id="room_name" name="room_name" required><br>
    <label for="room_type">Room Type:</label><br>
    <input type="text" id="room_type" name="room_type" required><br>
    <label for="date">Date:</label><br>
    <input type="date" id="date" name="date" required><br>
    <button type="button" onclick="createBooking()">Create Booking</button>
</form>

<h2>Available Bookings</h2> <!-- Header for Available Bookings -->

<div id="available-bookings">
    <!-- Available bookings will be populated here -->
</div>

<script>
    function createBooking() {
        const roomName = document.getElementById('room_name').value;
        const roomType = document.getElementById('room_type').value;
        const date = document.getElementById('date').value;

        fetch('process_booking.php', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded',
            },
            body: `room_name=${roomName}&room_type=${roomType}&date=${date}`,
        })
            .then(response => response.text())
            .then(data => {
                alert(data);
                loadAvailableBookings();
            });
    }

    function loadAvailableBookings() {
        fetch('get_bookings.php')
            .then(response => response.json())
            .then(data => renderAvailableBookings(data));
    }

    function renderAvailableBookings(data) {
    const bookingsDiv = document.getElementById('available-bookings');
    bookingsDiv.innerHTML = '';
    data.forEach((booking, index) => {
        const bookingDiv = document.createElement('div');
        bookingDiv.innerHTML = `
            <p>Room Name: ${booking.room_name}</p>
            <p>Room Type: ${booking.room_type}</p>
            <p>Date: ${booking.date}</p>
            <button onclick="editBooking(${index})">Edit</button>
            <button onclick="deleteBooking(${index})">Delete</button> <!-- Delete button -->
        `;
        bookingsDiv.appendChild(bookingDiv);
    });
}

    function editBooking(index) {
        const roomName = prompt("Enter new room name:");
        const roomType = prompt("Enter new room type:");
        const date = prompt("Enter new date (YYYY-MM-DD):");

        if (roomName && roomType && date) {
            fetch('edit_booking.php', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/x-www-form-urlencoded',
                },
                body: `index=${index}&room_name=${roomName}&room_type=${roomType}&date=${date}`,
            })
                .then(response => response.text())
                .then(data => {
                    alert(data);
                    loadAvailableBookings();
                });
        }
    }

    function deleteBooking(index) {
    fetch('delete_booking.php', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded',
        },
        body: `index=${index}`,
    })
        .then(response => response.text())
        .then(data => {
            alert(data);
            loadAvailableBookings();
        });
}

    // Initial load of available bookings
    loadAvailableBookings();

</script>

</body>
</html>
