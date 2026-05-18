<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII" isELIgnored = "false"%>
    
<html>
	<head>
		<title>My Student App</title>
	</head>
	<body>
		<h1>---Student App---</h1>
		<form action="std" method="GET">
			<label>Enter Rollno:-</label>
			<input type="text" name="rn">
			<input type="submit" value="Search">
		</form>
		
		<h1>${studentName}</h1>
		
	</body>
</html>
