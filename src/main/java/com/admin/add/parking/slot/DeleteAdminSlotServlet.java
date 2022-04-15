package com.admin.add.parking.slot;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/DeleteAdminSlotServlet")
public class DeleteAdminSlotServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DeleteAdminSlotServlet() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	   String sid = request.getParameter("no");
	   int no = Integer.parseInt(sid);
	   
	   SLotDao.delete(no);
	   response.sendRedirect("ViewAvailableParkingSlotServlet");
	}
}
