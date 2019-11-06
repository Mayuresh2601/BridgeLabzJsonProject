package com.Bridgelabz.Stock_Management.controller;

import java.util.Scanner;

import com.Bridgelabz.Stock_Management.service.StockManagementMethod;


public class StockManagementMain {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		StockManagementMethod method = new StockManagementMethod();
		
		String Path = "/home/admin1/Desktop/BridgeLabz/Stock_Management/src/com/Bridgelabz/Stock_Management/connector/stock.json";
	
		int choice =0;
		do
		{
			System.out.println("Press 1 to Add Stock\nPress 2 to Save Stocks\nPress 3 to Calculate Total shares\nPress 4 to Exit");
			choice = scanner.nextInt();
		
			switch (choice) {
			case 1:
				method.add(Path);
				break;

			case 2:
				method.save(Path);
				break;
				
			case 3:
				method.calculate();
				break;
				
			case 4:
				System.exit(0);
				
			default:
				System.out.println("Please Enter Valid Choice");
			}
		
		}while(choice != 4);
	}
}

	
