<?php session_start(); ?>
<!DOCTYPE html>
<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatiable" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Teacher Page</title>
        <link rel="stylesheet" href="style.css" />
        <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
    </head>

    <body>
        <header class="header">
            <nav class="navbar">
                <a href="index2.html">Home</a>
                <a href="#about">About</a>
                <a href="#skills">Services</a>
                <a href="#projects">Contact</a>
            </nav>

            <form action="#" class="search-bar">
                <input type="text" placeholder="Search..." />
                <button type="submit"><i class='bx bx-search'></i></button>
            </form>
        </header>

        <div class="background"></div>
        <div class="container2">
            <h2>Create Room Booking</h2>

            <form id="booking-form">
                <label for="room_name">Room Name:</label><br>
                <input type="text" id="room_name" name="room_name" required><br>

                <label for="room_type">Room Type:</label><br>
                <input type="text" id="room_type" name="room_type" required><br>

                <label for="room_capacity">Room Capacity:</label><br>
                <input type="text" id="room_capacity" name="room_capacity" required><br>

                <label for="room_price">Room Price:</label><br>
                <input type="text" id="room_price" name="room_price" required><br>

                <label for="date">Date:</label><br>
                <input type="date" id="date" name="date" required><br>

                <button type="button" onclick="createBooking()">Create Booking</button>
            </form>

            <br/>
            <h2>Available Bookings</h2> <!-- Header for Available Bookings -->

            <div id="available-bookings"></div>

            <script>
                function createBooking() {
                    const roomName = document.getElementById('room_name').value;
                    const roomType = document.getElementById('room_type').value;
                    const roomCapacity = document.getElementById('room_capacity').value;
                    const roomPrice = document.getElementById('room_price').value;
                    const date = document.getElementById('date').value;

                    fetch('process_booking.php', {
                        method: 'POST',
                        headers: {
                            'Content-Type': 'application/x-www-form-urlencoded',
                        },
                        body: `room_name=${roomName}&room_type=${roomType}&room_capacity=${roomCapacity}&room_price=${roomPrice}&date=${date}`,
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
                        bookingDiv.className = 'booking-card'; // Assign the booking-card class
                        bookingDiv.innerHTML = `
                            <p>Room Name: ${booking.room_name}</p>
                            <p>Room Type: ${booking.room_type}</p>
                            <p>Room Capacity: ${booking.room_capacity}</p>
                            <p>Room Price: ${booking.room_price}</p>
                            <p>Date: ${booking.date}</p>
                            <button onclick="editBooking(${index})">Edit</button>
                            <button onclick="deleteBooking(${index})">Delete</button>
                        `;
                        bookingsDiv.appendChild(bookingDiv);
                    });
                }


                function editBooking(index) {
                    const roomName = prompt("Enter new room name:");
                    const roomType = prompt("Enter new room type:");
                    const roomCapacity = prompt("Enter new room capacity:");
                    const roomPrice = prompt("Enter new room price:");
                    const date = prompt("Enter new date (YYYY-MM-DD):");

                    if (roomName && roomType && roomCapacity && roomPrice && date) {
                        fetch('edit_booking.php', {
                            method: 'POST',
                            headers: {
                                'Content-Type': 'application/x-www-form-urlencoded',
                            },
                            body: `index=${index}&room_name=${roomName}&room_type=${roomType}&room_capacity=${roomCapacity}&room_price=${roomPrice}&date=${date}`,
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
        </div>
    </body>
</html>