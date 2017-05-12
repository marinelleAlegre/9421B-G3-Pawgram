<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Registration</title>
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
<?php
	require('db.php');
    // If form submitted, insert values into the database.
    if (isset($_REQUEST['username'])){
		$username = stripslashes($_REQUEST['username']); // removes backslashes
		$username = mysqli_real_escape_string($con,$username); //escapes special characters in a string
		$email = stripslashes($_REQUEST['email']);
		$email = mysqli_real_escape_string($con,$email);
		$password = stripslashes($_REQUEST['password']);
		$password = mysqli_real_escape_string($con,$password);
        $lastName = stripslashes($_REQUEST['lastName']);
        $lastName = mysqli_real_escape_string($con,$lastName);
        $firstName = stripslashes($_REQUEST['firstName']);
        $firstName = mysqli_real_escape_string($con,$firstName);
        $address = stripslashes($_REQUEST['address']);
        $address = mysqli_real_escape_string($con,$address);
        $age = stripslashes($_REQUEST['age']);
        $age = mysqli_real_escape_string($con,$age);
        $contactNumber = stripslashes($_REQUEST['contactNumber']);
        $contactNumber = mysqli_real_escape_string($con,$contactNumber);

		$registrationDate = date("Y-m-d");
        $query = "INSERT into `registration` (lastName, firstName, username, password, email, age, address, contactNumber)
        VALUES ('$lastName','$firstName', '$username', '".md5($password)."', '$email', '$age', '$address', '$contactNumber')";
        $result = mysqli_query($con,$query);
        if($result){
            echo "<div class='form'><h3>You are registered successfully.</h3><br/>Click here to <a href='login.php'>Login</a></div>";
        }
    }else{
?>
<div class="form">
<h1>Registration</h1>
    <form name="registration" action="" method="post">
        <input type="text" name="lastName" placeholder="Lastname" required />
        <input type="text" name="firstName" placeholder="Firstname" required />
        <input type="text" name="username" placeholder="Username" required />
        <input type="password" name="password" placeholder="Password" required />
        <input type="email" name="email" placeholder="Email" required />
        <input type = "text" name="address" placeholder="Address" required />
        <input type = "tel" name="contactNumber" placeholder="Contact Number" required />
        <input type = "text" name="age" placeholder="Age" required />
        <input type="submit" name="submit" value="Register" />
    </form>
</div>
<?php } ?>
</body>
</html>
