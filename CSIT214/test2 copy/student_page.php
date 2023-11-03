<?php session_start(); ?>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Page</title>
    <link rel="stylesheet" href="style.css" />
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
</head>
<body>

<header class="header">
    <nav class="navbar">
        <a href="index2.html#home">Home</a>
        <a href="#about">About</a>
        <a href="#services">Services</a>
        <a href="#contact">Contact</a>
    </nav>

    <form action="#" class="search-bar">
        <input type="text" placeholder="Search..." />
        <button type="submit"><i class='bx bx-search'></i></button>
    </form>
</header>

<div class="background"></div>
<div class="container2">
    <input type="hidden" id="username" value="<?php echo htmlspecialchars(isset($_SESSION['username']) ? $_SESSION['username'] : '', ENT_QUOTES, 'UTF-8'); ?>">

    <h2>Available Room Bookings</h2> <!-- Header for available bookings -->
    <div id="available-bookings">
        <!-- Available bookings will be populated here -->
    </div>

    <h2>Your Bookings</h2> <!-- Header for your bookings -->
    <div id="your-bookings">
        <!-- Your bookings will be populated here -->
    </div>
</div>

<script>
    const username = document.getElementById('username').value;  // Retrieve username from hidden input field

    // Load available bookings and display them
    function loadBookings() {
        fetch('get_bookings.php')
            .then(response => response.json())
            .then(data => renderBookings(data, 'available-bookings'));
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
            bookingDiv.className = 'booking-card';  // Apply styling to each booking
            bookingDiv.innerHTML = `
                <p>Room Name: ${booking.room_name}</p>
                <p>Room Type: ${booking.room_type}</p>
                <p>Room Capacity: ${booking.room_capacity}</p>
                <p>Room Price: ${booking.room_price}</p>
                <p>Date: ${booking.date}</p>
                ${elementId === 'available-bookings' ? `<button onclick="bookRoom(${index})">Book Room</button>` : `<button onclick="cancelBooking(${index})">Cancel Booking</button>`}
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

    // New function to cancel a booking
    function cancelBooking(index) {
        fetch('cancel_booking.php', {
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
