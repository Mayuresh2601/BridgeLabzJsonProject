package com.bridgelabz.designpattern.facadedesign;

public class Shopkeeper {
	
	private MobileDetails samsung;
	private MobileDetails realme;
	private InsuranceDetails saminsurance;
	private InsuranceDetails realinsurance;

	/**
	 * Shopkeeper Constructor to create object of Class used
	 */
	public Shopkeeper() {
		
		samsung = new Samsung();
		realme = new Realme();
		saminsurance = new SamInsurance();
		realinsurance = new RealInsurance();
	}

	/**
	 * Method to get details of the Samsung Phone Sale and Insurance Price
	 */
	public void samsungsale() {

		samsung.mobileName();
		samsung.price();
		saminsurance.insurancePrice();
		saminsurance.paymentThrough();
	}

	/**
	 * Method to get details of Realme Phone Sale and Insurance Price
	 */
	public void realmesale() {

		realme.mobileName();
		realme.price();
		realinsurance.insurancePrice();
		realinsurance.paymentThrough();
	}

}
