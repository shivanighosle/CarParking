package com.car.parking.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.carparking.dao.ClientDao;
import com.utility.classes.*;

@WebServlet(urlPatterns = "/ClientLoginValidate")
public class ClientLoginValidate extends HttpServlet {

	private static final long serialVersionUID = 1L;
	protected ClientLoginBean clientbean;
	protected ClientDao clientdao;
	@Override
	public void init(){
		clientbean = new ClientLoginBean();
		clientdao = new ClientDao();
	}	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String uname    = request.getParameter("cemail");
		String password = request.getParameter("pass");
		
		clientbean.setEmail(uname);
		clientbean.setPassword(password);
		request.setAttribute("clientbean", clientbean);
		
		if(clientdao.clientLoginValidate(clientbean))
		 {
	        RequestDispatcher rs = request.getRequestDispatcher("clientPanel.jsp");
	        rs.forward(request, response);
	      }
	      else
	      {
	    	out.print("<h2>Email or Password Wrogn try agail</h2>");
	    	System.out.println("unable to login");
	    	 RequestDispatcher rs = request.getRequestDispatcher("clientlogin.jsp");
		     rs.forward(request, response);
		     rs.include(request, response);
	      }
   }
}
