package com.Bridgelabz.AddressBook.model;

public class PersonInfo {

	private String Fname;
	private String Lname;
	private long MobileNumber;
	private Address addressobj;
	
	public String getFname() {
		return Fname;
	}
	
	public void setFname(String fname) {
		Fname = fname;
	}
	
	public String getLname() {
		return Lname;
	}
	
	public void setLname(String lname) {
		Lname = lname;
	}
	
	public long getMobileNumber() {
		return MobileNumber;
	}
	
	public void setMobileNumber(long mobileNumber) {
		MobileNumber = mobileNumber;
	}
	
	public Address getAddressObj() {
		return addressobj;
	}
	
	public void setAddressObj(Address addressobj) {
		this.addressobj = addressobj;
	}

	@Override
	public String toString() {
		return "PersonInfo [Fname=" + Fname + ", Lname=" + Lname + ", MobileNumber=" + MobileNumber + ", addressobj="
				+ addressobj + "]";
	}
	
	
}