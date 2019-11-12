package com.bridgelabz.cliniquemanagement.service;

public interface OperationI {
	
	public void operation();
	
	void addPatient();
	
	void deletePatient();
	
	void addDoctor();
	
	void deleteDoctor();
	
	void fixAppointment();
	
	void readDoctorFile(String path);
	
	void readPatientFile(String path);
	
	void saveDoctor();
	
	void savePatient();
	
	void saveAppointment();
}
