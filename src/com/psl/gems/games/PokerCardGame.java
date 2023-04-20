package com.psl.gems.games;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.psl.gems.games.cards.Card;
import com.psl.gems.games.packs.PokerCardPack;
import com.psl.gems.games.players.PokerCardPlayer;

public class PokerCardGame {
	private PokerCardPack pack;
	private List<PokerCardPlayer> players;
	public void registerPlayer(PokerCardPlayer player) {
		players.add(player);
	}
	private void distributeCards() {
		if (pack.getCards().size() >= 6) {
			int i = 0;
			while(i<3) {
				for(PokerCardPlayer player: players) {
					player.addCard(pack.getTopCard());
					pack.getCards().remove(pack.getTopCard());
				}
				i++;
			}
		}
	}
	public PokerCardPlayer play() {

		if (players.size()>=2) {
//			// sorting cards of pack in descending order
//			pack.sortByDescendingOrder();
//			//sorting cards of pack in ascending order
//			pack.sortByAscendingOrder();
//			//random card
//			Card randomCard = pack.getRandomCard();
//			//top card
//			Card topCard = pack.getTopCard();
//			//size of the pack
//			int sizeOfPack = pack.getSize();
			

			pack.shuffleCards();
			
			
			distributeCards();
			return getWinner();
		}
		return null;
	}

	private PokerCardPlayer getWinner() {
		
		int maxWeight=0;
		int index=0;
		for(PokerCardPlayer player : players) {
			if(maxWeight<player.getMaximumWeight()) {
				maxWeight = player.getMaximumWeight();
				index = players.indexOf(player);
			}
		}
		return players.get(index);
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PokerCardGame [pack=");
		builder.append(pack);
		builder.append(", players=");
		builder.append(players);
		builder.append("]");
		return builder.toString();
	}
	public PokerCardGame(PokerCardPack pack, List<PokerCardPlayer> players) {
		super();
		this.pack = pack;
		this.players = players;
	}


	public PokerCardGame() {
		super();
		players = new ArrayList<>();
	}

	public PokerCardPack getPack() {
		return pack;
	}

	public void setPack(PokerCardPack pack) {
		this.pack = pack;
	}

	public List<PokerCardPlayer> getPlayers() {
		return players;
	}

	public void setPlayers(List<PokerCardPlayer> players) {
		this.players = players;
	}

}
