package com.bridgelabz.designpattern.singletondesign;

public class EagerInitialization {
	
	public static EagerInitialization single;
	
	private EagerInitialization() {
		
		
	}
	
	public static EagerInitialization getInstance() {
		
		return single;
	}

	
	public static void main(String[] args) {
		
		EagerInitialization single = getInstance();
		EagerInitialization single2 = getInstance();
		
	}
}
