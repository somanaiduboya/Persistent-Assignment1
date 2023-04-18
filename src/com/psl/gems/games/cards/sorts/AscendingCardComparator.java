package com.psl.gems.games.cards.sorts;

import java.util.Comparator;

import com.psl.gems.games.cards.Card;

public class AscendingCardComparator implements Comparator<Card> {
	@Override
	public int compare(Card card, Card other) {
		if (card.getSuit().getWeight()==other.getSuit().getWeight())
			return card.getRank().getWeight()-other.getRank().getWeight();
		return card.getSuit().getWeight()-other.getSuit().getWeight();
	}

}
