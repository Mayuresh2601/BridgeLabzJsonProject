package com.bridgelabz.StockAccount.service;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import com.bridgelabz.StockAccount.model.CompanyInfo;
import com.bridgelabz.StockAccount.model.CompanyModel;
import com.bridgelabz.StockAccount.model.CustomerInfo;
import com.bridgelabz.StockAccount.model.CustomerModel;
import com.bridgelabz.StockAccount.utility.JsonUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StockAccountMethod {
	
	static Scanner scanner = new Scanner(System.in);
	JsonUtil utility = new JsonUtil();
	ArrayList<CustomerInfo> customers = new ArrayList<CustomerInfo>();
	ArrayList<CompanyInfo> companys = new ArrayList<CompanyInfo>();
	CustomerModel custmodel = new CustomerModel();
	CompanyModel compmodel = new CompanyModel();
	CustomerInfo customer = new CustomerInfo();
	CompanyInfo company = new CompanyInfo();
	static ObjectMapper mapper = new ObjectMapper();
	String customerpath = "/home/admin1/Desktop/BridgeLabz/Stock_Account/src/com/Bridgelabz/Stock_Account/JsonFile/Customer.json";
	String companypath = "/home/admin1/Desktop/BridgeLabz/Stock_Account/src/com/Bridgelabz/Stock_Account/JsonFile/Company.json";
	public void addCustomer() {
		CustomerInfo customer = new CustomerInfo();

		int i=1;
			
		System.out.println("Enter Name of Customer"+(i++)+": ");
		customer.setCustname(scanner.next());
		
		System.out.println("Enter the Amount:");
		customer.setAmount(scanner.nextInt());
		
		System.out.println("Enter the Company Symbol:");
		customer.setSymbol(scanner.next());
			
		customers.add(customer);
		System.out.println("Customers Successfully Added");
		int choice=0;
		do 
		{
			System.out.println("Press 1 to Buy Shares\nPress 2 to Sell Shares\nPress 3 to Save\nPress 4 to Print Details\n Press 5 to Exit to Main Menu");
			choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				buy(customer.getAmount(),customer.getSymbol());
				break;
				
			case 2:
				sell(customer.getAmount(),customer.getSymbol());
				
			case 3:
				saveCustomer();
				break;
				
			case 4:
				
				customers.forEach(c -> {
					System.out.println("CustomerName: "+c.getCustname()+"Amount: "+c.getAmount()+
					"Symbol: "+c.getSymbol());
				});
				break;
				
			case 5:
				System.out.println("Exit to Main Menu");

			default:
				break;
			}
		}while(choice !=5);	
		
	}
	
	public void readCompJsonFile() {
		
		File file = new File(companypath);
		
		if(file.exists() && file.length() !=0) {
			
			try {
				
				compmodel = (CompanyModel) utility.readMapper(companypath, compmodel);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			companys.addAll(compmodel.getCompanyinfo());
		}
	}

	public void saveCustomer() {
		
		System.out.println("Saving Details in Json File");
		
		custmodel.setCustomerinfo(customers);
		
		try {
			
			
			utility.writeMapper(customerpath, custmodel);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}
	
	public void buy(int amount,String symbol) {
		
		for (int i = 0; i < customers.size(); i++) {
			
			if(symbol.equals(customers.get(i).getSymbol())) {
				
				System.out.println("The company details is");
				
				System.out.println("CompanyName: "+companys.get(i).getCompanyname()+"\nTotalShares: "+companys.get(i).getTotalshares()+"\nPricePerShare: "+companys.get(i).getTotalshares());
				if(amount >= companys.get(i).getPricepershare()) {
					System.out.println("Enter the ");
				}
				
			}
			else {
				System.out.println("Invalid Symbol");
			}
		}

	}
	
	public void sell(int amount,String symbol) {
		

	}
	
	
}
