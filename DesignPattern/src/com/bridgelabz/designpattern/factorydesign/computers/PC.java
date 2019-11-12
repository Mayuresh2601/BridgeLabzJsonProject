package com.bridgelabz.designpattern.factorydesign.computers;

public class PC extends Computer{
	
	private String RAM;
	private String HDD;
	private String CDRom;
	
	public PC(String RAM,String HDD,String CDRom){
		super();
		this.RAM = RAM;
		this.HDD = HDD;
		this.CDRom = CDRom;
	}

	@Override
	public String getRam() {
		
		return this.RAM;
	}

	@Override
	public String getHardDisk() {
		
		return this.HDD;
	}

	@Override
	public String getCDRom() {
		
		return this.CDRom;
	}

}
