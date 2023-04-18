package com.psl.gems.client;

import com.psl.gems.games.PokerCardGame;
import com.psl.gems.games.packs.PokerCardPack;
import com.psl.gems.games.players.PokerCardPlayer;

public class TestClient {
public static void main(String[] args) {
	PokerCardGame game = new PokerCardGame();
	PokerCardPlayer player1 = new PokerCardPlayer("Somanaidu");
	PokerCardPlayer player2 = new PokerCardPlayer("Rajanaidu");
	PokerCardPack pack = new PokerCardPack();
	game.setPlayer1(player1);
	game.setPlayer2(player2);
	game.setPack(pack);
	game.play();
}
}
