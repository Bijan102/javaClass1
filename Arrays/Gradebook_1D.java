/**
 * Student name:        Fazeli, Bijan
 * CRN # :              25398
 *  Course:             CS 170
 *  Semester:           Fall 2015
 *  Date:               10/27/15
 *
 *  Chapter#:           07
 *  ProjectName:        Gradebook_1D
 *  File/Class name:    Gradebook_1D.java
 *  
 *  Concepts used:      Used variables to store values using keyboard input, and made use of methods 
 *                      while problem solving using nested-for loops to go through arrays. 
 *                      Commented the document source code for clarity.
 *
 *  Program Statement:  This program will print out the final grades of the students in a class and
 *                      the average for each student. 
 *  
 *  Assumptions:        Value entered from the user follows the instuctions.
 */

//import library
import java.util.*;

public class Gradebook_1D
{
    //Declare a global scanner object to store user input
    public static Scanner kb = new Scanner (System.in);
    
    //Create a main method
    public static void main(String[] args) {
        //Greet User and display purpose
        System.out.print("How many students do you have? ");

        //Declare a variable of type int, 'student' and assign it user input
        int student = kb.nextInt();
        
        /*Declare an array of type String, 'id' and five arrays of type double, 
        'quiz1, quiz2, quiz3, sum, avg' and allocate 'student' spaces*/ 
        String [] id = new String [student]; 
        double [] quiz1 = new double [student];
        double [] quiz2 = new double [student];
        double [] quiz3 = new double [student];
        double [] sum = new double [student];
        double [] avg = new double [student];
        
        //Declare a local variable of type double, 'classAvg' and initialize it to 0.
        double classAvg = 0;
        
        //Call acceptUserInput to store array values
        acceptUserInput(student, id, quiz1, quiz2, quiz3);
        
        //Call 'displayArrayContents' to display output
        displayArrayContents(id, quiz1, quiz2, quiz3, sum, avg);
        
        //End Program
        System.out.println("\nGood-bye!!!");
    }
    
    //Create a method to store user input, 'acceptUserInput'
    private static void acceptUserInput(int student, String[] id, double[] quiz1, double[] quiz2, double[] quiz3)
    {  
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
    }
    
    //Create a method to display output, 'displayArrayContents'
    private static void displayArrayContents(String[] id, double[] quiz1, double [] quiz2, double [] quiz3, double [] sum, double [] avg)
    {
        System.out.println("\n\n\n-------------------------------------------\n");
        
        //Declare a local variable of type double, 'classAvg' and initialize it to 0
        double classAvg = 0;
        
        //Display ID numbers using a for-loop
        System.out.print("ID:            ");
        for (int i = 0; i < id.length; i++) {
            System.out.printf("%10s", id[i]);
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
        
        //Use a for-loop to calculate the sum and avg
        for (int i = 0; i < sum.length; i++) {
            sum[i] = quiz1[i] + quiz2[i] + quiz3[i];
            avg[i] = sum[i] / (sum.length + 1);
        }
        
        System.out.println("\n-------------------------------------------");
        
        //Use a for-loop to display sum
        System.out.print("Sum:\t\t");
        for (int j = 0; j < sum.length; j++) {
            System.out.printf("%10.2f", sum[j]);
        }
        System.out.println();
        
        //Use a for-loop to display avg and calculate classAvg
        System.out.print("Average:\t");
        for (int j = 0; j < sum.length; j++) {
            System.out.printf("%10.2f", avg[j]);
            classAvg += avg[j];
        }
        System.out.println();
        
        //Display the classAvg
        System.out.printf("Class Average: %21.2f %n", classAvg/2);
        
        //Create a for loop to display the bottom portion of the array contents 
        System.out.println("\n\nHere are the contents of the arrays: \n");
        System.out.println("\n\t\t  ID\t  Quiz1\t     Quiz2\tQuiz3");
        for (int i = 0; i < id.length; i++)
        {
            System.out.printf("%n%20s %10.2f %10.2f %10.2f", id[i], quiz1[i], quiz2[i], quiz3[i]);  
        }
    }
}