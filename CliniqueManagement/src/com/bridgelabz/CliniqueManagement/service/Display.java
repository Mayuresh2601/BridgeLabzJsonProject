package com.bridgelabz.CliniqueManagement.service;

import java.util.ArrayList;

import com.bridgelabz.CliniqueManagement.model.AppointmentInfo;
import com.bridgelabz.CliniqueManagement.model.DoctorInfo;
import com.bridgelabz.CliniqueManagement.model.PatientInfo;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Display implements DisplayI{

	Utility u = new Utility();
	ArrayList<DoctorInfo> doctors = new ArrayList<DoctorInfo>();
	ArrayList<PatientInfo> patients = new ArrayList<PatientInfo>();
	ArrayList<AppointmentInfo> appointments = new ArrayList<AppointmentInfo>();
	ObjectMapper mapper = new ObjectMapper();
	Operations o = new Operations();
	String docfile = "/home/admin1/Desktop/BridgeLabz/CliniqueManagement/src/com/bridgelabz/CliniqueManagement/files/Doctor.json";
	String patientfile = "/home/admin1/Desktop/BridgeLabz/CliniqueManagement/src/com/bridgelabz/CliniqueManagement/files/Patient.json";

	
	public void operation() {   //display data  patient and doctor wise
		int ch = 0;
		do {
			System.out.println("\nPress 1 to Display Doctors Information");
			System.out.println("Press 2 to Display Patients Information");
			System.out.println("Press 3 to Exit to Main Menu");
			
			ch=u.readInt();
			switch (ch) {
			case 1:
				doctorInformation(); // print doctors data
				break;
			case 2:
				patientInformation(); // print patients data
				break;
			case 3:
				break;
			default:
				System.out.println("Invalid Entry");
			}
		} while (ch != 3);
	}
	
	@Override
	public void patientInformation() {
		 System.out.println("--------------patient Information------------------\n");
		
		o.readPatientFile(patientfile);
//		patients.forEach(i -> {System.out.println(i.getPatientname() + "\t  " + i.getPid() + "\t" + i.getMobilenumber() + "\t" + i.getAge());});
		for (int i = 0; i < patients.size(); i++) {
			 System.out.println(patients.get(i).getPatientname() + "\t  " + patients.get(i).getPid() + "\t" + patients.get(i).getMobilenumber() + "\t" + patients.get(i).getAge());
		}
			
		
	}

	@Override
	public void doctorInformation() {
		System.out.println("--------------doctor Information------------------\n");
			
			o.readDoctorFile(docfile);
			doctors.forEach(i -> {System.out.println(i.getDocname() + "\t  " + i.getDocid() + "\t" + i.getAvailability() + "\t\t" + i.getSpecilist());});

	}

}
