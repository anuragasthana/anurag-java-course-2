package unit4;

public class DivideByZeroException extends Exception {
	private int denom;

	public DivideByZeroException() {
	}

	public DivideByZeroException(String s) {
		super(s);
	}

	/**
	 * Instantiates a new divide by zero exception.
	 *
	 * param d the d
	 */
	public DivideByZeroException(int d) {
		super("div by 0");
		denom = d;
	}

	public int getDenominator() {
		return denom;

	}
}
