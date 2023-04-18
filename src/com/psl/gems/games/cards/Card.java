package com.psl.gems.games.cards;

import java.util.Objects;

public class Card{
	private Suit suit;
	private Rank rank;
	public int getWeightValue() {
		return rank.getWeight() * 4 + suit.getWeight();
	}
	public Card() {
		super();
	}
	public Card(Rank rank, Suit suit) {
		super();
		this.rank = rank;
		this.suit = suit;
	}
	public Rank getRank() {
		return rank;
	}
	public void setRank(Rank rank) {
		this.rank = rank;
	}
	public Suit getSuit() {
		return suit;
	}
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		builder.append(suit);
		builder.append(",");
		builder.append(rank);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		return Objects.hash(suit.getWeight(),rank.getWeight());
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return suit.getWeight() == other.getSuit().getWeight() && rank.getWeight() == other.getRank().getWeight();
	}
}
