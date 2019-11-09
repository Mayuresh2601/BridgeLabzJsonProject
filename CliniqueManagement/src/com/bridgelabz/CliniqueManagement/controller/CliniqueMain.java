package com.bridgelabz.CliniqueManagement.controller;

import java.io.IOException;
import java.util.ArrayList;

import com.bridgelabz.CliniqueManagement.model.*;
import com.bridgelabz.CliniqueManagement.service.Operations;
import com.bridgelabz.CliniqueManagement.service.Search;
import com.bridgelabz.CliniqueManagement.service.Utility;
import com.bridgelabz.CliniqueManagement.utility.JsonUtility;

public class CliniqueMain {

	public static void main(String[] args) throws IOException {
		Operations operation= new Operations();
		Search search = new Search();
		DoctorModel docmodel = new DoctorModel();
		PatientModel patientmodel = new PatientModel();
		Utility u = new Utility();
		ArrayList<DoctorInfo> doctors = new ArrayList<DoctorInfo>();
		ArrayList<PatientInfo> patients = new ArrayList<PatientInfo>();
		
		JsonUtility utility = new JsonUtility();
		
		operation.readDocFile();
		operation.readPatFile();
		
		String docfile = "/home/admin1/Desktop/BridgeLabz/Clinique_Management/src/com/Bridgelabz/Clinique_Management/JsonFile/Doctor.json";
		String patientfile = "/home/admin1/Desktop/BridgeLabz/Clinique_Management/src/com/Bridgelabz/Clinique_Management/JsonFile/Patient.json";
		String appointfile = "/home/admin1/Desktop/BridgeLabz/Clinique_Management/src/com/Bridgelabz/Clinique_Management/JsonFile/Appointment.json";
		int choice=0;
		do {
			System.out.println("********************Choose From the Bellow Menu*******************");
			System.out.println("Press 1 to Add Doctor\nPress 2 to Add Patient\nPress 3 to Save Doctor Details\nPress 4 to Save Patient Details\nPress 5 to Delete Patient\nPress 6 to Delete Doctor\nPress 7 to Print Patient Details\nPress 8 to Print Doctor Details");
			choice = u.readInt();
			
			switch(choice) {
			case 1:
				operation.addDoctor();
				break;
				
			case 2:
				operation.addPatient();
				break;
				
			case 3:
				operation.saveDoctor();
				break;
				
			case 4:
				operation.savePatient();
				break;
				
			case 5:
				operation.deletePatient();
				break;
				
			case 6:
				operation.deleteDoctor();  
				break;
	
			case 7:
				operation.printPatientDetails();
				break;
				
			case 8:
				operation.printDocDetails();
				break;
		
			case 9:
				
				System.out.println("Enter DoctorInfo Id ");
				int did=u.readInt();
			
				docmodel = (DoctorModel) utility.readFile(docfile,docmodel);
				doctors.addAll(docmodel.getDoctorinfo());
				DoctorInfo doctor = search.findByDocId(did);
				
			
				if(doctor!=null) {
					System.out.println("Enter the availablity");
					String avail = u.readString();
					if(doctor.getAvailability().equals(avail)) {
						
						if(doctor.getAppointment()<5) {
							
							doctor.setAppointment(doctor.getAppointment()+1);
							System.out.println("Appointed ");
							utility.writeFile(docfile,docmodel);
							
						}else {
							System.out.println("Get another shift or another DoctorInfo");
						}
						
					}
					else {
						System.out.println("DoctorInfo is not available at this shift");
					}
				}
				break;
			
			case 10:
				System.out.println("1 Search Patient by name");
				System.out.println("2 Search Patient By age");
				System.out.println("3 Search Patient by id");
				System.out.println("4 Search Patient By number");
				int ch = u.readInt();
				switch(ch) {
				case 1:
					search.findByPname();
					break;
				case 2:
					search.findByAge();
					break;
				case 3:
//					PatientInfo p = search.findByPId();
//					System.out.println("Age "+p.getAge()+" Name "+p.()+" mobile "+p.getMobilenumber());
//					break;
				case 4:
					PatientInfo pi = search.findByNumber();
					System.out.println("Age "+pi.getAge()+" Name "+pi.getPatientname()+" mobile "+pi.getMobilenumber());
					break;
				}
					
			case 11:
				System.out.println("Exit");
				break;
				
			default:
				System.out.println("Please enter Valid Choice");
			}			
				
		}while(choice != 11);
		
		System.out.println("File has Updated");
	}

}