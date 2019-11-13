package com.bridgelabz.designpattern.visitordesign;

public interface ShoppingCart {

	int visit(Book book);
	
	int visit(Fruit fruit);

}
