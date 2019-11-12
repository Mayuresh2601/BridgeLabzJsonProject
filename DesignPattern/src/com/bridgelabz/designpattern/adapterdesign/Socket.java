package com.bridgelabz.designpattern.adapterdesign;

public class Socket {

	public Volt getVolt() {
		
		return new Volt(120);
	}

}
