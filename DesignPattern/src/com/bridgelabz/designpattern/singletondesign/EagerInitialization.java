/******************************************************************************
*  
*  Purpose: To Perform EagerInitialization in Singleton Design Pattern
*  @author  Mayuresh Sunil Sonar
*
******************************************************************************/
package com.bridgelabz.designpattern.singletondesign;

public class EagerInitialization {
	
	public static EagerInitialization single;
	
	private EagerInitialization() {
		
		
	}
	
	/**
	 * @return Instance of the class
	 */
	public static EagerInitialization getInstance() {
		
		return single;
	}

	
	public static void main(String[] args) {
		
		EagerInitialization single = getInstance();
		EagerInitialization single2 = getInstance();
		
	}
}
