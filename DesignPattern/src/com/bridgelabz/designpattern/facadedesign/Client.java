package com.bridgelabz.designpattern.facadedesign;

import java.util.Scanner;
/******************************************************************************
*  
*  Purpose: To Perform Facade Design Pattern
*  @author  Mayuresh Sunil Sonar
*
******************************************************************************/
public class Client {
		
		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);

			Shopkeeper sk = new Shopkeeper();
			int choice;
			do {
				System.out.println("\nSelect the Mobile to Purchase");
				System.out.println("1.Samsung");
				System.out.println("2.Realme");
				System.out.println("3.Redme");
				System.out.println("4.Exit");
				System.out.println("Enter your choice");
				
				choice = scanner.nextInt();
				switch (choice) {
				case 1:
					sk.samsungsale();
					break;
					
				case 2:
					sk.realmesale();
					break;
					
				case 3:
					System.out.println("Exiting");
					System.exit(0);
					break;
					
				default:
					System.out.println("Wrong Options");
					break;
				}

			} while (choice != 3);

	}

}
