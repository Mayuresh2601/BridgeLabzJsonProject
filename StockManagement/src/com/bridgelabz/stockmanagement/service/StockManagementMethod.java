package com.bridgelabz.stockmanagement.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.bridgelabz.stockmanagement.model.StockInfo;
import com.bridgelabz.stockmanagement.model.StockModel;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StockManagementMethod {
	
	static StockManagementMethod method = new StockManagementMethod();
	static ObjectMapper mapper = new ObjectMapper();
	static Scanner scanner = new Scanner(System.in);
	static StockModel model = new StockModel();
	static ArrayList<StockInfo> stocks = new ArrayList<StockInfo>();
	
	/**
	 * @param Path
	 * @param object
	 * @return Object and convert the Json String into Object
	 * @throws IOException
	 */
	public Object readMapper(String Path,Object object) throws IOException {
		
		return mapper.readValue(new File(Path), object.getClass());
	}
	
	/**
	 * @param Path
	 * @param object
	 * @return String and Convert the Object into Json String
	 * @throws IOException
	 */
	public String writeMapper(String Path,Object object) throws IOException {
		
		mapper.writeValue(new File(Path), object);
		return "File Successfully Written...";
	}
	
	/**
	 * @param Path
	 * Method to Add Stocks into Company
	 */
	public void add(String Path) {
		
		StockInfo stock = new StockInfo();
		
		System.out.println("Enter Stock Name");
		stock.setName(scanner.next());
		
		System.out.println("Enter No. of Shares");
		stock.setNumber_of_share(scanner.nextInt());
		
		System.out.println("Enter Total Shares");
		stock.setShare_price(scanner.nextInt());
		
		stocks.add(stock);
		System.out.println("Data Successfully Added...");
		
	}
	
	/**Method to Save Details of Stocks in Json File
	 */
	public void save(String Path) {
		
		System.out.println("Saving Stock Details in Json File...");

		model.setStockInfo(stocks);
		
		try {
			
			method.writeMapper(Path, model);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println();
		
	}
	
	/**Method to Calculate Stock price
	 */
	public void calculate() {
		
		int result = 0;
		
		for (int i = 0; i < stocks.size(); i++) {
			
			result += stocks.get(i).getShare_price();
		}
		System.out.println("Total Share of Each Stock is: "+result);

	}
	
	/**Method to Read Json File
	 */
	public void readJsonFile(String Path) {
		
		File file = new File(Path);
				
		
		

	}
	
	

}
