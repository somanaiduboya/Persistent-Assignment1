package com.psl.gems.games;

import java.util.Iterator;

import com.psl.gems.games.cards.Card;
import com.psl.gems.games.packs.PokerCardPack;
import com.psl.gems.games.players.PokerCardPlayer;

public class PokerCardGame {
	private PokerCardPack pack;
	private PokerCardPlayer player1;
	private PokerCardPlayer player2;
	public PokerCardGame(PokerCardPack pack, PokerCardPlayer player1, PokerCardPlayer player2) {
		super();
		this.pack = pack;
		this.player1 = player1;
		this.player2 = player2;
	}
	public PokerCardGame(PokerCardPlayer player1, PokerCardPlayer player2) {
		this.player1 = player1;
		this.player2 = player2;
	}
	public PokerCardGame() {
		super();
	}
	public PokerCardPack getPack() {
		return pack;
	}
	public void setPack(PokerCardPack pack) {
		this.pack = pack;
	}
	public PokerCardPlayer getPlayer1() {
		return player1;
	}
	public void setPlayer1(PokerCardPlayer player1) {
		this.player1 = player1;
	}
	public PokerCardPlayer getPlayer2() {
		return player2;
	}
	public void setPlayer2(PokerCardPlayer player2) {
		this.player2 = player2;
	}
	public void distributeCards() {
		Iterator<Card> itr = pack.getCards().iterator();
		int i=0;
		while(i<3 && itr.hasNext()) {
			player1.addCard(itr.next());
			player2.addCard(itr.next());
		}
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PokerCardGame [pack=");
		builder.append(pack);
		builder.append(", player1=");
		builder.append(player1);
		builder.append(", player2=");
		builder.append(player2);
		builder.append("]");
		return builder.toString();
	}
	public void play() {
		
		
		if(player1!=null && player2!=null) {
			this.pack = new PokerCardPack();
			System.out.println("Initial Pack : "+pack);
			pack.sortByAscendingOrder();
			System.out.println("Ascending Pack : "+pack);
			pack.sortByDescendingOrder();
			System.out.println("Descending Pack : "+pack);
			pack.shuffleCards();
			System.out.println("Shuffled Pack : "+pack);
			System.out.println("Top Card = " +pack.getTopCard());
			System.out.println("size = " +pack.getSize());
			System.out.println("Random Card = " +pack.getRandomCard());
			System.out.println("Top Card Weight Value "+ pack.getTopCard().getWeightValue());
			
			System.out.println("Distributing Cards ");
			distributeCards();
			System.out.println(getWinner().getName());
		}
		else {
			System.out.println("A Minimum of Two Players required to play Poker Card Game");
		}
	}
	public PokerCardPlayer getWinner() {
		int firstPlayerMaxWeightVaue = player1.getMaximumWeight();
		int secondPlayerMaxWeightVaue = player2.getMaximumWeight();
		System.out.println(player1.getName()+"-----"+player1.getMaximumWeight());
		System.out.println(player2.getName()+"-----"+player2.getMaximumWeight());
		if(firstPlayerMaxWeightVaue<secondPlayerMaxWeightVaue) {
			return player2;
		}
		if(firstPlayerMaxWeightVaue>secondPlayerMaxWeightVaue) {
			return player1;
		}
		return null;
	}


}
