package com.bridgelabz.inventorymanagement.service;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import com.bridgelabz.inventorymanagement.model.InventoryInfo;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class InventoryMethod {

	private static ObjectMapper mapper = new ObjectMapper();
	
	public static InventoryInfo readJsonFile(String Path,String key) throws JsonParseException, JsonMappingException, IOException {
		
		Map<String, InventoryInfo> map = mapper.readValue(new File(Path), new TypeReference<Map<String, InventoryInfo>>() {});
		
		InventoryInfo object = map.get(key);
		return object;

	}
	
}
