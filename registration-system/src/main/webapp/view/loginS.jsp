<!DOCTYPE html>
<html>
<head>
<title>Staff login Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="css/styleLogin.css" rel="stylesheet" type="text/css" media="all" />
<!-- //Custom Theme files -->
<!-- web font -->
<link href="//fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,700,700i" rel="stylesheet">
<!-- //web font -->
</head>
<body>
	<!-- main -->
	<div class="main-w3layouts wrapper">
        <h1>STAFF</h1>
		<h1> Login Form</h1>
		<div class="main-agileinfo">
			<div class="agileits-top">
				<form action="LoginServlet" method="post">
					<input class="text" type="test" name="username" placeholder="Username" required="">
					
					<input class="text" type="password" name="password" placeholder="Password" required="">
					
					<div class="wthree-text">
						<label class="anim">
							<input type="checkbox" class="checkbox" required="">
							<span>I Agree To The Terms & Conditions</span>
						</label>
						<p><a href="signupS.html"> Back to Homepage</a></p>
						<div class="clear"> </div>
					</div>
					<input type="submit" value="LOG IN">
				</form>
				<p>Don't have an Account? <a href="signupS.html"> Sign up Now!</a></p>
			</div>
		</div>
		
		<ul class="colorlib-bubbles">
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
		</ul>
	</div>
	<!-- //main -->
</body>
</html>