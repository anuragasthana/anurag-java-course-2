package unit3;

/**
 * The Class FrenchPoodle.
 */
public class FrenchPoodle extends Dog {

	/*
	 * from Animals interface
	 */
	public void sound() {
		System.out.println("Bonjour mon ami.");
	}

	/**
	 * Shake hands.
	 */
	public void shakeHands() {
		System.out.println("Pleasure to meet you.");
	}

	/*
	 * from DogActions interface
	 */
	public void sitUp() {
		System.out.println("I'm waiting...");

	}

	/*
	 * from DogActions interface
	 */
	public void lieDown() {
		System.out.println("Should I play dead or...?");

	}

}
