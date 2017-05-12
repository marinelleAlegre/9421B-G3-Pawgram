<?php
include("auth.php");?>
<html>
	<head>
		<meta name = "viewport" content = "width=device-width, intial-scale: 1.0, user-scalable=0"/>
		<title>ADMIN | DASHBOARD</title>
		<link rel="stylesheet" href="css/dashboard.css" />
	</head>
	<body>
		<div id="header">
			<div class="logo"><a href="#">PAWGRAM</a></div>
			<p>Welcome <?php echo $_SESSION['username']; ?>!</p>
			<a href="logout.php">Logout</a>
		</div>

			<a class="mobile" href="#">MENU</a>

		<div id = "container">
			<div class = "sidebar">
				<ul id="nav">
					<li><a class = "selected" href="#">Dashboard</a></li>
					<li><a href="#">User Management</a></li>
					<li><a href="#">User Approval</a></li>
					<li><a href="#">Dashboard</a></li>
				</ul>
			</div>

			<div class="content">
				<h1>USER MANAGEMENT</h1>
				<p>Manage User</p>
				
				<div id="box">
					<div class="box-top">haha</div>
					<div class="box-panel">
						kcjankxbzj
					</div>
				</div>
		</div>
	<body>
</html>
