<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Pawgram | Sign Up</title>
		<link rel="stylesheet" href="styles/style.css" type="text/css" />
	</head>
<body>
<?php
	require('database.php');

    // If form submitted, insert values into the database.
    if (isset($_REQUEST['lastName'])){
    	$lastName = stripslashes($_REQUEST['lastName']);
    	$lastName = mysqli_real_escape_string($con,$lastName);
    	$firstName = stripslashes($_REQUEST['firstName']);
    	$firstName = mysqli_real_escape_string($con,$firstName);
		$username = stripslashes($_REQUEST['username']); // removes backslashes
		$username = mysqli_real_escape_string($con,$username); //escapes special characters in a string
		$password = stripslashes($_REQUEST['password']);
		$password = mysqli_real_escape_string($con,$password);
		$email = stripslashes($_REQUEST['email']);
		$email = mysqli_real_escape_string($con,$email);
		$birthDate = stripslashes($_REQUEST['birthDate']);
		$birthDate = mysqli_real_escape_string($con,$birthDate);
		$gender = stripslashes($_REQUEST['gender']);
		$gender = mysqli_real_escape_string($con,$gender);
		$address = stripslashes($_REQUEST['address']);
		$address = mysqli_real_escape_string($con,$address);
		$contactNumber = stripslashes($_REQUEST['contactNumber']);
		$contactNumber = mysqli_real_escape_string($con,$contactNumber);
        $query = "INSERT into `register` (lastName, firstName, username, password, email, birthDate, gender, contactNumber, address) VALUES ('$lastName', '$firstName', $username', '".md5($password)."', '$email', '$birthDate', '$gender', '$contactNumber', '$address')";
        $result = mysqli_query($con,$query);
        if($result){
            echo "<div class='form'><h3>You are registered successfully.</h3><br/>Click here to <a href='login.php'>Login</a></div>";
        }
    }else{
?>
<div class="form">
	<h1>Sign Up</h1>
	<form name="register" action="" method="post">
		<input type="text" name="lastName" placeholder="Lastname" required />
		<input type="text" name="firstName" placeholder="Firstname" required />
		<input type="text" name="username" placeholder="Username" required />
		<input type="password" name="password" placeholder="Password" required />
		<input type="email" name="email" placeholder="Email" required />
		<input type="text" name="birthDate" placeholder="Birthday" required />
		<input type="text" name="gender" placeholder="Gender" required />
		<input type="text" name="address" placeholder="Address" required />
		<input type="text" name="contactNumber" placeholder="Contact Number" required />
		<input type="submit" name="submit" value="Register" />
	</form>
</div>
<?php } ?>
</body>
</html>
