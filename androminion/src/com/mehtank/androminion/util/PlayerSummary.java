package com.mehtank.androminion.util;

/**
 * Information about one player
 * 
 * deck, hand size, total number of cards etc.
 */

public class PlayerSummary {
	@SuppressWarnings("unused")
	private static final String TAG = "PlayerSummary";
	
	public String name;
	public String realName;
	public int deckSize;
	public int handSize;
	public int numCards;
	public int pt;
	public int vt;
	public int gct; // Guilds Coin Tokens
	public boolean highlight = false;
	public int turns;
	
	public PlayerSummary(String name) {
		this.name = name;
	}
	
	public void set(String name, int turns, int deckSize, int handSize, int numCards, int pt, int vt, int gct, boolean highlight){
		this.name = name;
		this.turns = turns;
		this.deckSize = deckSize;
		this.handSize = handSize;
		this.numCards = numCards;
		this.pt = pt;
		this.vt = vt;
		this.gct = gct;
		this.highlight = highlight;
	}
	
	@Override
	public String toString() {
		return name; 
	}
}