/******************************************************************************
*  
*  Purpose: To Perform Factory Design Pattern
*  @author  Mayuresh Sunil Sonar
*
******************************************************************************/
package com.bridgelabz.designpattern.factorydesign.controller;

import com.bridgelabz.designpattern.factorydesign.computers.Computer;

public class FactoryMain {
	
	public static void main(String[] args) {

		Computer pc = ComputerFactory.getComputer("PC", "1.7Hz", "500TB", "500Rpm");
		
		Computer server = ComputerFactory.getComputer("Server", "6.7Hz", "10000TB", "10000Rpm");
		
		
		System.out.println("PC configuration is: "+pc);
		System.out.println("Server Configuration is: "+server);
	}

}
