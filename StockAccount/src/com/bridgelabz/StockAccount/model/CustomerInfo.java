package com.bridgelabz.StockAccount.model;

public class CustomerInfo {
	
	private String custname;
	private int amount;
	private String symbol;
	
	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getCustname() {
		return custname;
	}
	
	public void setCustname(String custname) {
		this.custname = custname;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}

}
