package com.bridgelabz.designpattern.visitordesign;

public class Book implements ItemsI{

	private int price;
	private String isbnNumber;
	
	public Book(int cost, String isbn){
		this.price=cost;
		this.isbnNumber=isbn;
	}
	
	public int getPrice() {
		return price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	@Override
	public int accept(ShoppingCart visitor) {
		return visitor.visit(this);
	}

}
