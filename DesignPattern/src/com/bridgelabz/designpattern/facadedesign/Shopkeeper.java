package com.bridgelabz.designpattern.facadedesign;

public class Shopkeeper {
	
	private MobileDetails samsung;
	private MobileDetails realme;
	private InsuranceDetails saminsurance;
	private InsuranceDetails realinsurance;

	public Shopkeeper() {
		
		samsung = new Samsung();
		realme = new Realme();
		saminsurance = new SamInsurance();
		realinsurance = new RealInsurance();
	}

	public void samsungsale() {

		samsung.mobileName();
		samsung.price();
		saminsurance.insurancePrice();
		saminsurance.paymentThrough();
	}

	public void realmesale() {

		realme.mobileName();
		realme.price();
		realinsurance.insurancePrice();
		realinsurance.paymentThrough();
	}

}
