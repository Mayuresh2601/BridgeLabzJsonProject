package com.bridgelabz.designpattern.mediatordesign;

public class User {
	
	private String username;
	
	public User(String username){
		
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	/**Method to Send Message
	 * @param message
	 */
	public void sendMessage(String message){
		
		ChatRoom.show(this,message);
	}

}
