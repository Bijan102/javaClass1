
/**
 * Write a description of class StringPalindromes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class StringPalindromes
{
    public static void main ()
    {
        Scanner kb = new Scanner(System.in);
        
        String [] inputArray = new String [4];
        String [] reversedArray = new String [4];
        
        for (int i = 0; i < inputArray.length; i++)
        {
            System.out.print("Enter string number " + (i + 1) + ": ");
            inputArray[i] = kb.nextLine().replaceAll("[ ,?!\']", "");
            int indexReversed = inputArray[i].length();
            String reversed = "";
            for (int j = (indexReversed - 1); j >= 0; j--)
            {
                reversed = reversed + inputArray[i].charAt(j);
            }
            reversedArray[i] = reversed;
        }
        
        System.out.println("\nLet me see!!!!!!\n");
        
        for(int k = 0; k < inputArray.length; k++)
        {
            if (inputArray[k].equalsIgnoreCase(reversedArray[k]))
                {
                    System.out.println(inputArray[k] + " is a palindrome");
                }
                else 
                {
                    System.out.println(inputArray[k] + " is not a palindrome");
                }
        }
    }
}
