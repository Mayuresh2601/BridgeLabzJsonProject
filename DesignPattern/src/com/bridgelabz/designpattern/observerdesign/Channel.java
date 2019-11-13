package com.bridgelabz.designpattern.observerdesign;

import java.util.ArrayList;
import java.util.List;

public class Channel {
	
	private String title;
	private List<Subscriber> subscribers = new ArrayList<Subscriber>();
	
	public void register(Subscriber sub) {
		
		subscribers.add(sub);
	}
	
	public void unregister(Subscriber sub) {
		
		subscribers.remove(sub);
	}
	
	public void upload(String title) {
		
		this.title = title;
		notifySubscribers();
	}
	
	public void notifySubscribers() {
		
		for (Subscriber sub : subscribers) {
			sub.update();
		}
	}

}
