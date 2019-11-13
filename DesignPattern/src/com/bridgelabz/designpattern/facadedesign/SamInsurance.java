package com.bridgelabz.designpattern.facadedesign;

public class SamInsurance implements InsuranceDetails{
	
	@Override
	public void insurancePrice() {
		
		System.out.println("Samsung galaxy tab 3 Insurance Price: 17000");
	}
	@Override
	public void paymentThrough() {
		
		System.out.println("Payment through Card");
	}
	
	

}
