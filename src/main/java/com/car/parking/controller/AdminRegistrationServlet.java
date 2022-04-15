 package com.car.parking.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carparking.dao.AdminRegistrationDao;
import com.utility.classes.*;

@WebServlet(urlPatterns="/AdminRegistrationServlet")
public class AdminRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private AdminRegistrationDao admindao;
	
	public void init() {
		admindao = new AdminRegistrationDao();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

     String name = request.getParameter("name");
     String role = request.getParameter("role");
     String email = request.getParameter("email");
     String pass = request.getParameter("password");
     
     Admin admin = new Admin();
     admin.setName(name);
     admin.setRole(role);
     admin.setEmail(email);
     admin.setPassword(pass);
     
     try {
		AdminRegistrationDao.registerAdmin(admin);
	} catch (Exception e) {
		e.printStackTrace();
	}
     response.sendRedirect("adminlogin.jsp");
	}
}
