/******************************************************************************
*  
*  Purpose: To Perform Thread Synchronization in Singleton Design Pattern

*  @author  Mayuresh Sunil Sonar
*
******************************************************************************/
package com.bridgelabz.designpattern.singletondesign;

public class ThreadSynchronized {

	public static void main(String[] args) {
		ThreadSynchronized thread1 = getInstance();
		ThreadSynchronized thread2 = getInstance();
	}
	
	private static ThreadSynchronized thread;
	
	private ThreadSynchronized() {
		System.out.println("Thread Synchronization Used");
		
	}
	
	public static synchronized ThreadSynchronized getInstance() {
		if(thread == null) {
			thread = new ThreadSynchronized();
		}
		
		return thread;
	}
}
