package com.bridgelabz.designpattern.observerdesign;

import java.util.ArrayList;
import java.util.List;

public class Channel {
	
	private String title;
	private List<Subscriber> subscribers = new ArrayList<Subscriber>();
	
	/**
	 * @param sub
	 * Method to Add the subscriber who has register for the channel
	 */
	public void register(Subscriber sub) {
		
		subscribers.add(sub);
	}
	
	/**
	 * @param sub
	 * Method to Remove the subscriber who has unregister for the channel
	 */
	public void unregister(Subscriber sub) {
		
		subscribers.remove(sub);
	}
	
	/**
	 * @param title
	 * Method to Upload the Video to the subscribers and notify them
	 */
	public void upload(String title) {
		
		this.title = title;
		notifySubscribers();
	}
	
	/**
	 * Method to Notify Every subscriber who has register for the channel
	 */
	public void notifySubscribers() {
		
		for (Subscriber sub : subscribers) {
			sub.update();
		}
	}

}
