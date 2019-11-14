/******************************************************************************
*  
*  Purpose: To Perform Bill Pugh Singleton in Singleton Design Pattern
*  @author  Mayuresh Sunil Sonar
*
******************************************************************************/
package com.bridgelabz.designpattern.singletondesign;

public class BillPughSingleton {

	private BillPughSingleton()
	{
		
	}
    
    /**
     * @author admin1
     * Method Helper Class
     */
    private static class SingletonHelper{
    	
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    
    }
    
    /**
     * @return Instance of the class
     */
    public static BillPughSingleton getInstance(){
    
    	return SingletonHelper.INSTANCE;
    
    }
}
