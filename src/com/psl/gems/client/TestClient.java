package com.psl.gems.client;

import com.psl.gems.games.PokerCardGame;
import com.psl.gems.games.cards.Card;
import com.psl.gems.games.cards.Rank;
import com.psl.gems.games.cards.Suit;
import com.psl.gems.games.packs.PokerCardPack;
import com.psl.gems.games.players.PokerCardPlayer;

public class TestClient {
public static void main(String[] args) {
	PokerCardGame game = new PokerCardGame();
	PokerCardPlayer player1 = new PokerCardPlayer("Somanaidu");
	PokerCardPlayer player2 = new PokerCardPlayer("Rajanaidu");
	PokerCardPack pack = new PokerCardPack();
	
	// adding cards manually
//	Card c1 = new Card(Rank.ACE,Suit.HEART);
//	Card c2 = new Card(Rank.THREE,Suit.SPADE);
//	Card c3 = new Card(Rank.KING,Suit.CLUB);
//	Card c4 = new Card(Rank.FIVE,Suit.HEART);
//	Card c5 = new Card(Rank.TEN,Suit.DIAMOND);
//	Card c6 = new Card(Rank.JACK,Suit.DIAMOND);
//	pack.addCard(c1);
//	pack.addCard(c2);
//	pack.addCard(c3);
//	pack.addCard(c4);
//	pack.addCard(c5);
//	pack.addCard(c6);
	
	
	//setting pack with all 52 cards
	pack.setAllCards();
	
	game.registerPlayer(player1);
	game.registerPlayer(player2);
	
	
	game.setPack(pack);
	PokerCardPlayer winner = game.play();
	System.out.println("Winner is "+winner.getName());
	
	//Maximum Weights of the players
//	System.out.println(game.getPlayers().get(0).getName()+"----"+game.getPlayers().get(0).getMaximumWeight());
//	System.out.println(game.getPlayers().get(1).getName()+"----"+game.getPlayers().get(1).getMaximumWeight());
}
}
