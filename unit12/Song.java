package unit12;

/**
 * The Class Song.
 */
public class Song {

	/** The title. */
	private String title;

	/** The artist. */
	private String artist;

	/** The price. */
	private double price;

	/**
	 * Instantiates a new song.
	 *
	 * @param title
	 *            the title
	 * @param artist
	 *            the artist
	 * @param price
	 *            the price
	 */
	public Song(String title, String artist, double price) {
		this.title = title;
		this.artist = artist;
		this.price = price;
	}

	/**
	 * Instantiates a new song.
	 */
	public Song() {

	}

	/**
	 * Gets the title.
	 *
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the title.
	 *
	 * @param title
	 *            the new title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the artist.
	 *
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}

	/**
	 * Sets the artist.
	 *
	 * @param artist
	 *            the new artist
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Sets the price.
	 *
	 * @param price
	 *            the new price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

}
