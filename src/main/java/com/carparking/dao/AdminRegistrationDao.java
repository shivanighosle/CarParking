package com.carparking.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.utility.classes.*;

import connectivity.mysql.connectionGet;
public class AdminRegistrationDao {
    public static int registerAdmin(Admin  admin){
       final String INSERT = "INSERT INTO admin(name, role, email, password) VALUES(?, ?, ?, ?)";

        int result = 0;
        try {
        	    Class.forName("com.mysql.jdbc.Driver");
        		Connection connection = connectionGet.getcon();
        		PreparedStatement   stmt = connection.prepareStatement(INSERT);
        		stmt.setString(1, admin.getName());
        		stmt.setString(2, admin.getRole());
        		stmt.setString(3, admin.getEmail());
        		stmt.setString(4, admin.getPassword());

            System.out.println(stmt);
            // Step 3: Execute the query or update query
            result = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        catch(ClassNotFoundException e) {
        	e.printStackTrace();
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
        return result;
    }
}
