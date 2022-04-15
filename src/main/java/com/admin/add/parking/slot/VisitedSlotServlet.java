package com.admin.add.parking.slot;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.utility.classes.Slot;
import com.carparking.dao.*;

@WebServlet(urlPatterns="/VisitedSlotServlet")
public class VisitedSlotServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			List<Slot> list = ClientFormFieldDao.getAllAvailableParkingFloor();
			request.setAttribute("list", list);
			request.getRequestDispatcher("VisitedSlot.jsp").forward(request, response);
		}
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}
