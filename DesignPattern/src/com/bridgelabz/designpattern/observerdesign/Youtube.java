/******************************************************************************
*  
*  Purpose: To Perform Observer Design Pattern
*  @author  Mayuresh Sunil Sonar
*
******************************************************************************/
package com.bridgelabz.designpattern.observerdesign;

public class Youtube {

	public static void main(String[] args) {
		
		Channel telusko = new Channel();
		
		Subscriber subscriber1 = new Subscriber("Mayur");
		Subscriber subscriber2 = new Subscriber("Rohit");
		Subscriber subscriber3 = new Subscriber("Deepak");
		Subscriber subscriber4 = new Subscriber("Ajay");
		Subscriber subscriber5 = new Subscriber("Prem");
		
		telusko.register(subscriber1);
		telusko.register(subscriber2);
		telusko.register(subscriber3);
		telusko.register(subscriber4);
		telusko.register(subscriber5);
		
		telusko.upload("How to Learn Programming in 1 minute");
	}

}
