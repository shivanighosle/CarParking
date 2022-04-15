package com.carparking.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.utility.classes.*;
import com.utility.classes.*;
import com.carparking.dao.*;
import com.utility.classes.*;
import connectivity.mysql.connectionGet;
public class ClientRegistrationDao {
	private static final String data = "insert into client_registration(client_name, client_role, client_email, client_password) VALUES(?, ?, ?, ?)";
    public static int registerClient(Client  client){
        int result = 0;
        try{
        	Connection conn = connectionGet.con;
    		PreparedStatement   stmt = conn.prepareStatement(data);
        	stmt.setString(1, client.getName());
         	stmt.setString(2, client.getRole());
        	stmt.setString(3, client.getEmail());
            stmt.setString(4, client.getPassword());

            System.out.println(stmt);
            // Step 3: Execute the query or update query
            result = stmt.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        catch(Exception e) {
        	e.getMessage();
        }
        return result;
    }
}
