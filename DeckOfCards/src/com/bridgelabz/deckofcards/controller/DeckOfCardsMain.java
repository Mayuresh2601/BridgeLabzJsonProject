package com.bridgelabz.deckofcards.controller;

import com.bridgelabz.deckofcards.service.DeckOfCardsMethod;

public class DeckOfCardsMain {

	public static void main(String[] args) {
		
		DeckOfCardsMethod method = new DeckOfCardsMethod();
		
		method.getCards();
		
		method.shuffleCard();
		
		String[][] playerCards = method.distribute(4,9);
		
		method.displayCards(playerCards);
	}

}
