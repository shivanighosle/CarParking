package connectivity.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionGet {
	public static Connection con = null;
	  public static Connection getcon()
	  {
	     try {
	        Class.forName("com.mysql.jdbc.Driver");
	        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","A@k1$h!!");
	    }catch(SQLException ex) {
	    	ex.printStackTrace();
	    }catch(ClassNotFoundException ex) {
	    	ex.printStackTrace();
	    }
	     catch(Exception e){
	        e.printStackTrace();
	    }
	     return con;
	  }
}
