import java.util.Random;


/**
 * The Class AppMain.
 */
public class AppMain {


	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		/* Array for list of months
		 * Also added some bad months for testing
		 */
		String[] months = {
				"January",
				"February",
				"March",
				"April",
				"May",
				"June",
				"July",
				"August",
				"September",
				"October",
				"November",
				"December",
				"badMonth", //check for a bad month
				"january"  //check for a month with small case first character
		};
		
		/* Array of Date objects */
		Date[] dates = new Date[15];
		
		LongDate dateLong;
		Date dateShort;
		Random day = new Random();  //random number to simulate a day 
		Random month = new Random(); //random number to simulate a month
		Random year = new Random();  //random number to simulate a yaer
		
		//initialize the date object
		for (int i= 0; i < 15; i++) {
			
			//alternately set LongDate or date objects
			if (i%2 == 0) {
				//you should require input for day > 28 in February
				dateLong = new LongDate(months[month.nextInt(14)], 1+day.nextInt(30), 2000+year.nextInt(99));
				dates[i] = dateLong;
			} else {
				//you should require input for day > 28 in February
				dateShort = new Date(1+month.nextInt(11),1+day.nextInt(30), 2000+year.nextInt(99));
				dates[i] = dateShort;
			}
			
		}
		System.out.println();
		System.out.println("********* Results **************");
		for (int i =0; i < 15; i++) {	
			System.out.println("Date: " + dates[i].getDate());
		}
				
	}

}
