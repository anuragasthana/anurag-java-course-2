package unit3;

/**
 * The Class Robin.
 */
public class Robin extends Bird {

	/*
	 * from Animals interface
	 */
	public void sound() {
		System.out.println("chirp chirp");
	}

	/*
	 * from BirdActions interface
	 */
	public void fly() {
		System.out.println("I believe I can flyyyyy....");
	}

}
