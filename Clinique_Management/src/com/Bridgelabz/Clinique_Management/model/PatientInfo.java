package com.Bridgelabz.Clinique_Management.model;

public class PatientInfo {

	private int id;
	private String patientname;
	private long mobilenumber;
	private int age;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getPatientname() {
		return patientname;
	}
	
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	
	public long getMobilenumber() {
		return mobilenumber;
	}
	
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
