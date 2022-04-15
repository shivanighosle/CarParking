package com.carparking.dao;

import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import com.utility.classes.*;
import com.carparking.dao.*;
import com.utility.classes.*;
import connectivity.mysql.connectionGet;

public class ClientDao {  
	static final  String sql="select * from client_registration where client_email=? and client_password=?";
	 public static  boolean vaildate(ClientLoginBean bean)
	  {
	    boolean result = false;
	   
	    try {
	      Connection connection = AdminLoginDB.getConn();
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
	   
	    //client login varification start from here
     public boolean clientLoginValidate(ClientLoginBean clientbean) {
		    boolean result = false;
		   
		    String sql="select * from  client_registration where client_email=? and client_password=?";
		    try {
		      Connection connection = AdminLoginDB.getConn();
		      PreparedStatement ps=connection.prepareStatement(sql);
		      ps.setString(1, clientbean.getEmail());
		      ps.setString(2, clientbean.getPassword());
		      ResultSet rs=ps.executeQuery();
		      result=rs.next();
		    } catch (SQLException e) {
		      // TODO Auto-generated catch block
		      e.printStackTrace();
		    }  
		    return result;
		 }
     public static int registerClient(Client  client){
         final String SQL = "insert into  client_registration(client_name, client_role, client_email, client_password) VALUES(?, ?, ?, ?)";

          int result = 0;
          try {
          		Connection connection = connectionGet.getcon();
          		PreparedStatement   stmt = connection.prepareStatement(SQL);
          		stmt.setString(1, client.getName());
          		stmt.setString(2, client.getRole());
          		stmt.setString(3, client.getEmail());
          		stmt.setString(4, client.getPassword());

              System.out.println(stmt);
              // Step 3: Execute the query or update query
              result = stmt.executeUpdate();

          } catch (SQLException e) {
              e.printStackTrace();
          }
          catch(Exception e) {
          	e.printStackTrace();
          }
          return result;
      }
}
