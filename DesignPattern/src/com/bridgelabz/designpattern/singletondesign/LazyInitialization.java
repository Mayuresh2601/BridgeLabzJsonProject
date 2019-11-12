package com.bridgelabz.designpattern.singletondesign;

public class LazyInitialization {
	
	public static void main(String[] args) {
		
		LazyInitialization obj = getInstance();
		LazyInitialization obj1 = getInstance();
		
	}
	
	static LazyInitialization Lazy;
	
	private LazyInitialization() {
		
		System.out.println("Singleton Created...");
		
	}
	
	public static LazyInitialization getInstance() {
		
		if(Lazy == null) {
			Lazy = new LazyInitialization();
		}
		
		return Lazy;
	}

}
