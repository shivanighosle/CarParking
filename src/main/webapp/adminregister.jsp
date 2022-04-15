<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for all buttons */
button {
  background-color: blue;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

button:hover {
  opacity:1;
}

/* Extra styles for the cancel button */
/* .cancelbtn {
  padding: 14px 20px;
  background-color: #f44336;
  margin-left: 10px;
} */

/* Float cancel and signup buttons and add an equal width */
.signupbtn {
  float: left;
  background-color: #f44336;
  width: 100%;
}

/* Add padding to container elements */
.container {
  padding: 16px;
  margin-bottom: 200px;
}

/* Clear floats */
.clearfix::after {
  content: "";
  clear: both;
  display: table;
}
/* Don't have account sign up here*/

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
  .signupbtn {
     width: 100%;
  }
}
</style>
<meta charset="ISO-8859-1">
<title>SignUp Here</title>
</head>

<body>
<form action="<%= request.getContextPath() %>/AdminRegistrationServlet" method="post">
  <div class="container">
    <h1>SignUp Here</h1>
    <p>Please fill in this form for Registration.</p>
    <hr>

    <label for="email"><b> Your Name </b></label>
    <input type="text" placeholder="Enter Name" name="name" required />

    <label for="email"><b> Your Role </b></label>
    <input type="text" placeholder="Enter Role" name="role" required />

    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" required />

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required />

    <div class="clearfix">
      <button type="submit" class="signupbtn">Submit</button>
    </div>
  </div>
</form>
</body>
</html>
