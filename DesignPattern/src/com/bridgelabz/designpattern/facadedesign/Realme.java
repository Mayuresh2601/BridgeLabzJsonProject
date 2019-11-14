package com.bridgelabz.designpattern.facadedesign;

public class Realme implements MobileDetails{
	
	/* Method to get Realme Mobile Name
	 */
	@Override
	public void mobileName() {
		
		System.out.println("Mobile: Realme note 3");
	}

	/* Method to get Realme Mobile Price
	 */
	@Override
	public void price() {
		
		System.out.println("Price: 10000");
	}

}
