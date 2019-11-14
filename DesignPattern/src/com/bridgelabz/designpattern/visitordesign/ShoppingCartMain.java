/******************************************************************************
*  
*  Purpose: To Perform Visitor Design Pattern
*  @author  Mayuresh Sunil Sonar
*
******************************************************************************/
package com.bridgelabz.designpattern.visitordesign;

public class ShoppingCartMain {
	
	public static void main(String[] args) {
		ItemsI[] items = new ItemsI[]{new Book(20, "1234"),new Book(100, "5678"),
				new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple")};
		
		int total = calculatePrice(items);
		System.out.println("Total Cost = "+total);
	}

	private static int calculatePrice(ItemsI[] items) {
		ShoppingCart visitor = new ShoppingCartVisitor();
		int sum=0;
		for(ItemsI item : items){
			sum = sum + item.accept(visitor);
		}
		return sum;
	}

}
