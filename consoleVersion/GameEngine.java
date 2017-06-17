package consoleVersion;

import java.util.*;

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
public class GameEngine {

	private static Scanner kb = new Scanner(System.in);
	private static Player heroGuy;
	private static UI engine = new UI();

	/*
	 * The main method, only here to start the game
	 */
	public static void main(String[] args) throws Exception {
		startGame();
	}

	public static void startGame() throws Exception {
		// Testing the player instantion
		engine.welcomeMessage();
		engine.setTheScene();
		// Give player time to read
		Thread.sleep(10000);
		System.out.println("\nProgram waited, time to leave!");
		System.exit(0);

		// Rough exit predicted after the game finds it's end
		// while (true) {
		// System.out.println();
		// }

	}
}
