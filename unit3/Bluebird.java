package unit3;

/**
 * The Class Bluebird.
 */
public class Bluebird extends Bird {

	/*
	 * sound from Animals interface
	 */
	public void sound() {
		System.out.println("eek eek eek");
	}

	/*
	 * fly from BirdActions interface
	 */
	public void fly() {
		System.out
				.println("Is it a bird? Is it a plane?... No wait, its a bird");
	}

}
