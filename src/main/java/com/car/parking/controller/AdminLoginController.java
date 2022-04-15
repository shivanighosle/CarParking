package com.car.parking.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carparking.dao.AdminLoginDao;
import com.utility.classes.*;

@WebServlet("/AdminLoginController")
public class AdminLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public AdminLoginController() {
		super();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		  response.setContentType("text/jsp");
	      String uname=request.getParameter("email");
	      String pass=request.getParameter("psw");
	      
	      AdminLoginBean adminLoginBean=new AdminLoginBean();
	      AdminLoginDao dao=new AdminLoginDao();
	      
	      adminLoginBean.setEmail(uname);
	      adminLoginBean.setPassword(pass);
	      
	      if(dao.vaildate(adminLoginBean))
	      {
	        response.sendRedirect("AdminPanel.jsp");
	      }
	      else
	      {
	        response.sendRedirect("adminlogin.jsp");
	      }
	  }
	}
