package com.bridgelabz.designpattern.visitordesign;

public class ShoppingCartVisitor implements ShoppingCart{

	/* Method generate discount if price is > 50
	 */
	@Override
	public int visit(Book book) {
		int cost=0;
		//apply 5$ discount if book price is greater than 50
		if(book.getPrice() > 50){
			cost = book.getPrice()-5;
		}else cost = book.getPrice();
		System.out.println("Book ISBN::"+book.getIsbookNumber() + " cost ="+cost);
		return cost;
	}

	/* Method to calculate the price of fruit per kg
	 */
	@Override
	public int visit(Fruit fruit) {
		int cost = fruit.getPricePerKg()*fruit.getWeight();
		System.out.println(fruit.getName() + " cost = "+cost);
		return cost;
	}
}
