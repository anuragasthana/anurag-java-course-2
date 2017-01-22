package unit7;

import java.io.Serializable;

/**
 * The Class Student.
 */
public class Student implements Serializable {

	/** The name. */
	private String name;

	/** The ssn. */
	private String ssn;

	/** The courses completed. */
	private int numCoursesCompleted;

	/** The absolute grades. */
	private double[] grades;

	/** The credits for each subject Ex: regular class has 1 credit while honors has 1.5... etcs */
	private int[] credits;

	/** The gpa for all subjects */
	private double gpa;

	/** The grade point equivalent for each grade */
	private double[] gradePointEquivalent;

	/**
	 * Instantiates a new student. name: the name ssn: the social security
	 * number coursesCompleted: the number of courses completed grades: the
	 * grades credits:s the credits
	 */
	public Student(String name, String ssn, int coursesCompleted,
			double[] grades, int[] credits) {
		this.name = name;
		this.ssn = ssn;
		this.numCoursesCompleted = coursesCompleted;
		this.grades = grades;
		this.credits = credits;
		this.gradePointEquivalent = GPEConverter();
		this.gpa = GPACalculator();
	}

	/**
	 * GPE converter. this method is used to calculate the grade point
	 * equivalent from the absolute grades for each subject. this will be used
	 * to calculate the gpa for the student return the double[]
	 */
	public double[] GPEConverter() {
		double gradePointEquivalent[] = new double[numCoursesCompleted];
		for (int i = 0; i < numCoursesCompleted; i++) {
			if (grades[i] >= 93) {
				gradePointEquivalent[i] = 4;
			}
			if (grades[i] >= 90 && grades[i] < 93) {
				gradePointEquivalent[i] = 3.67;
			}
			if (grades[i] >= 87 && grades[i] < 90) {
				gradePointEquivalent[i] = 3.33;
			}
			if (grades[i] >= 83 && grades[i] < 87) {
				gradePointEquivalent[i] = 3;
			}
			if (grades[i] >= 80 && grades[i] < 83) {
				gradePointEquivalent[i] = 2.67;
			}
			if (grades[i] >= 77 && grades[i] < 80) {
				gradePointEquivalent[i] = 2.33;
			}
			if (grades[i] >= 70 && grades[i] < 77) {
				gradePointEquivalent[i] = 2;
			}
			if (grades[i] >= 60 && grades[i] < 70) {
				gradePointEquivalent[i] = 1;
			}
			if (grades[i] < 60) {
				gradePointEquivalent[i] = 0;
			}
		}
		return gradePointEquivalent;
	}

	/**
	 * Gets the name.
	 *
	 * return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the ssn.
	 *
	 * return the ssn
	 */
	public String getSsn() {
		return ssn;
	}

	/**
	 * Sets the ssn.
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	/**
	 * Gets the courses completed.
	 *
	 * return the courses completed
	 */
	public int getCoursesCompleted() {
		return numCoursesCompleted;
	}

	/**
	 * Sets the courses completed.
	 */
	public void setCoursesCompleted(int coursesCompleted) {
		this.numCoursesCompleted = coursesCompleted;
	}

	/**
	 * Gets the grades.
	 *
	 * return the grades
	 */
	public double[] getGrades() {
		return grades;
	}

	/**
	 * Sets the grades.
	 */
	public void setGrades(double[] grades) {
		this.grades = grades;
	}

	/**
	 * Gets the credits.
	 *
	 * return the credits
	 */
	public int[] getCredits() {
		return credits;
	}

	/**
	 * Sets the credits.
	 */
	public void setCredits(int[] credits) {
		this.credits = credits;
	}

	/**
	 * Gets the gpa.
	 *
	 * return the gpa
	 */
	public double getGpa() {
		return gpa;
	}

	/**
	 * GPA calculator. uses the grade point equivalent to calculate the gpa. it
	 * also takes the credits for each subject into account while calculating
	 * the gpa
	 * return the double
	 */
	public double GPACalculator() {
		double gpa = 0;
		double totalValue = 0;
		double creditValue = 0;
		double[] courseValue = new double[numCoursesCompleted];
		for (int i = 0; i < numCoursesCompleted; i++) {
			courseValue[i] = gradePointEquivalent[i] * credits[i];
		}
		for (int j = 0; j < numCoursesCompleted; j++) {
			totalValue += courseValue[j];
		}
		for (int k = 0; k < numCoursesCompleted; k++) {
			creditValue += credits[k];
		}
		gpa = totalValue / creditValue;
		return gpa;

	}

}
