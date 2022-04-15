package com.admin.add.parking.slot;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utility.classes.Slot;
import com.carparking.dao.*;

@WebServlet(urlPatterns="/VisitedFloorServlet")
public class VisitedFloorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  	
		int floorno = Integer.parseInt(request.getParameter("slot"));
		Slot list = ClientFormFieldDao.getAllAvailableParkingSlot(floorno);
        
		int totalfloor = list.getTotalfloor();
		request.setAttribute("totalfloor", totalfloor);
	    request.getRequestDispatcher("VisitedFloor.jsp").forward(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
}
