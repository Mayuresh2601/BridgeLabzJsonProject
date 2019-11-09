package com.bridgelabz.CliniqueManagement.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.bridgelabz.CliniqueManagement.model.*;
import com.bridgelabz.CliniqueManagement.utility.JsonUtility;


public class Operations {
	
	Utility u = new Utility();
	JsonUtility utility = new JsonUtility();
	
	static ArrayList<DoctorInfo> doctors = new ArrayList<DoctorInfo>();
	static ArrayList<PatientInfo> patients = new ArrayList<PatientInfo>();
	PatientModel patientmodel = new PatientModel();
	DoctorModel docmodel = new DoctorModel();
	
	String docfile = "/home/admin1/Desktop/BridgeLabz/Clinique_Management/src/com/Bridgelabz/Clinique_Management/JsonFile/Doctor.json";
	String patientfile = "/home/admin1/Desktop/BridgeLabz/Clinique_Management/src/com/Bridgelabz/Clinique_Management/JsonFile/Patient.json";
	String appointfile = "/home/admin1/Desktop/BridgeLabz/Clinique_Management/src/com/Bridgelabz/Clinique_Management/JsonFile/Appointment.json";
	
	public void addDoctor() {
	
			DoctorInfo d = new DoctorInfo();
			System.out.println("Enter the doctor name.");
			d.setDocname(u.readString());
			
			System.out.println("Enter the doctor id");
			d.setDocid(u.readInt());
			System.out.println("Enter the Doctor speciality");
			
			d.setSpecilist(u.readString());
			
			System.out.println("Enter the doctor availability ");
			d.setAvailability(u.readString());
			
			doctors.add(d);
			
			System.out.println("Press 1 to SearchBy PatientId\nPress 2 to SearchBy PatientName\nPress 3 to SearchBy PatientAge\nPress 4 to SearchBy Patient Mobile");
			int choice = u.readInt();
	}
	
	public void addPatient(){
		
		PatientInfo p = new PatientInfo();
			
		System.out.println("Enter the patient name");
		p.setPatientname(u.readString());
			
		System.out.println("Enter the patient age");
		p.setAge(u.readInt());
			
		System.out.println("Enter the patient mobileno ");
		p.setMobilenumber(u.readLong());
			
		patients.add(p);
			
		System.out.println("If more Patient enter true");
		
	}
	
	public void savePatient() {
		
		System.out.println("Saving Patient Details into JSON File");
		
		patientmodel.setPatientinfo(patients);
		
		try {
			
			utility.writeFile(patientfile, patientmodel);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println();
	}
	
	public void saveDoctor() {
		
		System.out.println("Saving Doctor Details into JSON File");
		
		docmodel.setDoctorinfo(doctors);
		
		try {
			
			utility.writeFile(docfile, docmodel);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println();
	}
	
	public void deleteDoctor() {
		System.out.println("Enter the doctor id");
		int did = u.readInt();
		boolean isdocdeleted = false;
		System.out.println();
		System.out.println("Doctor Details");
		for(int i=0;i<doctors.size();i++) {
			if(doctors.get(i).getDocid() == did) {
				doctors.remove(i);
				isdocdeleted=true;
				break;
			}
		}
		if(isdocdeleted) {
			System.out.println("Doctor Details Deleted Successfully");
		}
		else {
			System.out.println("Invalid Doctor Id");
		}
		
	}
	
	public void deletePatient() {
		System.out.println("Enter the Patient id");
		int pid = u.readInt();
		boolean ispatdeleted = false;
		System.out.println();
		System.out.println("Doctor Details");
		for(int i=0;i<patients.size();i++) {
			if(patients.get(i).getPatientname().equals(pid)) {
				patients.remove(i);
				ispatdeleted = true;
				break;
			}
		}
		if(ispatdeleted) {
			System.out.println("Patient Details Deleted Successfully");
		}
		else {
			System.out.println("Invalid Patient Id");
		}
	}
	
	public void printDocDetails() {
		
		doctors.forEach(i -> {
			
				System.out.println("Doctor Id: "+ i.getDocid() + "\nDoctor Name: " + i.getDocname() + "\nDoctor Specialist in: " + i.getSpecilist()
						+ "\nDoctor Availability: " + i.getAvailability());
				System.out.println();
		});	
	}
	
	public void printPatientDetails() {
		
		patients.forEach(i -> {
			
				System.out.println("Patient Name: " + i.getPatientname() + "\nPatient Age: " + i.getAge()
						+ "\nPatient Mobile Number: " + i.getMobilenumber());
				System.out.println();
		});	
	}
	
	public void readDocFile() {
		
		File file = new File(docfile);
		
		
		if(file.exists() && file.length() != 0) {
			docmodel.setDoctorinfo(doctors);
			
			try {
				
				docmodel = (DoctorModel) utility.readFile(docfile, docmodel);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		doctors.addAll(docmodel.getDoctorinfo());
	}
	
	public void readPatFile() {
		
		File file = new File(patientfile);
		
		
		if(file.exists() && file.length() != 0) {
			patientmodel.setPatientinfo(patients);
			
			try {
				
				patientmodel = (PatientModel) utility.readFile(patientfile, patientmodel);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		doctors.addAll(docmodel.getDoctorinfo());
	}
	
}