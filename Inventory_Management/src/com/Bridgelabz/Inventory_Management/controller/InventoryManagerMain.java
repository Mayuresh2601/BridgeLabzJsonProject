package com.Bridgelabz.Inventory_Management.controller;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.Bridgelabz.Inventory_Management.model.InventoryInfo;
import com.Bridgelabz.Inventory_Management.service.InventoryMethod;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;


public class InventoryManagerMain {

	public static InventoryMethod method = new InventoryMethod();
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		
		String Path = "/home/admin1/Desktop/BridgeLabz/Inventory_Management/src/com/Bridgelabz/InventoryManagement/jsonfile/InventoryFactory.json";

		String[] array = {"Rice1","Rice2","Wheat1","Wheat2","Pulses1","Pulses2"};
		method.readJsonFile(Path, "simple");
		
		Map<String, Object> map = new HashMap<String, Object>();
		InventoryInfo object;
		
		for (int i = 0; i < array.length; i++) {
		
			object = method.readJsonFile(Path, array[i]);
			map.put(object.getName(), object.getWeight()*object.getPrice());
		}
		
		System.out.println(map);
		
		
		
	}
	
	

}
