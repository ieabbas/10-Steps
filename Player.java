package 10Steps;

/*
 * A variant of an academic project put forth by Professor Edwin Rodriguez of Cal Poly Pomona, this is a 
 * console baseed RPG where you control(insert your hero/heroine's name here) and attempt to escape a 
 * trap they found themselves inside a cave. Armed with one of three weapons chosen by the player at the start of 
 * the game, the hero/heroine is 10 steps away from the cave, and freedom. Every step they take however, there is 
 * a chance to encounter a thug(unarmed or armed with a randomly chosen weapon). You may try to fight, take a step
 * back, or attempt to escape (Pokemon style). Don't forget your power ups either, an extra magazine 
 * and a health pack may come in handy! No matter what, one thing is for certain however, it'll be the most 
 * difficult 10 steps you ever take.
 * 
 * 
 * Creator: ieabbas
 */

/*
 * This class aims to establish the Player within the game, as well as the various attributes the character will have.
 */

public class Player {

	/*
	 * This field represents the name of the Player.
	 */
	private String name;
	/*
	 * This object represents the weapon the {@param Player} will be using.
	 */
	private Gun weapon;
	/*
	 * This field represents the total amount of hitPoints the {@param Player} starts at.
	 */
	private int hitPoints;

	public Player(String playerName, Gun wep) {
		name = playerName;
		weapon = wep;
		hitPoints = 15;
	}
}
