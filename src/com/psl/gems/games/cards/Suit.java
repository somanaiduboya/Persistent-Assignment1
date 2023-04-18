package com.psl.gems.games.cards;

public enum Suit {
	CLUB(0),DIAMOND(1),HEART(2),SPADE(3);
	private int weight;
	Suit(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
}
