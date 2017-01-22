package unit3;

import java.util.Random;

/**
 * The Class Actions.
 */
public class Actions {

	/**
	 * The main method.
	 *
	 * 
	 */
	public static void main(String[] args) {

		Random randNum = new Random();
		Animals[] soundtest = { new Chihuahua(), new FrenchPoodle(),
				new Robin(), new Bluebird() };
		for (int i = 0; i < 6; i++) {
			int j = randNum.nextInt(4);
			soundtest[j].sound();
		}
	}
}
