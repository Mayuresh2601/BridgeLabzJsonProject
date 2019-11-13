/******************************************************************************
*  
*  Purpose: To Perform Static Block Initialization in Singleton Design Pattern

*  @author  Mayuresh Sunil Sonar
*
******************************************************************************/
package com.bridgelabz.designpattern.singletondesign;

public class StaticBlockInitialization {

    private static StaticBlockInitialization instance;
    
    private StaticBlockInitialization() {
		
    	
	}
    
    //static block initialization for exception handling
    static{
        try{
            instance = new StaticBlockInitialization();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    
    public static StaticBlockInitialization getInstance(){
        return instance;
    }
}
