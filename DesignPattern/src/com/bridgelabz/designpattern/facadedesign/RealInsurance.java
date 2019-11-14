package com.bridgelabz.designpattern.facadedesign;

public class RealInsurance implements InsuranceDetails{

	/* Method to get Realme Insurance Price
	 */
	@Override
	public void insurancePrice() {
		
		System.out.println("Realme note 3 Insurance Price: 4000");
	}

	/* Method to get Realme payement type
	 */
	@Override
	public void paymentThrough() {
		
		System.out.println("Payment Through Cash");
	}
	
	

}
