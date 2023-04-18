package com.psl.gems.games.players;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.psl.gems.games.cards.Card;

public class PokerCardPlayer {
	private String name;
	private Set<Card> cards;
	public PokerCardPlayer(String name, Set<Card> cards) {
		super();
		this.name = name;
		this.cards = cards;
	}
	public PokerCardPlayer(String name) {
		super();
		this.name = name;
		this.cards = new HashSet<>();
	}
	public void addCard(Card card) {
		this.cards.add(card);
	}
	public int getMaximumWeight() {
		int maxWeight=0;
		Iterator<Card> itr = getCards().iterator();
		while(itr.hasNext()) {
			int tempWeight = itr.next().getWeightValue();
			if(maxWeight<tempWeight) {
				maxWeight = tempWeight;
			}
		}
		return maxWeight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Card> getCards() {
		return cards;
	}
	public void setCards(Set<Card> cards) {
		this.cards = cards;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PokerCardPlayer [name=");
		builder.append(name);
		builder.append(", cards=");
		builder.append(cards);
		builder.append("]");
		return builder.toString();
	}
	
}
