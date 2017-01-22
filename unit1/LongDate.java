

/**
 * The Class LongDate.
 * This class extends the base class Date
 */
public class LongDate extends Date {
	
	/** The month name stored as a String*/
	private String monthName;

	/**
	 * Instantiates a new long date.
	 * Default constructor
	 */
	public LongDate() {

	}

	/**
	 * Instantiates a new long date.
	 *
	 * @param m the month
	 * @param d the day
	 * @param y the year
	 */
	public LongDate(String m, int d, int y) {
		editLongDate(m, d, y);
	}

	/**
	 * Sets the long date.
	 *
	 * @param m the month
	 * @param day the day
	 * @param year the year
	 */
	public void editLongDate(String m, int day, int year) {

		int month;
		while (true) {

			if (m.equals("January")) {
				monthName = "January";
				month = 1;
				break;
			} else if (m.equals("February")) {
				monthName = "February";
				month = 2;
				break;
			} else if (m.equals("March")) {
				monthName = "March";
				month = 3;
				break;
			} else if (m.equals("April")) {
				monthName = "April";
				month = 4;
				break;
			} else if (m.equals("May")) {
				monthName = "May";
				month = 5;
				break;
			} else if (m.equals("June")) {
				monthName = "June";
				month = 6;
				break;
			} else if (m.equals("July")) {
				monthName = "July";
				month = 7;
				break;
			} else if (m.equals("August")) {
				monthName = "August";
				month = 8;
				break;
			} else if (m.equals("September")) {
				monthName = "September";
				month = 9;
				break;
			} else if (m.equals("October")) {
				monthName = "October";
				month = 10;
				break;
			} else if (m.equals("November")) {
				monthName = "November";
				month = 11;
				break;
			} else if (m.equals("December")) {
				monthName = "December";
				month = 12;
				break;
			} else {
				System.out.println("Error bad month: " + m);
				m = Input.getString("Please enter valid month name.");
			}
		}

		this.setDate(month, day, year);
	}

	public String getDate() {
		String fulldate = monthName + " " + this.getDay() + ", " + this.getYear();
		return fulldate;

	}

	/**
	 * Gets the short date.
	 *
	 * @return the short as a string in mm/dd/yyyy form
	 */
	public String getShortDate() {
		String m = null;
		String d = null;
		String y = null;
		int month = this.getMonth();
		int day = this.getDay();
		int year = this.getYear();
		if (month < 10) {
			m = "0" + month;
		} else {
			m = "" + month;
		}
		if (day < 10) {
			d = "0" + day;
		} else {
			d = "" + day;
		}
		if  ((year>=0) && (year < 10)) {
			y = "000" + year;
		} else if ((year>=10) && (year < 100)){
			y = "00" + year;
		} else if ((year >=100) && (year < 1000)) {
			y = "0" + year;
		}
		String date = m + "/" + d + "/" + y;
		return date;

	} 
}
