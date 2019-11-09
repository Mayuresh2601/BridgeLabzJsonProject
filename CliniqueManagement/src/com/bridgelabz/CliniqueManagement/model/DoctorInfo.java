package com.bridgelabz.CliniqueManagement.model;

public class DoctorInfo {
	
	private int docid;
	private String docname;
	private String specilist;
	private String availability;
	private int appointment;
	
	public int getAppointment() {
		return appointment;
	}

	public void setAppointment(int appointment) {
		appointment = appointment;
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
	
	public String getSpecilist() {
		return specilist;
	}
	
	public void setSpecilist(String specilist) {
		this.specilist = specilist;
	}
	
	public String getAvailability() {
		return availability;
	}
	
	public void setAvailability(String availability) {
		availability = availability;
	}

}
