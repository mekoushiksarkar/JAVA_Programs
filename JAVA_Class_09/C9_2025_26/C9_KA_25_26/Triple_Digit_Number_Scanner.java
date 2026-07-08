/* TripleDigitNumberScanner.java */

import java.util.Scanner;
public class Triple_Digit_Number_Scanner
{
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a number; ");
        int number = scnr.nextInt();
        scnr.close();
        
        String condition = (number >= 100 && number <= 999)? " is a triple-digit number" : " is not a triple-digit number";
        System.out.println("The number " + number + condition);
    }
}
