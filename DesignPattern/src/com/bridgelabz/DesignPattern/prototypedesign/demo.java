package com.bridgelabz.DesignPattern.prototypedesign;

public class demo {
	
//	public static void main(String[] args) throws CloneNotSupportedException {
//		
//		BookStore bs = new BookStore();
//		bs.setStoreName("Navneet");
//		bs.loadData();
//		System.out.println(bs);
//		
//		BookStore Bs1 = (BookStore) bs.clone();
//		Bs1.setStoreName("Alien");
//		Bs1.loadData();
//		System.out.println(Bs1);
//	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		BookStore bs = new BookStore();
		bs.setStoreName("Navneet");
		bs.loadData();
		
		
		
		BookStore bs1 = bs.clone();
		bs1.setStoreName("A1");
		
		bs.getBooks().remove(2);
		System.out.println(bs);
		System.out.println(bs1);
	}

}
