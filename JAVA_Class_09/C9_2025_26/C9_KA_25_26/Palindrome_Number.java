/* PalidromeNumber.java */

import java.util.*;
public class Palindrome_Number
{
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        int numOriginal, numReverse = 0;
        System.out.print("Enter a number: ");
        int num = scnr.nextInt();
        // Save the original number for later use
        numOriginal = num;
        while (num > 0)
        {
            // Get the last digit
            int digit = num % 10;
            // Append it to the reverse number
            numReverse = numReverse * 10 + digit;
            // Remove the last digit from num
            num = num / 10;
        }
        if (numReverse == numOriginal)
            System.out.println(numOriginal + " is a Palindrome number");
        else
            System.out.println(numOriginal + " is not a Palindrome number");
        scnr.close();
    }
}
