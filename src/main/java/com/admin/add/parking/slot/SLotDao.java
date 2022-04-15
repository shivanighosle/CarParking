package com.admin.add.parking.slot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.utility.classes.Slot;

import connectivity.mysql.connectionGet;

class FloorOverFlowException  extends Exception  
{
	private static final long serialVersionUID = 1L;
	public  FloorOverFlowException (String str)  
    {    
        super(str);  
    }  
} 
public class SLotDao { 
    public static int save(Slot e){  
        int status=0;  
        try{  
            Connection con= connectionGet.getcon();  
            PreparedStatement ps=con.prepareStatement("insert into addParkingSlot(NO,SLOTNO,TOTALFLOOR) values (?,?,?)");  
            ps.setInt(1, e.getNo());  
            ps.setInt(2,e.getSlotno());  
            ps.setInt(3,e.getTotalfloor());    
            	 if(e.getSlotno() <=10) {
            		    status=ps.executeUpdate(); 
                 }
            	 else {
            		 throw new FloorOverFlowException("Floor overflow");
            	 }
              
            con.close();  
        }
        catch(Exception ex)
        {
        	ex.printStackTrace();
        }    
        return status;  
    }  
    
    public static int update(Slot e){  
        int status=0;  
        try{  
            Connection con = connectionGet.getcon();  
            PreparedStatement ps = con.prepareStatement("update addParkingSlot set SLOTNO=?, TOTALFLOOR=? where NO=?");  
             
            ps.setInt(1,e.getSlotno());  
            ps.setInt(2,e.getTotalfloor()); 
            ps.setInt(3,e.getNo()); 
              
            status = ps.executeUpdate();     
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    
    public static int delete(int n){  
        int status=0;  
        try{  
            Connection con= connectionGet.getcon();  
            PreparedStatement ps=con.prepareStatement("delete from addParkingSlot where No=?");  
            ps.setInt(1,n);  
            status=ps.executeUpdate();   
            con.close();  
        }catch(Exception e){
        	e.printStackTrace();
        }      
        return status;  
    }  
    
    public static Slot getEmployeeById(int NO){  
        Slot e = new Slot();  
          
        try{  
            Connection con= connectionGet.getcon();  
            PreparedStatement ps=con.prepareStatement("select * from addParkingSlot where NO=?");  
            ps.setInt(1,NO);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                e.setNo(rs.getInt(1));  
                e.setSlotno(rs.getInt(2));  
                e.setTotalfloor(rs.getInt(3));  
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
    }  
    
    public static List<Slot> getAllEmployees(){  
        List<Slot> list=new ArrayList<Slot>();  
          
        try{  
            Connection con = connectionGet.getcon();  
            PreparedStatement ps=con.prepareStatement("select * from addParkingSlot");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Slot e=new  Slot();  
                e.setNo(rs.getInt(1));  
                e.setSlotno(rs.getInt(2));  
                e.setTotalfloor(rs.getInt(3));  
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){
           e.printStackTrace();
        }    
        return list;  
    }  
	
}
