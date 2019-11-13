package com.bridgelabz.jdbc.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class JDBCMethods {
	
	Scanner scanner=new Scanner(System.in);

	/**
	 * @return return String input
	 */
	
	public String readString()
	{
		return scanner.next();
	}
	
	/*********************************************************************/

	/**
	 * @return return Integer input
	 */
	
	public int readInteger()
	{
		return scanner.nextInt();
	}
	
   /***********************************************************************/

	/**
	 * @return return Double input
	 */
	public double readDouble()
	{
		return scanner.nextDouble();
	}
	
	/***********************************************************************/

	/**
	 * @return return Float input
	 */
	public float readFloat()
	{
		return scanner.nextFloat();
	}
	
	/***********************************************************************/

	/**
	 * @return return Long input
	 */
	public long readLong()
	{
		return scanner.nextLong();
	}

	
	/**
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * Method for inserting records into database
	 */
	public void insert() throws ClassNotFoundException, SQLException {
		try {	
			System.out.println("Enter the Employee Id:");
			int empid = readInteger();
			System.out.println("Enter the Employee Name:");
			String empname = readString();
			System.out.println("Enter the Employee Address :");
			String empaddress = readString();
			System.out.println("Enter the Employee Number:");
			long empnumber = readLong();
			System.out.println("Enter the Employee Course:");
			String empcourse = readString();
			
			Connection conn = connector();
			
			PreparedStatement statement = (PreparedStatement) conn.prepareStatement("insert into Employee values(?,?,?,?,?)");
			
			statement.setInt(1, empid);
			statement.setString(2, empname);
			statement.setString(3, empaddress);
			statement.setLong(4, empnumber);
			statement.setString(5, empcourse);
			
			int value = statement.executeUpdate();
			
			if(value > 0) {
				System.out.println("Data Inserted Successfully");
			}
			else {
				System.out.println("Problem while Inserting Data");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Method to Search and display record of Employee ID in the database
	 */
	public void search() {
		
		try {
			
			System.out.println("Enter Employe Id to Search in Database");
			int search = readInteger();
			
			Connection con = connector();
			
			PreparedStatement statement = (PreparedStatement) con.prepareStatement("Select * from Employee where empid =?");
			
			statement.setInt(1, search);
			
			ResultSet rs = statement.executeQuery();

			System.out.println("------------ Stduent Info ----------\n");
			while (rs.next()) {

				System.out.println("Employee ID: " + rs.getInt("empid") + "\n" + "Employee Name : " + rs.getString("empname") + " \n"
						+ "Employee Address : " + rs.getString("empaddress") + " \n" + "Employee Mobile Number: " + rs.getLong("empnumber") + "\nEmployee Course :"
						+ rs.getString("empcourse"));
				System.out.println("------------------------------------\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * Method to Update Data with respect to Employee id
	 */
	public void update() throws ClassNotFoundException, SQLException {
		try 
		{	
			System.out.println("Enter Employee ID to Update into Database");
			int empid = readInteger();
		
			System.out.println("Enter the Employee Name:");
			String empname = readString();
			System.out.println("Enter the Employee Address:");
			String empaddress = readString();
			System.out.println("Enter the Employee Number:");
			long empnumber = readLong();
			System.out.println("Enter the Employee Course:");
			String empcourse = readString();
		
			Connection con = connector();
		
			PreparedStatement stat = (PreparedStatement) con.prepareStatement("UPDATE Employee SET empname=?,empaddress=?,empnumber=?,empcourse=? where empid='" + empid + "'");
		
			stat.setString(1, empname);
			stat.setString(2, empaddress);
			stat.setLong(3, empnumber);
			stat.setString(4, empcourse);
		
			int value = stat.executeUpdate();
		
			if(value > 0) {
				System.out.println("Data Updated Successfully");
			}
			else {
				System.out.println("Problem while Updating data");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 * Method to Display every record in the database
	 */
	public void display() throws SQLException, ClassNotFoundException {
		try {
			Connection con = connector();
			
			PreparedStatement statement = (PreparedStatement) con.prepareStatement("Select * from Employee");
			
			ResultSet resultset = statement.executeQuery();
			
			while(resultset.next()) {
				
				System.out.println("Employee ID: " + resultset.getInt("empid") + "\n" + "Employee Name : " + resultset.getString("empname") + " \n"
						+ "Employee Address : " + resultset.getString("empaddress") + " \n" + "Employee Mobile Number: " + resultset.getLong("empnumber") + "\nEmployee Course :"
						+ resultset.getString("empcourse"));
				
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	/**
	 * Method to Delete the record from the database
	 */
	public void delete() {
		
		try {
			System.out.println("Enter Employee ID to Delete Data from Database");
			int empid = readInteger();
			
			Connection con = connector();
			
			PreparedStatement statement = (PreparedStatement) con.prepareStatement("Delete from Employee where empid=?");
			
			statement.setInt(1, empid);
			
			int value = statement.executeUpdate();
			
			if(value > 0) {
				System.out.println("Data Deleted Successfully");
			}
			else {
				System.out.println("Problem while Deleting Data");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static Connection connector() throws ClassNotFoundException, SQLException {
		
		String username = "root";
		String password = "qAZ@123Qaz";
		String URL = "jdbc:mysql://localhost:3306/bridgelabz";
		String Query = "Select * from Employee";
		
		Class.forName("com.mysql.jdbc.Driver");
			
		Connection con = DriverManager.getConnection(URL,username,password);
			
		return con;
		
	}

}
