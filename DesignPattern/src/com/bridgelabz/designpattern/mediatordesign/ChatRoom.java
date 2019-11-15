package com.bridgelabz.designpattern.mediatordesign;

import java.util.Date;

public class ChatRoom {
	
	/**Method to Show Message
	 * @param user
	 * @param message
	 */
	public static void show(User user,String message) {
		
		System.out.println(new Date() + " [" + user.getUsername() + "] :"+ message);
	}

}
