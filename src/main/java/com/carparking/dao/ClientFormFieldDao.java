package com.carparking.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.admin.add.parking.slot.SLotDao;
import com.utility.classes.*;
import com.utility.classes.*;
import connectivity.mysql.connectionGet;

public class ClientFormFieldDao {
	public int registerClientForm(ClientFormFieldBean  client) throws ClassNotFoundException {
       final String INSERT_USERS_SQL = "INSERT INTO client_form_field(Client_Key,your_name, your_email, car_number, car_color, in_time, out_time, rate) VALUES(?,?,?,?,?,?,?,?)";

        int result = 0;
        try {
        	    Connection conn = connectionGet.getcon();
        		PreparedStatement   stmt = conn.prepareStatement(INSERT_USERS_SQL);
        	    stmt.setInt(1, 101);
        	    stmt.setString(2, client.getYour_Name());
        	    stmt.setString(3, client.getYour_email());
        		stmt.setString(4, client.getCar_number());
        		stmt.setString(5, client.getCar_Color());
        		stmt.setString(6, client.getIn_time());
        		stmt.setString(7, client.getOut_time());
        		stmt.setInt(8,    client.getRate());
 
            System.out.println(stmt);
            // Step 3: Execute the query or update query
            result = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
// view availabe parking floor
	  public static List<Slot> getAllAvailableParkingFloor(){  
	        List<Slot> list=new ArrayList<Slot>();  
	          
	        try{  
	            Connection con = connectionGet.getcon();  
	            PreparedStatement ps=con.prepareStatement("select NO, SLOTNO from addparkingslot;");  
	            ResultSet rs=ps.executeQuery();  
	            while(rs.next()){  
	                Slot e=new  Slot();   
	                e.setNo(rs.getInt(1));
	                e.setSlotno(rs.getInt(2));    
	                list.add(e);  
	            }  
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}  
	          
	        return list;  
	    }

	// view availabe or empty parking slot
		  public static Slot getAllAvailableParkingSlot(int slotno){  
		        Slot e1 = new Slot();
		          
		        try{  
		            Connection con = connectionGet.getcon();  
		            PreparedStatement ps=con.prepareStatement("select TOTALFLOOR from addparkingslot where SLOTNO = ?;");  
		            ps.setInt(1,slotno);
		            ResultSet rs=ps.executeQuery();  
		            if(rs.next()){     
		            	e1.setTotalfloor(rs.getInt(1));  
		            }  
		            con.close();  
		        }catch(Exception e){
		          e.printStackTrace();
		          }
		        return  e1;  
		    }
}
