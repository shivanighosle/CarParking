package com.car.parking.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import EmailVarifications.SendMail;
import com.carparking.dao.*;

import com.utility.classes.*;
import com.carparking.dao.*;

@WebServlet("/ClientPanelServlet")
public class ClientPanelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected ClientFormFieldDao  clientFormFieldDao ;
	protected ClientFormFieldBean clientFormFieldbean;
	public void init() {
		clientFormFieldDao = new ClientFormFieldDao ();
		clientFormFieldbean = new ClientFormFieldBean();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("clientPanel.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{  
       response.setContentType("text/html"); 
       PrintWriter out1 = response.getWriter();  
               
        String YourName            = request.getParameter("yname");
        String YourEmail           = request.getParameter("email");
        String CarNum              = request.getParameter("cnumber");
        String CarColor            = request.getParameter("color");
        String in                  = request.getParameter("intime");  
        String out                 =  request.getParameter("outtime");
        String rate                = request.getParameter("rate");
        int r = Integer.parseInt(rate);
        
      //  ClientFormFieldBean ad = new ClientFormFieldBean();
       clientFormFieldbean.setYour_Name(YourName);
       clientFormFieldbean.setYour_email(YourEmail);
       clientFormFieldbean.setCar_number(CarNum);
       clientFormFieldbean.setCar_Color(CarColor);
       clientFormFieldbean.setIn_time(in);
       clientFormFieldbean.setOut_time(out);
       clientFormFieldbean.setRate(r);        
        
        try {
          int result = 	clientFormFieldDao.registerClientForm(clientFormFieldbean);
          if(result > 0) {
        	  out1.print("<h2>data inserted successfully  </h2> ");
      		  System.out.println("data inserted ");
      		try{
      			 System.out.println("email processing ");
      			 boolean test = SendMail.send(YourName,YourEmail,r);
      			
      			 System.out.println(test);
      			
      			 if(test) {
      				 out1.print("email send");
      				 response.sendRedirect("VisitedFloor.jsp");
      			 }
      			 else {
      				 out1.print("unable to send email");
      			 }
      		}catch(Exception e) {
      			e.printStackTrace();
      		}
          }
          else {
        	  out1.print("Unable to store data");
          }
        	
        } catch (Exception e) {
            e.printStackTrace();
            out1.print("<p>Already Available</p>");
        }
	}
  }
