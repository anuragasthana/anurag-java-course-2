/**
 * The Class CheckingAccount.
 */
public class CheckingAccount extends Account {

	/** The total amt due. */
	public double totalAmtDue = 0;
	private double overdraftLimit; // overdraft limit

	/**
	 * Instantiates a new checking account.
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
	public CheckingAccount(int accnum, double balance, double annualIntRate,
			Date dateMade, double overdraftLim) {
		super(accnum, balance, annualIntRate, dateMade);
		this.accountnum = accnum;
		this.balance = balance;
		this.annualInterestRate = annualIntRate;
		this.datecreated = dateMade;
		this.overdraftLimit = overdraftLim;
	}

	/*
	 * 
	 * 
	 * @see Account#deposit(double)
	 */
	public void deposit(double d) {
		balance += d;
	}

	/*
	 * 
	 * 
	 * @see Account#withdraw(double)
	 */
	public void withdraw(double withdrawal) {
		double principal;
		double totalamtdue = 0;
		double base;
		double power;
		while (true){
		if (withdrawal > balance + overdraftLimit) {
			withdrawal = Input.getDouble("Please enter a proper value for withdrawal");
		}
		if (withdrawal > balance && withdrawal < balance + overdraftLimit) {
			principal = withdrawal - balance;
			base = principal * (1 + annualInterestRate);
			power = 5;
			totalamtdue = Math.pow(base, power);
			totalAmtDue = totalamtdue;
			balance -= withdrawal;
			break;
		}
		if (withdrawal < balance) {
			balance -= withdrawal;
			break;
		}
		}
	}

	/*
	 * 
	 * 
	 * @see Account#getTotalAmtDue()
	 */
	public double getTotalAmtDue() {
		return totalAmtDue;
	}

}
