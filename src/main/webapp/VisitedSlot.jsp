<%@page import="java.util.*,com.carparking.dao.ClientFormFieldDao,com.utility.classes.Slot" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<%@ taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core"  %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Visited slot</title>
</head>
<body>
   <h1>Available Parking Floor List</h1>

   <table border="1" Width="90%" align="center">
      <tr> <th>Sr.NO</th> <th>FloorNo</th> <th>Availabiity</th> </tr>
      
          <p:forEach items="${list}" var="u">
              <tr><td>${u.no}</td><td>${u.slotno}</td><td><a href="/jsp-servlet-jdbc-mysql-example/VisitedFloorServlet?slot=${u.slotno}">viewfloor</a></td></tr>
          </p:forEach>
   </table>
</body>
</html>