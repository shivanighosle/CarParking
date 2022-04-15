<%@page import="java.util.*,com.utility.classes.*,com.carparking.dao.ClientFormFieldDao" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <style>
   a:visited{
   color:red;
   }
   table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 15px;
}
.column {
  float: left;
  width: 15%;
  padding: 30px;
  font-size:40px;
  backgroud-color: #778899;
}
.column img:hover {
  opacity: 1;
}
 </style>
</head>
<body>
   <h1>Available Parking Slot's List</h1>  
   
           <c:forEach end="${totalfloor}" var="u" begin="1">
               <div class="column"><a href="FormField.html?floor=${u}"  class="btn-disabled" disabled="disabled">${u}</a></div>
          </c:forEach> 
</body>
</html>