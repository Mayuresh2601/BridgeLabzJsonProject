/******************************************************************************
 * 
*  @author  Mayuresh Sunil Sonar
*  Purpose: Perform CURD operation on database using JDBC
*
******************************************************************************/
package com.bridgelabz.jdbc.controller;

import java.sql.SQLException;

import com.bridgelabz.jdbc.service.JDBCMethods;

public class JDBCMain {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		JDBCMethods methods = new JDBCMethods();
		int choice =0;
		do {
			System.out.println("Press 1 to Insert Data into Database");
			System.out.println("Press 2 to Search Data from Database");
			System.out.println("Press 3 to Display Data of Database");
			System.out.println("Press 4 to Update Data into Database");
			System.out.println("Press 5 to Delete Data from Database");
			System.out.println("Press 6 to Exit");
			System.out.println("Enter your choice");
			choice = methods.readInteger();
		
			switch (choice) {
			case 1:
				methods.insert();
				break;

			case 2:
				methods.search();
				break;
			
			case 3:
				methods.display();
				break;
			
			case 4:
				methods.update();
				break;
			
			case 5:
				methods.delete();
				break;
			
			case 6:
				break;
			
			default:
				System.out.println("Invalid Choice.. Please Enter Valid Choice");
				break;
			}
		}while(choice !=6);
	}

}
