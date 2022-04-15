package com.admin.add.parking.slot;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utility.classes.Slot;

@WebServlet("/SaveParkingSlotServlet")
public class SaveParkingSlotServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("AdminPanel.jsp");
		dispatcher.forward(request, response);
		//response.sendRedirect(getServletInfo())
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
		PrintWriter out=response.getWriter();  

		String slotnoo     =    request.getParameter("slotno"); 
		int slotn          = Integer.parseInt(slotnoo);

		String totalfloo =    request.getParameter("totalfloor");  
		int totalflor = Integer.parseInt(totalfloo);

		Slot e=new Slot();    
		e.setSlotno(slotn);  
		e.setTotalfloor(totalflor);  

		int status = SLotDao.save(e);  
		if(status>0){  
			out.print("<p>Record saved successfully!</p>");  
			request.getRequestDispatcher("AdminPanel.jsp").include(request, response);  
		}else{  
			out.println("Sorry! unable to save record bcz floor are full");  
		}  
		out.close();  
	}  

}
