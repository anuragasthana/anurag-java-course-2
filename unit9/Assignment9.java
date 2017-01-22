package unit9;

import java.util.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Assignment9.
 */
public class Assignment9 {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		Random rnd = new Random();
		int number = rnd.nextInt(1001);

		Thread count1 = new FindIt(number, 0, 349);
		Thread count2 = new FindIt(number, 350, 699);
		Thread count3 = new FindIt(number, 700, 1000);

		count1.start();
		count2.start();
		count3.start();
	}

}
