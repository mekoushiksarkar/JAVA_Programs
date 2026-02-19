/* Divisibility.java */

import java.util.*;

public class Divisibility {

  public static void main(String args[]) {
    boolean result;
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int num1 = scnr.nextInt();
    System.out.println("Enter the second number: ");
    int num2 = scnr.nextInt();
    result = false;
    if (num1 % num2 == 0) 
        result = true;
    System.out.println("Result of " + num1 + " divisible by " + num2 + " is " + result);
    scnr.close();
  }
}
