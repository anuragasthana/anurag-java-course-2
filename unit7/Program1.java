package unit7;

import java.io.*;

public class Program1 {

	public static void main(String[] args) {
		double[] S1_Grades = {88,92,96,93};
		int[] S1_Credits = {2,3,3,5};
		double[] S2_Grades = {85,88,93,97,87};
		int[] S2_Credits = {3,3,4,2,5};
		double[] S3_Grades = {90,91,88,86};
		int[] S3_Credits = {4,3,5,2};
		
		Student S1 = new Student("David", "963-84-7531", 4, S1_Grades, S1_Credits);
		Student S2 = new Student("Alyssa", "147-03-6925", 4, S2_Grades, S2_Credits);
		Student S3 = new Student("Brian", "666-66-6666", 4, S3_Grades, S3_Credits);
		
		ObjectOutputStream out = null;
		
		try {
			out = new ObjectOutputStream(
					new BufferedOutputStream(
							new FileOutputStream("students.dat")));
			out.writeObject(S1);
			out.writeObject(S2);
			out.writeObject(S3);
			out.close();
		}
		catch (IOException e){
			
		}
		

	}

}
