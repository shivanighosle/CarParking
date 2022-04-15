package com.admin.add.parking.slot;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utility.classes.Slot;

@WebServlet("/ViewAvailableParkingSlotServlet")
public class ViewAvailableParkingSlotServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ViewAvailableParkingSlotServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	        out.println("<a href='SaveParkingSlotServlet'>Add New Slot</a>");  
	        out.println("<h1>Available OR Empty slot list</h1>");  
	          
	        List<Slot> list=SLotDao.getAllEmployees();  
	          
	        out.print("<table border='5' width='100%'");  
	        out.print("<tr> <th>Id</th> <th>Totalfloor</th> <th>SlotNo</th> <th>Edit</th> <th>Delete</th></tr>");  
	        
	        for(Slot e:list) 
	        {  
	         out.print(" <tr> <td>"+e.getNo()+"</td> <td>"+e.getSlotno()+"</td> <td>"+e.getTotalfloor()+"</td> <td><a href='EditParkingSlotServlet?no="+e.getNo()+"'>edit</a></td> <td><a href='DeleteAdminSlotServlet?no="+e.getNo()+"'>delete</a></td> </tr>");  
	        }  
	        out.print("</table>");       
	        out.close();  
	    }  
}
