<%@page  import="com.admin.add.parking.slot.ViewAvailableParkingSlotServlet" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
 <style type="text/css">
body {
 margin:  0;
 padding: 0;
font-family: Arial, Helvetica, sans-serif;
background-color: #f9f9f9;
}

input[type=text], select {
 width: 100%;
 padding: 12px 20px;
 margin: 8px 0;
 display: inline-block;
 border: 1px solid #ccc;
 border-radius: 4px;
 box-sizing: border-box;
}

input[type=submit] {
 width: 100%;
 background-color: #4CAF50;
 color: white;
 padding: 14px 20px;
 margin: 8px 0;
 border: none;
 border-radius: 4px;
 cursor: pointer;
}

input[type=submit]:hover {
 background-color: #45a049;
}

.addform {
 width: 50%;
 height: 100%;
 border-radius: 5px;
 background-color: #f2f2f2;
 padding: 2% 20px 0;
 margin: auto;
}
<style type="text/css">
    .btn-disabled[disabled] {
  opacity: .4;
  cursor: default !important;
  pointer-events: none;
}
</style>
</head>
<body>

<div class="addform">
  <form action="cliendPanel.jsp" method="post">
     <h3>Fill this form for parking slot</h3>

		<label for="fname">YourName</label>
		<input type="text" id="fname" name="yname" placeholder="Enter Name">
        
        <label for="Email">YourEmail</label>
		<input type="text" id="fname" name="email" placeholder="Enter Email">
		
		<label for="Cnumber">CarNumber</label>
		<input type="text" id="lname" name="cnumber" placeholder="Enter Car Number">

		<label for="Color">CarColor</label>
		<input type="text" id="lname" name="color" placeholder="Enter Car Color">
		<br> <br>

		<label for="Intime">InTime</label>
		<input type="text" id="lname" name="intime" placeholder="In Time">

		<label for="OutTime">OutTime</label>
		<input type="text" id="lname" name="outtime" placeholder="Out Time">
		<br> <br>
		<label for="Rate">Price</label>
		<input type="number" id="lname" name="rate" placeholder="Price">

		<input type="submit" value="Add">
	</form>
  </div>
</body>
</html>