package com.bridgelabz.designpattern.factorydesign.computers;

public class Server extends Computer{

	private String RAM;
	private String HDD;
	private String CDRom;
	
	public Server(String RAM,String HDD,String CDRom) {
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
