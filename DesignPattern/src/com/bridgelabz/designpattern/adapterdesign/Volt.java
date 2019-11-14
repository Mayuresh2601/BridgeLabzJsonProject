package com.bridgelabz.designpattern.adapterdesign;

public class Volt {
	
	private int volt;
	
	/**
	 * @return Volt 
	 */
	public int getVolt() {
		return volt;
	}

	/**
	 * @param volt
	 * Method to Set the Volt
	 */
	public void setVolt(int volt) {
		this.volt = volt;
	}

	public Volt(int v) {
		
		this.volt = v;
	}

}
