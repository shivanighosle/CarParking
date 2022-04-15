package com.admin.add.parking.slot;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utility.classes.Slot;

@WebServlet("/EditParkingSlotServlet")
public class EditParkingSlotServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public EditParkingSlotServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
        PrintWriter out=response.getWriter();  
        out.println("<h1>Update/Edit availabel slot</h1>");  
        String sid = request.getParameter("no");  
        int no = Integer.parseInt(sid);  
          
        Slot e = SLotDao.getEmployeeById(no);  
          
        out.print("<form action='EditParkingSlotServlet2' method='post'>");  
        out.print("<table border=5 width=20% height=20%>");  
        out.print("<tr><td> <td><input type='hidden' name='no' value='"+e.getNo()+"'/>                     </td></tr>");  
        out.print("<tr><td> Slot No:     </td><td> <input type='text' name='slotno' value='"+e.getSlotno()+"'/>         </td></tr>");  
        out.print("<tr><td> Total Floor: </td><td> <input type='text' name='totalfloor' value='"+e.getTotalfloor()+"'/> </td></tr>");
        out.print("</td></tr>");  
        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");  
        out.print("</table>");  
        out.print("</form>");  
          
        out.close();  
    }  
	/*
	 * protected void doPost(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { // TODO Auto-generated
	 * method stub doGet(request, response); }
	 */

}
