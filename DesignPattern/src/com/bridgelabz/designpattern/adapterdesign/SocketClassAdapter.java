package com.bridgelabz.designpattern.adapterdesign;

public class SocketClassAdapter extends Socket implements SocketAdapter{

	/* Method to get 120Volt from Adapter
	 */
	@Override
	public Volt get120Volt() {
		// TODO Auto-generated method stub
		return getVolt();
	}

	/* Method to get 12Volt by converting from Adapter
	 */
	@Override
	public Volt get12Volt() {
		Volt v = getVolt();
		return convertVolt(v,10);
	}

	/* Method to get 3Volt by converting from Adapter
	 */
	@Override
	public Volt get3Volt() {
		Volt v = getVolt();
		return convertVolt(v,40);
	}
	
	/**
	 * @param v
	 * @param t
	 * @return Converted Volt by the Adapter
	 */
	private Volt convertVolt(Volt v,int t) {
		
		return new Volt(v.getVolt()/t);
	}

}
