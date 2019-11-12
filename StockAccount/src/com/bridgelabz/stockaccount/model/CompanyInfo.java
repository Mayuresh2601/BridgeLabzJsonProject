package com.bridgelabz.stockaccount.model;

public class CompanyInfo {
	
	private String Companyname;
	private String Symbol;
	private int Totalshares;
	private int Pricepershare;
	
	public int getTotalshares() {
		return Totalshares;
	}

	public void setTotalshares(int totalshares) {
		Totalshares = totalshares;
	}

	public int getPricepershare() {
		return Pricepershare;
	}

	public void setPricepershare(int pricepershare) {
		Pricepershare = pricepershare;
	}
	
	public String getCompanyname() {
		return Companyname;
	}
	
	public void setCompanyname(String Companyname) {
		this.Companyname = Companyname;
	}
	
	public String getSymbol() {
		return Symbol;
	}
	
	public void setSymbol(String Symbol) {
		this.Symbol = Symbol;
	}

}
