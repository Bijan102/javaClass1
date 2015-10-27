//Import library 
import java.util.*;

public class array1D
{
	public static void main(String[] args) {
		//Scanner kb
		Scanner kb = new Scanner (System.in); 

		//Greet User and display purpose
		System.out.print("How many students do you have? ");

		//Declare a local variable 'student' and assign it user input
		int student = kb.nextInt();

		/*Declare an array of type String, and three arrays of type double 
		and allocate 'student' spaces*/ 
		String [] id = new String [student]; 
		double [] quiz1 = new double [student];
		double [] quiz2 = new double [student];
		double [] quiz3 = new double [student];
		double [] sum = new double [student];
		double [] avg = new double [student];

		//PART 1
		//Store ID numbers to array id
		for (int i = 0; i < id.length; i++) {
			System.out.print("What are 4-digit ID number of student #" + (i+1) + "? ");
			id[i] = kb.next();
		}

		//Store Quiz1 scores to array 'quiz1'
		for (int j = 0; j < quiz1.length; j++) {
			System.out.print("What is Quiz1 score of student #" + (j+1) + "? ");
			quiz1[j] = kb.nextDouble();
		}

		//Store Quiz2 scores to array 'quiz2'
		for (int k = 0; k < quiz2.length; k++) {
			System.out.print("What is Quiz2 score of student #" + (k+1) + "? ");
			quiz2[k] = kb.nextDouble();
		}

		//Store Quiz3 scores to array 'quiz3'
		for (int l = 0; l < quiz3.length; l++) {
			System.out.print("What is Quiz3 score of student #" + (l+1) + "? ");
			quiz3[l] = kb.nextDouble();
		}

		System.out.println("\n\n\n-------------------------------------------\n");

		//PART2
		//Display ID numbers using a for-loop
		System.out.print("ID:            ");
		for (int i = 0; i < id.length; i++) {
			System.out.printf("     ", id[i]);
		}
		System.out.println();

		//Display quiz1 numbers using a for-loop
		System.out.print("Quiz1:          ");
		for (int j = 0; j < quiz1.length; j++) {
			System.out.printf("%10.2f", quiz1[j]);
		}
		System.out.println();

		//Display quiz2 numbers using a for-loop
		System.out.print("Quiz2:          ");
		for (int k = 0; k < quiz2.length; k++) {
			System.out.printf("%10.2f", quiz2[k]);
		}
		System.out.println();

		//Display quiz3 numbers using a for-loop
		System.out.print("Quiz3:          ");
		for (int l = 0; l < quiz3.length; l++) {
			System.out.printf("%10.2f", quiz3[l]);
		}
		System.out.println();

		for (int i = 0; i < sum.length; i++) {
			sum[i] = quiz1[i] + quiz2[i] + quiz3[i];
			avg[i] = sum[i] / sum.length;
		}

		System.out.print("Sum:        ");

		for (int j = 0; j < sum.length; j++) {
			System.out.printf("%10.2f", sum[j]);
		}
		System.out.println();

		System.out.print("Average:     ");
		for (int j = 0; j < sum.length; j++) {
			System.out.printf("%10.2f", avg[j]);
		}
	}
}