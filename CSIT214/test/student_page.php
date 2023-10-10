<?php session_start(); ?>  <!-- Start the session at the top of the file -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Page</title>
</head>
<body>

<input type="hidden" id="username" value="<?php echo htmlspecialchars($_SESSION['username'], ENT_QUOTES, 'UTF-8'); ?>">

<div id="booking-list">
    <!-- Available bookings will be populated here -->
</div>

<div id="your-bookings">
    <!-- Your bookings will be populated here -->
</div>

<script>
    const username = document.getElementById('username').value;  // Retrieve username from hidden input field

    // Load available bookings and display them
    function loadBookings() {
        fetch('get_bookings.php')
            .then(response => response.json())
            .then(data => renderBookings(data, 'booking-list'));
    }

    // Load bookings made by the student and display them
    function loadYourBookings() {
        fetch('get_student_bookings.php', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded',
            },
            body: `student_username=${username}`,
        })
            .then(response => response.json())
            .then(data => renderBookings(data, 'your-bookings'));
    }

    // Generic function to render bookings
    function renderBookings(data, elementId) {
        const bookingsDiv = document.getElementById(elementId);
        bookingsDiv.innerHTML = '';
        data.forEach((booking, index) => {
            const bookingDiv = document.createElement('div');
            bookingDiv.innerHTML = `
                <p>Room Name: ${booking.room_name}</p>
                <p>Room Type: ${booking.room_type}</p>
                <p>Date: ${booking.date}</p>
                ${elementId === 'booking-list' ? `<button onclick="bookRoom(${index})">Book Room</button>` : ''}
            `;
            bookingsDiv.appendChild(bookingDiv);
        });
    }

    // Book a room and refresh the list of available bookings
    function bookRoom(index) {
        fetch('book_room_student.php', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded',
            },
            body: `index=${index}&student_username=${username}`,
        })
            .then(response => response.text())
            .then(data => {
                alert(data);
                loadBookings();
                loadYourBookings();
            });
    }

    // Initial load of bookings
    loadBookings();
    loadYourBookings();

</script>

</body>
</html>
