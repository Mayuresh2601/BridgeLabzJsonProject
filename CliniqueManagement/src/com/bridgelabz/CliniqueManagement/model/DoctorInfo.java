package com.bridgelabz.CliniqueManagement.model;

public class DoctorInfo {
	
	private int docid;
	private String docname;
	private String specilist;
	private String availability;
	private int amcount;
	private int pmcount;

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
		this.availability = availability;
	}
	
	public int getAmcount() {
		return amcount;
	}

	public void setAmcount(int amcount) {
		this.amcount = amcount;
	}

	public int getPmcount() {
		return pmcount;
	}

	public void setPmcount(int pmcount) {
		this.pmcount = pmcount;
	}
	
	public DoctorInfo(int docid, String docname, String availability, String specilist, int amCount, int pmCount) {
		super();
		this.docid = docid;
		this.docname = docname;
		this.availability = availability;
		this.specilist = specilist;
		this.amcount = amCount;
		this.pmcount = pmCount;
	}
	
	public DoctorInfo() {
		
		
		
	}

}
