// A program in java to input two numbers using the Scanner class. Also, swap these two numbers without using a third variable.
/* SwapNumbers.java */

import java.util.Scanner;
public class Swap_numbers_Scanner
{
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNumber = scnr.nextInt();
        System.out.println("Enter the second number:");
        int secondNumber = scnr.nextInt();
        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;
        System.out.println("**************************");
        System.out.println("Swapped numbers are: ");
        System.out.println("firstNumber: " + firstNumber);
        System.out.println("secondNumber: " + secondNumber);
        scnr.close();
    }
}

