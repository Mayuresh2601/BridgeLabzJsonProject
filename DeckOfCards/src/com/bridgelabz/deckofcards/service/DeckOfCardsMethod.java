package com.bridgelabz.deckofcards.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DeckOfCardsMethod {
	
	private static String[] suits = {"Heart","Spade","Club","Diamond"};
	private static String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	private static String[] cards = new String[52];
	Map<String,String> map = new HashMap<String, String>();
	
	//Storing Cards on cards array 
	public String[] getCards() {
		int i=0;
		for(String suit : suits)
		{
			for (String rank : ranks) {
				cards[i] = rank +" - "+ suit;
				i++;
			}
		}
		return cards;
	}
	
	// shuffle cards using random  function
	public void shuffleCard() {
		
		Random random = new Random();
		for (int i = 0; i < cards.length; i++)
		{
			int index = random.nextInt(52);
			String temp = cards[index];
			cards[index] = cards[i];
			cards[i] = temp;
		}
	}
	
	//Distributing Equal Number of Cards to Each Player
	public String[][] distribute(int number_of_player,int number_of_cards) {
		
		String[][] PlayerCards = new String[number_of_player][number_of_cards];
		
		int k =0;
		for (int i = 0; i < number_of_player; i++) {
			for (int j = 0; j < number_of_cards; j++) {
				PlayerCards[i][j] = cards[k];
				k++;
			}
		}
		return PlayerCards;
	}
	
	//Displaying Each Players Cards
	public void displayCards(String[][] PlayerCards) {
		
		int i=1;
		for (String[] PlayerCard : PlayerCards) {
			
				System.out.println();
				System.out.println("player " + (i++) + " Cards are: ");

				for (String card : PlayerCard) {
					
					map.put(card, card);
					System.out.print(card + ",  ");
				}
				System.out.println();

			
		}

	}

}
