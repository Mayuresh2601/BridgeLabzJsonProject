package com.bridgelabz.designpattern.adapterdesign;

public class SocketClassAdapter extends Socket implements SocketAdapter{

	@Override
	public Volt get120Volt() {
		// TODO Auto-generated method stub
		return getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt v = getVolt();
		return convertVolt(v,10);
	}

	@Override
	public Volt get3Volt() {
		Volt v = getVolt();
		return convertVolt(v,40);
	}
	
	private Volt convertVolt(Volt v,int t) {
		
		return new Volt(v.getVolt()/t);
	}

}
