package consoleVersion;

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
 * This class will control the behavior of the Gun object, including various instantiations of different kinds of guns
 */
@SuppressWarnings("unused")
public class Gun {

	private String type;
	private int damage;
	private double accuracy;

	public Gun(String t) {
		// check for type and change attributes based off string, no validation
		// yet
		switch (t) {
		case "pistol":
			damage = 10;
			accuracy = .80;
			break;
		case "shotgun":
			damage = 40;
			accuracy = .30;
			break;
		case "rifle":
			damage = 25;
			accuracy = 50;
			break;
		case "hands":
			damage = 1000;
			accuracy = 100;
		default:
			System.out.println("Invalid gun type, try again my friend.");
			break;
		}

	}
}
