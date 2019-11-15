/******************************************************************************
*  
*  Purpose: To Perform Mediator Design Pattern
*  @author  Mayuresh Sunil Sonar
*
******************************************************************************/
package com.bridgelabz.designpattern.mediatordesign;

import java.util.Scanner;

public class MediatorMain {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Two User Name to establish Communication");
		String input1 = scanner.next();
		String input2 = scanner.next();
		
		User mayuresh = new User(input1);
		User rohit = new User(input2);
		
		mayuresh.sendMessage("Hie Mayuresh");
		rohit.sendMessage("Hie Rohit");
	}

}
