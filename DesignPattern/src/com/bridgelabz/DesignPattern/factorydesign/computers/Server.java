package com.bridgelabz.DesignPattern.factorydesign.computers;

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
		// TODO Auto-generated method stub
		return this.RAM;
	}

	@Override
	public String getHardDisk() {
		// TODO Auto-generated method stub
		return this.HDD;
	}

	@Override
	public String getCDRom() {
		// TODO Auto-generated method stub
		return this.CDRom;
	}
	
	

}
