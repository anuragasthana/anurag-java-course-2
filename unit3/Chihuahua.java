package unit3;

/**
 * The Class Chihuahua.
 */
public class Chihuahua extends Dog {

	/*
	 * from Animals interface
	 */
	public void sound() {
		System.out.println("Yo quiero Taco Bell.");
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
