package com.Bridgelabz.Inventory_Management.controller;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import com.Bridgelabz.Inventory_Management.model.*;
import com.Bridgelabz.Inventory_Management.service.InventoryMethod;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class InventoryManagementMain {
	
	static InventoryMethod method = new InventoryMethod();
   
	public static void main(String[] args) throws IOException {
		
		String Path = "/home/admin1/Desktop/BridgeLabz/Inventory_Management/src/com/Bridgelabz/InventoryManagement/jsonfile/InventoryManagement.json";
		ObjectMapper mapper = new ObjectMapper();
	
		Map<String, InventoryInfo> mapreader =mapper.readValue(new File(Path), new TypeReference<Map<String, InventoryInfo>>() {});
	
		InventoryInfo rice=mapreader.get("list1");
		System.out.println("Grain_Name: "+rice.getName()+"\nWeight: "+rice.getWeight()+"\nPrice_Per_Kg: "+rice.getPrice());
		System.out.println("Total Price of Rice: " +rice.getPrice()*rice.getWeight()+" per kg");
		System.out.println();
		
		InventoryInfo wheat =mapreader.get("list2");
		System.out.println("Grain_Name: "+wheat.getName()+"\nWeight: "+wheat.getWeight()+"\nPrice_Per_Kg: "+wheat.getPrice());
		System.out.println("Total Price of Wheat: " +wheat.getPrice()*wheat.getWeight()+" per kg");
		System.out.println();
		
		InventoryInfo pulses = mapreader.get("list3");
		System.out.println("Grain_Name: "+pulses.getName()+"\nWeight: "+pulses.getWeight()+"\nPrice_Per_Kg: "+pulses.getPrice());
		System.out.println("Total Price of Pulses: " +pulses.getPrice()*pulses.getWeight()+" per kg");
		
	}
}

