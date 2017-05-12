<?php
include("auth.php");?>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome Home</title>
		<link rel="stylesheet" href="css/dashboard.css" />
	</head>
	<body>
		<div id="nav">
		<p>Welcome <?php echo $_SESSION['username']; ?>!</p>
		<a href="logout.php">Logout</a>
		</div>
		<div id = "container">
			<div class="sidebar">
				<ul id = "nav">
					<li><a class="active" href="userApproval.php">User Approval</a></li>
					<li><a href="userManagement.php">User Management</a></li>
					<li><a href="transactionMonitoring.php">Transaction Monitoring</a></li>
				</ul>
			</div>

			<div id = "box">
				<div class = "box-top"></div>
			</div>
	</body>
</html>
