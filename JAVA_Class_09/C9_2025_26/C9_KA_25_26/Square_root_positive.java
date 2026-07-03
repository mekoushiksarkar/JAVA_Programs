/* FindSqrt.java */

import java.util.*;
public class Square_root_positive
{
    public static void main(String args[]) {
        double result = 0.0;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a number:");
        double num = scnr.nextDouble();
        if (num < 0)
        {
            System.out.println("Sorry, can't find the sqrt of a negative number.");
            System.out.println("Exiting program");
            System.exit(0);
        }
        else
        {
            result = Math.sqrt(num);
        }
        System.out.println("sqrt(" + num + ") is = " + result);
        scnr.close();
    }
}
