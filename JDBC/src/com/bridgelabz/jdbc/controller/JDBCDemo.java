package com.bridgelabz.jdbc.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String username = "root";
		String password = "qAZ@123Qaz";
		String URL = "jdbc:mysql://localhost:3306/bridgelabz";
		String Query = "Select * from Employee";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(URL,username,password);
			
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery(Query);
			
			while (rs.next()) {
				
				System.out.println(rs.getInt(1)+ "       " + rs.getString(2));
			}
			
			st.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
