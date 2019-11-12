package com.bridgelabz.cliniquemanagement.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;

import com.bridgelabz.cliniquemanagement.model.*;
import com.bridgelabz.cliniquemanagement.utility.JsonUtility;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Operations implements OperationI{
	
	Utility u = new Utility();
	JsonUtility utility = new JsonUtility();
	
	ObjectMapper mapper = new ObjectMapper();
	ArrayList<DoctorInfo> doctors = new ArrayList<DoctorInfo>();
	ArrayList<PatientInfo> patients = new ArrayList<PatientInfo>();
	ArrayList<AppointmentInfo> appointments = new ArrayList<AppointmentInfo>();
	DoctorModel docmodel = new DoctorModel();
	PatientModel patientmodel = new PatientModel();
	AppointmentModel appointmentmodel = new AppointmentModel();
	String docfile = "/home/admin1/Desktop/BridgeLabz/CliniqueManagement/src/com/bridgelabz/CliniqueManagement/files/Doctor.json";
	String patientfile = "/home/admin1/Desktop/BridgeLabz/CliniqueManagement/src/com/bridgelabz/CliniqueManagement/files/Patient.json";
	String appointfile = "/home/admin1/Desktop/BridgeLabz/CliniqueManagement/src/com/bridgelabz/CliniqueManagement/files/Appointment.json";
	int id;
	String name;
	String availability;
	String specialization;
	long phone;
	int age;

	@Override
	public void operation() {
		try {
			int ch = 0;
			do {
				System.out.println("Press 1 to Add Doctor");
				System.out.println("Press 2 to Delete Doctor");
				System.out.println("Press 3 to Add Patients");
				System.out.println("Press 4 to Delete Patients");
				System.out.println("Press 5 to Fix Appointment");
				System.out.println("Press 6 to Exit to Main Menu");

				ch = u.readInt();

				switch (ch) {

				case 1:
					addDoctor();
					break;
					
				case 2:
					deleteDoctor();
					break;
					
				case 3:
					addPatient();
					break;
					
				case 4:
					deletePatient();
					break;
					
				case 5:
					fixAppointment();
					break;

				case 6:
					break;
					
				default:
					System.out.println("Wrong choice..");
				}

			} while (ch != 6);
		} catch (Exception e) {
			System.out.println("Choice Enter only Integer");
		}

	}

	@Override
	public void addPatient() {
		System.out.println("Enter Patient name");
		name = u.readString();
		System.out.println("Enter mobile number");
		phone = u.readLong();
		System.out.println("Enter age");
		age = u.readInt();
		id = 0;
		if (patients.size() >= 1) {
			for (int i = 0; i < patients.size(); i++) {
				if (id < patients.get(i).getPid()) {
					id = patients.get(i).getPid();
				}
			}
		}
		patients.add(new PatientInfo(name, id + 1, phone, age));
		savePatient();
	}

	@Override
	public void deletePatient() {
		System.out.println("Enter Patient id");
		id = u.readInt();
		int i = 0;
		for (i = 0; i < patients.size(); i++) {
			if (patients.get(i).getPid() == id) {
				patients.remove(i);
			}
		}
		if (i == patients.size()) {
			System.out.println("No Patient Found ");
		}
		savePatient();
	}

	@Override
	public void addDoctor() {
		System.out.println("Enter Name");
		name = u.readString();
		System.out.println("Enter Specalization");
		specialization = u.readString();
		System.out.println("Enter Availability(AM/PM/BOTH)");
		availability = u.readString();
		id = 0;
		if (doctors.size() >= 1) {
			for (int i = 0; i < doctors.size(); i++) {
				if (id < doctors.get(i).getDocid()) {
					id = doctors.get(i).getDocid();
				}
			}
		}
		doctors.add(new DoctorInfo(id + 1, name, availability, specialization, age, age));
		saveDoctor();
	}

	@Override
	public void deleteDoctor() {
		System.out.println("Enter Doctor id");
		id = u.readInt();
		int i = 0;
		for (i = 0; i < doctors.size(); i++) {
			if (i == doctors.size()) {
				System.out.println("invalid id");
			} else if (doctors.get(i).getDocid() == id) {
				doctors.remove(i);
			}
		}
		saveDoctor();
		
	}

	@Override
	public void fixAppointment() {
		System.out.println("Enter DoctorId");
		int doctorId = u.readInt();
		System.out.println("Enter PatientId");
		int patientId = u.readInt();
		System.out.println("Enter Availibility");
		String avail = u.readString();

		DoctorInfo doctor = (DoctorInfo) doctors.stream().filter(i -> i.getDocid() == doctorId).collect(Collectors.toList())
				.get(0);
		PatientInfo patient = (PatientInfo) patients.stream().filter(i -> i.getPid() == patientId).collect(Collectors.toList())
				.get(0);

		if (doctor == null || patient == null) {
			System.out.println("Invalid Details");
			return;
		}
		
		if (doctor.getAvailability().equals(avail)) {
			if (doctor.getAvailability().equals("AM") || doctor.getAvailability().equals("BOTH")) {
				if (doctor.getAmcount() > 5) {
					System.out.println("Doctor Already Have Max Appointments");
					return;
				} else {
					for (int i = 0; i < doctors.size(); i++) {
						if (doctors.get(i).getDocid() == doctorId) {
							int temp = doctors.get(i).getAmcount();
							doctors.get(i).setAmcount(temp + 1);
						}
					}
				}
			} else if (doctor.getAvailability().equals("PM") || doctor.getAvailability().equals("BOTH")) {
				if (doctor.getPmcount() > 5) {
					System.out.println("Doctor Already Have Max Appointments");
					return;
				} else {
					for (int i = 0; i < doctors.size(); i++) {
						if (doctors.get(i).getDocid() == doctorId) {
							int temp = doctors.get(i).getPmcount();
							doctors.get(i).setPmcount(temp + 1);
						}
					}
				}
			}
		}

		appointments
				.add(new AppointmentInfo(doctor.getDocname(), doctorId, patient.getPatientname(), patientId, avail));
		saveAppointment();
		System.out.println("Appointment Fixed");
		
	}

	@Override
	public void readDoctorFile(String path) {
		File file = new File(path);
		
		if(file.exists() && file.length()!=0) {
			try {
				docmodel = (DoctorModel) utility.readFile(path, docmodel);
			} catch (Exception e) {
				e.printStackTrace();
			}
			doctors.addAll(docmodel.getDoctorinfo());
		}
		
		
	}

	@Override
	public void readPatientFile(String path) {
		File file = new File(path);
		
		if(file.exists() && file.length()!=0) {
			try {
				patientmodel = (PatientModel) utility.readFile(path, patientmodel);
			} catch (Exception e) {
				e.printStackTrace();
			}
			patients.addAll(patientmodel.getPatientinfo());
		}
		
	}

	@Override
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
	
	@Override
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

	@Override
	public void saveAppointment() {
		System.out.println("Saving Appointment Details into JSON File");
		
		appointmentmodel.setAppointmentInfo(appointments);
		
		try {
			
			utility.writeFile(appointfile, appointmentmodel);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println();
		
	}
}
	
	