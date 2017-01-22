/**
 * The Class SavingsAccount.
 */
public class SavingsAccount extends Account {

	/** The total amt due. */
	public double totalAmtDue = 0;

	/**
	 * Instantiates a new savings account.
	 *
	 * @param accnum
	 *            the account number
	 * @param balance
	 *            the balance
	 * @param annualIntRate
	 *            the annual interest rate
	 * @param dateMade
	 *            the date made
	 */
	public SavingsAccount(int accnum, double balance, double annualIntRate,
			Date dateMade) {
		super(accnum, balance, annualIntRate, dateMade);
		this.accountnum = accnum;
		this.balance = balance;
		this.annualInterestRate = annualIntRate;
		this.datecreated = dateMade;
	}

	/*
	 * @see Account#deposit(double)
	 */
	public void deposit(double d) {
		balance += d;
	}

	/*
	 * @see Account#withdraw(double)
	 */
	public void withdraw(double w) {
		double totalamtdue = 0;
		while (w > balance) {
			w = Input
					.getDouble("This account cannot be overdrawn, please enter an apropriate value.");
			if (w < balance)
				break;
		} // checks overdraft limit
		balance -= w;
		totalAmtDue = totalamtdue;

	}

	/*
	 * @see Account#getTotalAmtDue()
	 */
	public double getTotalAmtDue() {
		return totalAmtDue;
	}

}
