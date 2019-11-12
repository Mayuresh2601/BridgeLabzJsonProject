package com.bridgelabz.addressbook.model;

public class Address {

	private String Address;
	private String State;
	private String City;
	private int PinCode;
	
	public String getAddress() {
		return Address;
	}
	
	public void setAddress(String address) {
		Address = address;
	}
	
	public String getState() {
		return State;
	}
	
	public void setState(String state) {
		State = state;
	}
	
	public String getCity() {
		return City;
	}
	
	public void setCity(String city) {
		City = city;
	}
	
	public int getPinCode() {
		return PinCode;
	}
	
	public void setPinCode(int pinCode) {
		PinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [Address=" + Address + ", State=" + State + ", City=" + City + ", PinCode=" + PinCode + "]";
	}
	
	
}