package com.carparking.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.utility.classes.*;
import com.carparking.dao.*;

public class AdminLoginDao {
	  public boolean vaildate(AdminLoginBean bean)
	  {
	    boolean result = false;
	    Connection connection = AdminLoginDB.getConn();
	    String sql="select * from admin where email=? and password=?";
	    try {
	      PreparedStatement ps=connection.prepareStatement(sql);
	      ps.setString(1, bean.getEmail());
	      ps.setString(2, bean.getPassword());
	      ResultSet rs=ps.executeQuery();
	      result=rs.next();
	    } catch (SQLException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }  
	    return result;
	  }
}
