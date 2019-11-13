package com.bridgelabz.designpattern.facadedesign;

public class Samsung implements MobileDetails{
	
	@Override
	public void mobileName() {
		
		System.out.println("Mobile: Samsung galaxy tab 3");
	}

	@Override
	public void price() {

		System.out.println("Price: 45000");
	}

}
