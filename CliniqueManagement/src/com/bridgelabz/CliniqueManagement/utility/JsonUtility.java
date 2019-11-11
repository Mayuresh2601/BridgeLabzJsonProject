package com.bridgelabz.CliniqueManagement.utility;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtility {
	
	private static ObjectMapper mapper = new ObjectMapper();
	
	String docfile = "/home/admin1/Desktop/BridgeLabz/Clinique_Management/src/com/Bridgelabz/Clinique_Management/JsonFile/Doctor.json";
	String patientfile = "/home/admin1/Desktop/BridgeLabz/Clinique_Management/src/com/Bridgelabz/Clinique_Management/JsonFile/Patient.json";
	String appointfile = "/home/admin1/Desktop/BridgeLabz/Clinique_Management/src/com/Bridgelabz/Clinique_Management/JsonFile/Appointment.json";
	
	public Object readFile(String Path,Object object) throws  IOException {
		
		return mapper.readValue(new File(Path), object.getClass());
	}
	
	public void writeFile(String Path,Object object) throws IOException {
	  
		mapper.writeValue(new File(Path), object);
	}

	public void writeFileAppoint(String Path,Object object) throws  IOException {
		mapper.writeValue(new File(appointfile),object);
		System.out.println("File has updated");
	}
	
}