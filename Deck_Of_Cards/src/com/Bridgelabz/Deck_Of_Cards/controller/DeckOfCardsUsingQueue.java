package com.Bridgelabz.Deck_Of_Cards.controller;

import com.Bridgelabz.Deck_Of_Cards.service.DeckOfCardsMethod;

public class DeckOfCardsUsingQueue<T>  {
	
	private int front;
	private int rear;
	private int length;
	private int size;
	private T[] queue;
	
	public DeckOfCardsUsingQueue() {
		front = 0;
		rear = 0;
		length=0;
		size=50;
		queue = (T[]) new Object[size];
	}
	
	public DeckOfCardsUsingQueue(int size) {
		front = 0;
		rear = 0;
		length = 0;
		this.size = size;
		queue = (T[]) new Object[this.size];
	}
	
	public boolean enQueue(T item) {
		if(!isFull()) {
			length++;
			queue[rear] = item;
			rear = (rear+1)%size;
			return true;
		}
		else {
			return false;
		}

	}
	
	public int size() {
		
		return length;
	}

	public boolean isFull() {
		if(size == length) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public T deQueue() throws Exception{
		if(isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		else {
			length--;
			T element = queue[front];
			front = (front+1)%size;
			return element;
		}
	}

	public boolean isEmpty() {
		if(front == 0 && rear == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void display() {
		
		for (int i = 0; i < length; i++) {
			System.out.println(queue[i]);
		}

	}

	public static void main(String[] args) {
   
			 DeckOfCardsUsingQueue cards = new DeckOfCardsUsingQueue();
		     DeckOfCardsMethod method = new DeckOfCardsMethod();
		     method.getCards();
		     method.shuffleCard();
		     
		     
		     String playercards[][]=method.distribute(4, 9);
		     
		     int i=1;
		     for(String [] playcard:playercards)
		     {
		    	 
		    	 System.out.println();
		    	 System.out.print("Player "+(i++)+"Cards: ");
		    	 for(String card:playcard)
		    	 {
		    		 cards.enQueue(card);
		    		 System.out.print(card+",  ");
		    	 }
		     }
		     
		     

	}

}