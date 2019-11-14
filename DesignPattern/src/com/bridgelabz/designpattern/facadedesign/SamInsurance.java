package com.bridgelabz.designpattern.facadedesign;

public class SamInsurance implements InsuranceDetails{
	
	/* Method to get Mobile Insurance Price
	 */
	@Override
	public void insurancePrice() {
		
		System.out.println("Samsung galaxy tab 3 Insurance Price: 17000");
	}
	/* Method to get Mobile Payment type
	 */
	@Override
	public void paymentThrough() {
		
		System.out.println("Payment through Card");
	}
	
	

}
