package com.bridgelabz.designpattern.adapterdesign;

public class SocketObjectAdapter extends Socket implements SocketAdapter{

	private Socket socket = new Socket();
	
	@Override
	public Volt get120Volt() {
		
		return socket.getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt v = socket.getVolt();
		return convertVolt(v,20);
	}

	@Override
	public Volt get3Volt() {
		Volt v = socket.getVolt();
		return convertVolt(v,30);
	}
	
	private Volt convertVolt(Volt v, int t) {
		
		return new Volt(v.getVolt()/t);
	}

}
