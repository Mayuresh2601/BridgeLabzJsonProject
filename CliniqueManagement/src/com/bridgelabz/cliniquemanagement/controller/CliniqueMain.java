package com.bridgelabz.cliniquemanagement.controller;

import java.text.ParseException;

import com.bridgelabz.cliniquemanagement.service.Display;
import com.bridgelabz.cliniquemanagement.service.Operations;
import com.bridgelabz.cliniquemanagement.service.Search;
import com.bridgelabz.cliniquemanagement.service.Utility;

/**
 * @author Mayuresh Sunil Sonar
 * Purpose: Write a program to create record of Doctor and Patient and perform operation in Clinique Management
 */

public class CliniqueMain {

	public static void main(String[] args) throws ParseException {
		Utility u = new Utility();
		Operations o = new Operations();
		Search s = new Search();
		Display d = new Display();
		
		String docfile = "/home/admin1/Desktop/BridgeLabz/CliniqueManagement/src/com/bridgelabz/CliniqueManagement/files/Doctor.json";
		String patientfile = "/home/admin1/Desktop/BridgeLabz/CliniqueManagement/src/com/bridgelabz/CliniqueManagement/files/Patient.json";
		
		o.readDoctorFile(docfile);
		o.readPatientFile(patientfile);
		
		int choice = 0;
		do {
			System.out.println("*************Clinique Management************");
			System.out.println("Press 1 to Add Doctor/Patient or Fix Appointment");
			System.out.println("Press 2 to Search Doctor");
			System.out.println("Press 3 to Search Patient");
			System.out.println("Press 4 to Display Details");
			choice = u.readInt();
			
			switch (choice) {
			case 1:
				o.operation();;
				break;
				
			case 2:
				s.docSearch();
				break;
				
			case 3:
				s.patientSearch();
				break;
				
			case 4:
				d.operation();
				break;
				
			case 5:
				System.out.println("Exiting");
				break;
				
			default:
				System.out.println("Invalid Entry");
				
			}
		} while (choice != 5);
	}

}
