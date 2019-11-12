package com.bridgelabz.cliniquemanagement.model;

public class PatientInfo {

	private int pid;
	private String pname;
	private long mobilenumber;
	private int age;
	
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPatientname() {
		return pname;
	}
	
	public void setPatientname(String patientname) {
		this.pname = patientname;
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
	
	public PatientInfo(String pname, int pid, long mobilenumber, int age) {

		super();
		this.pid = pid;
		this.pname = pname;
		this.mobilenumber = mobilenumber;
		this.age = age;
	}
	
	public PatientInfo() {
		
		
	}
}
