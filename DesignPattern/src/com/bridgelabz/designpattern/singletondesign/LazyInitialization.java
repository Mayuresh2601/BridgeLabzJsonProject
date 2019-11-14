/******************************************************************************
*  
*  Purpose: To Perform LazyInitialization in Singleton Design Pattern
*  @author  Mayuresh Sunil Sonar
*
******************************************************************************/
package com.bridgelabz.designpattern.singletondesign;

public class LazyInitialization {
	
	public static void main(String[] args) {
		
		LazyInitialization obj = getInstance();
		LazyInitialization obj1 = getInstance();
		
	}
	
	static LazyInitialization Lazy;
	
	/**
	 * Default Constructor to Access it Privately
	 */
	private LazyInitialization() {
		
		System.out.println("Singleton Created...");
		
	}
	
	/**
	 * @return Instance of the Class
	 */
	public static LazyInitialization getInstance() {
		
		if(Lazy == null) {
			Lazy = new LazyInitialization();
		}
		
		return Lazy;
	}

}
