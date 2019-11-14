package com.bridgelabz.designpattern.facadedesign;

public class Samsung implements MobileDetails{
	
	/*Method to get Mobile Name
	 */
	@Override
	public void mobileName() {
		
		System.out.println("Mobile: Samsung galaxy tab 3");
	}

	/* Method to get Mobile Price
	 */
	@Override
	public void price() {

		System.out.println("Price: 45000");
	}

}
