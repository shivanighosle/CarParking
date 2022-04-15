package com.admin.add.parking.slot;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utility.classes.Slot;

@WebServlet("/EditParkingSlotServlet2")
public class EditParkingSlotServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public EditParkingSlotServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		    response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	          
	        String sid=request.getParameter("no");  
	        int no=Integer.parseInt(sid);  
	        
	        String slotNo=request.getParameter("slotno");  
	        int slotno=Integer.parseInt(slotNo);
	        
	        String totalFloor=request.getParameter("totalfloor");
	        int totalflor =Integer.parseInt(totalFloor);
	          
	        Slot e=new Slot();  
	        
	        e.setNo(no);  
	        e.setSlotno(slotno);  
	        e.setTotalfloor(totalflor); 
	          
	        int status = SLotDao.update(e);  
	        if(status>0){  
	            response.sendRedirect("ViewAvailableParkingSlotServlet");  
	        }else{  
	            out.println("Sorry! unable to update record");  
	        }  
	          
	        out.close();  
	    }  
	}