package unit3;

// TODO: Auto-generated Javadoc
/**
 * The Interface Animals.
 */
public interface Animals {

	/** The age. */
	int age = Input.getInt("What is the age of your animal?");

	/** The weight. */
	int weight = Input.getInt("What is the weight of your animal?");

	/**
	 * Sound.
	 */
	void sound();
}
