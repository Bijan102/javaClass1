/**
 * Student name:        Fazeli, Bijan
 * CRN # :              25398
 *  Course:             CS 170
 *  Semester:           Fall 2015
 *  Date:               10/25/15
 *
 *  Chapter#:           07
 *  ProjectName:        Gradebook_2D
 *  File/Class name:    Gradebook_2D.java
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

public class Gradebook_2D
{
    //Declare a global constant 'QUIZ' and assign it 3
    static final int QUIZ = 3;
  
    //Create a main method
    public static void main ()
    {
        //Declare a scanner class to store the users input
        Scanner kb = new Scanner(System.in);
        
        //Greet user and get user input for student
        System.out.print("How many students do you have? ");
        int student = kb.nextInt();
        
        //Declare one two-dimensional array of type double 'quizGrade' and allocate the number of rows as 'student' and columns as 'QUIZ'
        double [][] quizGrade = new double [student][QUIZ];
        
        /*Declare one one one-dimensional array of type int 'id' 
        and two one-dimensional array of type double 'sum' and 'avg' and allocate spaces as 'student'.*/
        String [] id = new String [student];
        double [] sum = new double [student];
        double [] avg = new double [student];
        
        //Declare a variable of type double 'classAvg' and initialize it to 0
        double classAvg = 0;
    
        //Create a nested for-loop that will store users input into 'id' and 'quizGrade' array
        for(int row = 0; row < student; row++)
        {
            System.out.print("What is the 4-digit ID number of sturend #" + (row + 1) + "? ");
            id[row] = kb.next();
            System.out.print("Enter the 3 scores for the quizzes, separated by a space: ");
            
            //Use an inner for-loop to fill quizGrade array and keep track of the sum for each row
            for (int column = 0; column < QUIZ; column++)
            {
                quizGrade[row][column] = kb.nextDouble();
                sum[row] += quizGrade[row][column];
            }
            
            //Calculate the avg for each row by dividing the sum of each row by the QUIZ number
            avg[row] = (sum[row]/QUIZ);
            
            //Calculate the class average by adding each row's average and then dividing it by student when displaying the output
            classAvg += avg[row];
        }
        
        //Call the 'displayOutput' method to display the output
        displayOutput(student, id, quizGrade, sum, avg, classAvg); 
        
        //End program
        System.out.println("\nGOOOOD-BYE!!!");
    }
    
    //Create a method, 'displayOutput' to display user's input and display the calculated sum and avg for each student
    static void displayOutput (int student, String [] id, double [][] quizGrade, double [] sum, double [] avg, double classAvg)
    {
        //Create a nested for-loop that will display the class average, users input, the calculated sum and avg.
        System.out.printf("\n--------------------------------------------------\n"
                            + "Here is the class average: %10.2f" 
                            + "\n\nHere are the contents of the arrays: \n", (classAvg/student));
        System.out.println("\n\t\tID\tQuiz1\t   Quiz2    Quiz3\tSum\t Average");
        for(int row = 0; row < student; row++)
        {
            System.out.printf("%n%20s", id[row]);
            for (int column = 0; column < QUIZ; column++)
            {
                System.out.printf("%10.2f", quizGrade[row][column]);
            }
            System.out.printf("%10.2f %10.2f", sum[row], avg[row]);
        }
    }
}
