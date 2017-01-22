import java.util.Random;

/**
 * The Class AppMain.
 */
public class AppMain {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		Random numgen = new Random();
		Random day = new Random(); // random number to simulate a day
		Random month = new Random(); // random number to simulate a month
		Random year = new Random(); // random number to simulate a year
		int[] accountNum = new int[2];
		double[] balance = new double[2];
		double[] annualInterestRate = new double[2];
		Date[] dateCreated = new Date[2];

		for (int i = 0; i < 2; i++) {

			accountNum[i] = Input.getInt("What is your account Number");
			balance[i] = Input.getDouble("What is your balance?");
			annualInterestRate[i] = (numgen.nextInt(10) + 1) * 0.01;
			Date dateShort = new Date(1 + month.nextInt(12),
					1 + day.nextInt(31), 1970 + year.nextInt(46));
			dateCreated[i] = dateShort;
		}
		double overdraftLimit = 100;
		Account[] bank = {
				new SavingsAccount(accountNum[0], balance[0],
						annualInterestRate[0], dateCreated[0]),
				new CheckingAccount(accountNum[1], balance[1],
						annualInterestRate[1], dateCreated[1], overdraftLimit) };
		for (int i = 0; i < 2; i++) {

			String ask = Input
					.getString("What would you like to make a deposit, withdrawal or neither for acccount number "
							+ bank[i].accountnum + "?");
			if (ask.equals("deposit")) {
				double getdeposit = Input
						.getDouble("How much money would you like to deposit?");
				bank[i].deposit(getdeposit);
				if (bank[i] instanceof SavingsAccount) {
					System.out.println("\nAccount Type: Savings Account");
				} else {
					System.out.println("\nAccount Type: Checking Account");
				}
				bank[i].display();
				System.out.print("Total amount due: $");
				System.out.printf("%8.2f", bank[i].getTotalAmtDue());
				System.out.println();
			} else if (ask.equals("withdrawal")) {
				double getwithdrawal = Input
						.getDouble("How much money would you like to withdraw?");
				bank[i].withdraw(getwithdrawal);
				if (bank[i] instanceof SavingsAccount) {
					System.out.println("\nAccount Type: Savings Account");
				} else {
					System.out.println("\nAccount Type: Checking Account");
				}
				bank[i].display();
				System.out.print("Total amount due: $");
				System.out.printf("%8.2f", bank[i].getTotalAmtDue());
				System.out.println("\n");
			} else if (ask.equals("neither")) {
				if (bank[i] instanceof SavingsAccount) {
					System.out.println("\nAccount Type: Savings Account");
				} else {
					System.out.println("\nAccount Type: Checking Account");
				}
				bank[i].display();
				System.out.print("Total amount due: $");
				System.out.printf("%8.2f", bank[i].getTotalAmtDue());
				System.out.println("\n");
			} else {
				if (bank[i] instanceof SavingsAccount) {
					System.out.println("\nAccount Type: Savings Account");
				} else {
					System.out.println("\nAccount Type: Checking Account");
				}
				bank[i].display();
				System.out.print("Total amount due: $");
				System.out.printf("%8.2f", bank[i].getTotalAmtDue());
				System.out.println("\n");
				System.out.println("Motive was unclear\n");
			}
		}
	}

}
