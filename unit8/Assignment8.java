package unit8;

import java.io.*;
import java.util.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Assignment8.
 */
public class Assignment8 {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		TreeMap<String, Contact> contacts = new TreeMap<String, Contact>();

		String fileName = Input
				.getString("What file would you like to use for you contacts?");

		while (true) {
			String answer = Input
					.getString("Would you like to add a contact, remove a contact, display all contacts, or quit?");
			if (answer.contains("add a contact")) {
				readFileIntoMap(contacts, fileName);
				Contact c = new Contact();
				c.setFirstName(Input
						.getString("What is the contact's first name?"));
				c.setLastName(Input
						.getString("What is the contact's last name?"));
				c.setPhoneNum(Input
						.getString("What is the contact's phone number?"));
				c.setEmail(Input.getString("What is the contact's email?"));
				c.setFullName();
				contacts.put(c.getFullName(), c);
				writeMapToFile(contacts, fileName);
			} else if (answer.contains("remove a contact")) {
				readFileIntoMap(contacts, fileName);
				String removeKeyFirst = Input
						.getString("What is the first name of your contact?");
				String removeKeyLast = Input.getString("What is the last name of your contact");
				String removeKey = removeKeyLast + removeKeyFirst;
				if (contacts.containsKey(removeKey)) {
					contacts.remove(removeKey);
				} else {
					System.out.println("This contact does not exist.");
				}
				writeMapToFile(contacts, fileName);
			} else if (answer.contains("display all contacts")) {
				readFileIntoMap(contacts, fileName);
				for (Map.Entry contact : contacts.entrySet()) {
					Contact displayContact = contacts.get(contact.getKey());
					System.out.println(displayContact.toString());
				}
				System.out.println("\n");
			} else if (answer.contains("quit")) {
				break;
			}
		}

	}

	/**
	 * Write map objects to file.
	 *
	 * @param contactPlaceholder
	 *            the contact placeholder
	 * @param fileName
	 *            the file name
	 */
	public static void writeMapToFile(
			TreeMap<String, Contact> contactPlaceholder, String fileName) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new BufferedOutputStream(
					new FileOutputStream(fileName)));

			for (Map.Entry c : contactPlaceholder.entrySet()) {
				Contact outputContact = contactPlaceholder.get(c.getKey());
				out.writeObject(outputContact);
			}
			out.close();
		} catch (Exception e) {

		}
	}

	/**
	 * Read file into map.
	 *
	 * @param contactPlaceholder
	 *            the contact placeholder
	 * @param fileName
	 *            the file name
	 */
	public static void readFileIntoMap(
			TreeMap<String, Contact> contactPlaceholder, String fileName) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new BufferedInputStream(
					new FileInputStream(fileName)));
			Contact inputContact = null;
			do {
				inputContact = new Contact();
				inputContact = (Contact) in.readObject();
				contactPlaceholder
						.put(inputContact.getFullName(), inputContact);
			} while (inputContact != null);

			in.close();
		} catch (Exception e) {

		}

	}

}
