<%@page import="com.utility.classes.ClientLoginBean" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

 <style media="screen">
 body {
   margin:  0;
   padding: 0;
  font-family: Arial, Helvetica, sans-serif;
  background-color: #f9f9f9;
 }
 .navbar {
  width: 100%;
  overflow: hidden;
  background-color: #333;
 }
 .navbar a {
  float: left;
  font-size: 16px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
 }
 .dropdown {
  float: left;
  overflow: hidden;
 }
 .dropdown .dropbtn {
  font-size: 16px;
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
 }
 .navbar a:hover, .dropdown:hover .dropbtn {
  background-color: red;
 }
 .dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
 }
 .dropdown-content a {
  float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
 }
 .dropdown-content a:hover {
  background-color: #ddd;
 }
 .dropdown:hover .dropdown-content {
  display: block;
 }
.welcome{
  text-align:center;
}
 </style>
</head>
<body>

<div class="navbar">
   <a href="#home">ParkingHub</a>
   <a href="#home">Client</a>
   <a href="VisitedSlotServlet">View Parking Slot</a>
   <a href="#" style="float:right;"> Contact</a>
</div>

 <p>You have successfully logged in!</p>
 <%
 ClientLoginBean bean = (ClientLoginBean)request.getAttribute("clientbean");
 out.print("Welcome: "+bean.getEmail());
 %>
 
<div class="welcome">
<h3>Welcome to parking hub </h3>
<p>parkinghub made it easy for you to park your car.</p>
</div>

</body>
</html>
