package com.bridgelabz.designpattern.facadedesign;

public class RealInsurance implements InsuranceDetails{

	@Override
	public void insurancePrice() {
		
		System.out.println("Realme note 3 Insurance Price: 4000");
	}

	@Override
	public void paymentThrough() {
		
		System.out.println("Payment Through Cash");
	}
	
	

}
