package com.bridgelabz.designpattern.facadedesign;

public class Realme implements MobileDetails{
	
	@Override
	public void mobileName() {
		
		System.out.println("Mobile: Realme note 3");
	}

	@Override
	public void price() {
		
		System.out.println("Price: 10000");
	}

}
