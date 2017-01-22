package unit7;

import java.io.*;

public class Program2 {

	public static void main(String[] args) {
		ObjectInputStream in = null;
		
		try{
			in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("students.dat")));
			for(int i = 0; i<3; i++){
				Student p = (Student) in.readObject();
				display(p);
			}
			in.close();
		}
		catch(Exception e){
			
		}

	}
	
	public static void display(Student p){
		System.out.println(p.getName()+"\nGPA: "+ p.getGpa()+"\n");
	}

}
