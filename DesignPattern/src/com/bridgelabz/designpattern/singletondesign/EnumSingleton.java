/******************************************************************************
*  
*  Purpose: To Perform Enum Singleton in Singleton Design Pattern
*  @author  Mayuresh Sunil Sonar
*
******************************************************************************/
package com.bridgelabz.designpattern.singletondesign;

public class EnumSingleton {
	
	public static void main(String[] args) {
		Abc obj1 = Abc.INSTANCE;
		Abc obj2 = Abc.INSTANCE;
		
		obj1.i = 6;
		obj1.show();
		
		obj2.i = 10;
		obj1.show();
		
		
	}
	
}

enum Abc{ //Special Type of Class
	
	INSTANCE;
	int i;
	
	public void show() {
		
		System.out.println(i);
	}
	
}
