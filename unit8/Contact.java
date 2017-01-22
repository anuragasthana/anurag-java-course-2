package unit8;

import java.io.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Contact.
 */
public class Contact implements Serializable {

	/** The first name. */
	private String firstName;

	/** The last name. */
	private String lastName;

	/** The phone num. */
	private String phoneNum;

	/** The email. */
	private String email;

	/** The full name. */
	private String fullName;

	/**
	 * Instantiates a new contact.
	 *
	 * @param fName
	 *            the f name
	 * @param lName
	 *            the l name
	 * @param phoneNum
	 *            the phone num
	 * @param email
	 *            the email
	 */
	public Contact(String fName, String lName, String phoneNum, String email) {
		this.firstName = fName;
		this.lastName = lName;
		this.phoneNum = phoneNum;
		this.email = email;
	}

	/**
	 * Instantiates a new contact.
	 */
	public Contact() {

	}

	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name.
	 *
	 * @param firstName
	 *            the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName
	 *            the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the phone num.
	 *
	 * @return the phone num
	 */
	public String getPhoneNum() {
		return phoneNum;
	}

	/**
	 * Sets the phone num.
	 *
	 * @param phoneNum
	 *            the new phone num
	 */
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email
	 *            the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the full name.
	 *
	 * @return the full name
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * Sets the full name.
	 */
	public void setFullName() {
		this.fullName = lastName + firstName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Name: " + getFirstName() + " " + getLastName() + "\t"
				+ "Phone Number: " + getPhoneNum() + "\t" + "Email: "
				+ getEmail();
	}

}
