package com.bridgelabz.designpattern.adapterdesign;

public class SocketObjectAdapter extends Socket implements SocketAdapter{

	private Socket socket = new Socket();
	
	/* Method to get 120Volt from Adapter
	 */
	@Override
	public Volt get120Volt() {
		
		return socket.getVolt();
	}

	/* Method to get 12Volt by converting from Adapter
	 */
	@Override
	public Volt get12Volt() {
		Volt v = socket.getVolt();
		return convertVolt(v,20);
	}

	/* Method to get 3Volt by converting from Adapter
	 */
	@Override
	public Volt get3Volt() {
		Volt v = socket.getVolt();
		return convertVolt(v,30);
	}
	
	/**
	 * @param v
	 * @param t
	 * @return Converted Volt by the Adapter
	 */
	private Volt convertVolt(Volt v, int t) {
		
		return new Volt(v.getVolt()/t);
	}

}
