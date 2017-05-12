<?php
include("auth.php");?>
<html>
	<head>
		<meta name = "viewport" content = "width=device-width, intial-scale: 1.0, user-scalable=0"/>
		<title>ADMIN | DASHBOARD</title>
		<link rel="stylesheet" href="styles/dashboard.css" />
		<script type="text/javascript" src="js/slideDown.js"></script>
	</head>
	<body>
		<div id="header">
			<div class="logo"><a href="#">PAWGRAM</a></div>
			<p>Welcome <?php echo $_SESSION['username']; ?>!</p>
			<a href="logout.php">Logout</a>
		</div>

			<a class="mobile" href="#">MENU</a>

		<div id = "container">
			<div class = "sidebar menu">
				<ul id="nav">
					<li><a href="#dashboard">Dashboard</a></li>
					<li><a href="#userApproval">User Approval</a></li>
					<li><a href="#userManagement">User Management</a></li>
					<li><a href="#transactionMonitoring">Transaction Monitoring</a></li>
				</ul>
			</div>
		</div>

			<div class="content">
				<div id="dashboard" class="fade">
					<h1>Dashboard</h1>
					<p>Manage User</p>

					<div id="box">
						<div class="box-top">haha</div>
						<div class="box-panel">
							kcjankxbzj
						</div>
					</div>

					<div id="box">
						<div class="box-top">haha</div>
						<div class="box-panel">
							kcjankxbzj
						</div>
					</div>
				</div>
		</div>
	</body>
</html>
