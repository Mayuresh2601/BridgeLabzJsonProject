package com.bridgelabz.CliniqueManagement.model;

public class AppointmentInfo {
	
	int patientId;
	String patientName;
	private int docid;
	private String docname;
	String Availibility;
	
	public int getPatientId() {
		return patientId;
	}
	
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	
	public String getPatientName() {
		return patientName;
	}
	
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	
	public int getDocid() {
		return docid;
	}
	
	public void setDocid(int docid) {
		this.docid = docid;
	}
	
	public String getDocname() {
		return docname;
	}
	
	public void setDocname(String docname) {
		this.docname = docname;
	}
	
	public String getAvailibility() {
		return Availibility;
	}
	
	public void setAvailibility(String availibility) {
		Availibility = availibility;
	}
	
	public AppointmentInfo(String doctorname, int doctorId, String patientName, int patientId, String availibility) {
		this.docname = doctorname;
		this.docid = doctorId;
		this.patientName = patientName;
		this.patientId = patientId;
		this.Availibility = availibility;
		
	}
	
}
