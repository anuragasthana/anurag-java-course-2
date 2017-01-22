package unit4;

public class CatchExceptions {

	/**
	 * The main method.
	 *
	 * 
	 * throws DivideByZeroException the divide by zero exception
	 */
	public static void main(String[] args) throws DivideByZeroException {
		int i = 10;
		int n = 0;
		float result = 0;
		System.out.println();
		try {
			divide(i, n);

		}

		catch (DivideByZeroException e) {
			try {
				while (n == 0) {
					n = Input
							.getInt("Please enter a proper value for the denominator");
				}
				result = divide(i, n);
			} catch (DivideByZeroException ex) {
				System.out.println("DivideByZeroException thrown");
			}
		}
		System.out.print("The result is approximately: ");
		System.out.printf("%2.2f", result);

	}

	public static float divide(int x, int y) throws DivideByZeroException {
		float z = 0;
		try {
			z = x / y;

		} catch (ArithmeticException e) {
			throw new DivideByZeroException(y);
		}
		return z;

	}

}
