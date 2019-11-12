package com.bridgelabz.designpattern.prototypedesign;

import java.util.ArrayList;
import java.util.List;

public class BookStore implements Cloneable{
	
	private String storeName;
	private List<Books> books = new ArrayList<Books>();

	public String getStoreName() {
		return storeName;
	}
	
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	
	public List<Books> getBooks() {
		return books;
	}
	
	public void setBooks(List<Books> books) {
		this.books = books;
	} 
	
	public void loadData() {
		
		for (int i = 1; i <=10 ; i++) {
			Books b = new Books();
			b.setBid(i);
			b.setBname("Book"+i);
			getBooks().add(b);
		}
	}

	@Override
	public String toString() {
		return "BookStore [storeName=" + storeName + ", books=" + books + "]";
	}

//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}
	
	@Override
	protected BookStore clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		BookStore shop = new BookStore();
		
		for (Books b : this.getBooks()) {
			shop.getBooks().add(b);
		}
		
		return shop;
	}
}
