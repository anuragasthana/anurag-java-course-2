/**
 * The Class Account.
 */
public abstract class Account {

	/** The accountnum. */
	protected int accountnum;

	/** The balance. */
	protected double balance;

	/** The annual interest rate. */
	protected double annualInterestRate;

	/** The datecreated. */
	Date datecreated = new Date();

	/**
	 * Instantiates a new account.
	 *
	 * @param accountNum
	 *            the account num
	 * @param balance
	 *            the balance
	 * @param annualInterestRate
	 *            the annual interest rate
	 * @param date
	 *            the date
	 */
	public Account(int accountNum, double balance, double annualInterestRate,
			Date date) {
		this.accountnum = accountNum;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.datecreated = date;
	}

	/**
	 * Deposit.
	 *
	 * @param d
	 *            the d
	 */
	public abstract void deposit(double d);

	/**
	 * Withdraw.
	 *
	 * @param w
	 *            the w
	 */
	public abstract void withdraw(double w);

	/**
	 * Gets the total amt due.
	 *
	 * @return the total amt due
	 */
	public abstract double getTotalAmtDue();

	/**
	 * Gets the accountnum.
	 *
	 * @return the accountnum
	 */
	public int getAccountnum() {
		return accountnum;
	}

	/**
	 * Sets the accountnum.
	 *
	 * @param accountnum
	 *            the new accountnum
	 */
	public void setAccountnum(int accountnum) {
		this.accountnum = accountnum;
	}

	/**
	 * Gets the balance.
	 *
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Sets the balance.
	 *
	 * @param balance
	 *            the new balance
	 */
	public void setBalance(int balance) {
		this.balance = balance;
	}

	/**
	 * Gets the annual interest rate.
	 *
	 * @return the annual interest rate
	 */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/**
	 * Sets the annual interest rate.
	 *
	 * @param annualInterestRate
	 *            the new annual interest rate
	 */
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	/**
	 * Gets the datecreated.
	 *
	 * @return the datecreated
	 */
	public Date getDatecreated() {
		return datecreated;
	}

	/**
	 * Sets the datecreated.
	 *
	 * @param datecreated
	 *            the new datecreated
	 */
	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}

	/**
	 * Sets the balance.
	 *
	 * @param balance
	 *            the new balance
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * Display.
	 */
	public void display() {
		System.out.println("Account Number: " + this.accountnum);
		System.out
				.println("Date Account Was Created: " + datecreated.getDate());
		System.out.print("Balance: $");
		System.out.printf("%8.2f", balance);
		System.out.print("\nAnnual Interest Rate: ");
		System.out.printf("%8.2f", annualInterestRate * 100);
		System.out.println("%");

	}

}
