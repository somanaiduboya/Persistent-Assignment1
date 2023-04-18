package com.psl.gems.games.cards.sorts;

import java.util.Comparator;

import com.psl.gems.games.cards.Card;

public class DescendingCardComparator implements Comparator<Card>{
	@Override
	public int compare(Card card, Card other) {
		if (card.getSuit().getWeight()==other.getSuit().getWeight())
			return other.getRank().getWeight()-card.getRank().getWeight();
		return other.getSuit().getWeight()-card.getSuit().getWeight();
	}
}
