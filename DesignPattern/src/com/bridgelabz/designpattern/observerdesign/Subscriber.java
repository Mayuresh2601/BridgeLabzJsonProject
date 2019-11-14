package com.bridgelabz.designpattern.observerdesign;

public class Subscriber {
	
	private String name;
	private Channel channel;
	
	/**
	 * Method to Send Message to each subscriber
	 */
	public void update() {
		
		System.out.println("Hey "+ name +", Video Uploaded");
	}
	
	public void subscribeChannel(Channel ch) {
		
		channel = ch;
	}

	public Subscriber(String name) {
		super();
		this.name = name;
	}

}
