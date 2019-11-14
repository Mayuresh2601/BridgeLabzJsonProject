/******************************************************************************
*  
*  Purpose: To Perform EagerInitialization in Singleton Design Pattern
*  @author  Mayuresh Sunil Sonar
*
******************************************************************************/
package com.bridgelabz.designpattern.singletondesign;

public class EagerInitialization {
	
	 private static final EagerInitialization instance = new EagerInitialization();
	    
	    /**
	     * Private Constructor to avoid client applications to use constructor
	     */
	    private EagerInitialization(){
	    	
	    	
	    }

	    public static EagerInitialization getInstance(){
	        return instance;
	    }
}
