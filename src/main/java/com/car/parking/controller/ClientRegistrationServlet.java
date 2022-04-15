package com.car.parking.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.carparking.dao.ClientFormFieldDao;
import com.utility.classes.*;
import com.carparking.dao.*;

@WebServlet(urlPatterns = "/ClientRegistrationServlet")
public class ClientRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    private ClientRegistrationDao clientDao;
    private Client ad = null;
	public void init() {
        clientDao = new ClientRegistrationDao();
        ad = new Client();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        PrintWriter out = response.getWriter();
        String firstName     = request.getParameter("name");
        String lastRole      = request.getParameter("role");
        String clientEmail   = request.getParameter("email");
        String password      = request.getParameter("password");

       // Client ad = new Client();
        ad.setName(firstName);
        ad.setRole(lastRole);
        ad.setEmail(clientEmail);
        ad.setPassword(password);

        try {
          int result =   ClientRegistrationDao.registerClient(ad);
          
          if(result > 0) {
        	  System.out.println("data inserted successfully");
        	  response.sendRedirect("clientlogin.jsp");
        	 
          }
          else {
        	  System.out.println("unable to fetch the data");
        	  response.sendRedirect("clientregistration.jsp");
        	  out.print("Unable to login Please try again!!");
          }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
}
