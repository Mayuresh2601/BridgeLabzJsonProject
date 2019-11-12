package com.bridgelabz.designpattern.factorydesign.computers;

public abstract class Computer {
	
	public abstract String getRam();
	
	public abstract String getHardDisk();
	
	public abstract String getCDRom();

	public String toString() {
		return ("Ram: "+ this.getRam() + ", HDD: "+this.getHardDisk()+", CDRom: "+this.getCDRom());
	}

}
