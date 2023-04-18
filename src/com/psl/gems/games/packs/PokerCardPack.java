package com.psl.gems.games.packs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import com.psl.gems.games.cards.Card;
import com.psl.gems.games.cards.Rank;
import com.psl.gems.games.cards.Suit;
import com.psl.gems.games.cards.sorts.AscendingCardComparator;
import com.psl.gems.games.cards.sorts.DescendingCardComparator;
public class PokerCardPack {
	private Set<Card> cards;
	public PokerCardPack() {
		super();
		setAllCards();
	}
	public void setAllCards() {
		Set<Card> cards = new LinkedHashSet<>();
		for(Suit suit: Suit.values())
		{
			for(Rank rank: Rank.values()) {
				Card card = new Card(rank,suit);
				cards.add(card);
			}
		}
		this.cards =  cards;
	}
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public void shuffleCards(){
		List<Card> cards2 = new ArrayList<>(cards);
		Collections.shuffle(cards2);
		this.cards = new LinkedHashSet<>(cards2);
	}
	public void shuffleCards1(){
		Set<Card> cards2 = new HashSet<>(cards);
		this.cards = new LinkedHashSet<>(cards2);
	}
	public Card getRandomCard(){
		Random random = new Random();
        int randomNumber = random.nextInt(cards.size());
        int cnt =0;
        Iterator<Card> itr = cards.iterator();
        while(itr.hasNext()) {
        	if(cnt==randomNumber) {
        		return itr.next();
        	}
        	itr.next();
        	cnt++;
        }
        return null;
	}
	public Card getTopCard(){
		Iterator<Card> itr = cards.iterator();
		if(itr.hasNext())
			return itr.next();
		return null;
	}
	public int getSize(){
		return cards.size();
	}
	public void sortByDescendingOrder(){
		List<Card> c1 = new ArrayList<>(cards);
		Collections.sort(c1, new DescendingCardComparator());
		this.cards = new LinkedHashSet<>(c1);
	}
	public void sortByAscendingOrder(){
		List<Card> c1 = new ArrayList<>(cards);
		Collections.sort(c1, new AscendingCardComparator());
		this.cards = new LinkedHashSet<>(c1);
	}
	
	public PokerCardPack(Set<Card> cards) {
		super();
		this.cards = cards;
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
		builder.append("PokerCardPack [cards=");
		builder.append(cards);
		builder.append("]");
		return builder.toString();
	}
	
}
