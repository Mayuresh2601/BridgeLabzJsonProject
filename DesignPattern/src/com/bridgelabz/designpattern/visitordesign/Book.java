package com.bridgelabz.designpattern.visitordesign;

public class Book implements ItemsI{

	private int price;
	private String isbookNumber;
	
	public Book(int cost, String isbook){
		this.price=cost;
		this.isbookNumber=isbook;
	}
	
	public int getPrice() {
		return price;
	}

	public String getIsbookNumber() {
		return isbookNumber;
	}

	@Override
	public int accept(ShoppingCart visitor) {
		return visitor.visit(this);
	}

}
