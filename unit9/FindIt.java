package unit9;

/**
 * The Class FindIt.
 */
public class FindIt extends Thread {

	/** The num. */
	private int num;

	/** The start num. */
	private int startNum;

	/** The end num. */
	private int endNum;

	/**
	 * Instantiates a new find it.
	 *
	 * @param num
	 *            the num
	 * @param startNum
	 *            the start num
	 * @param endNum
	 *            the end num
	 */
	public FindIt(int num, int startNum, int endNum) {
		this.num = num;
		this.startNum = startNum;
		this.endNum = endNum;
	}

	public void run() {
		for (int i = startNum; i < endNum; i++) {
			if (i == num) {
				System.out
						.println(this.getName() + ": Target Number is " + num);
			}
			if (i % 10 == 0) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {

				}
			}

		}
	}

}
