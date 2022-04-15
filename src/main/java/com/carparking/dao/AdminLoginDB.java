package com.carparking.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AdminLoginDB {
	public static Connection getConn() {
	    Connection con = null;
	    String loadDriver = "com.mysql.cj.jdbc.Driver";
	    String dbURL = "jdbc:mysql://localhost:3306/training";
	    String dbUSERNAME = "root";
	    String dbPASSWORD = "A@k1$h!!";
	    try {
	      Class.forName(loadDriver);
	      con = DriverManager.getConnection(dbURL, dbUSERNAME, dbPASSWORD);
	    } catch (ClassNotFoundException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    } catch (SQLException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
	    return con;
	  }
}
