/* FindGCD.java */

import java.util.*;

public class Find_GCD {

  public static void main(String args[]) {
    Scanner scnr = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int num1 = scnr.nextInt();
    System.out.print("Enter the second number: ");
    int num2 = scnr.nextInt();
    while (num1 != num2) {
      if (num1 > num2) 
        num1 = num1 - num2;
      else 
        num2 = num2 - num1;
    }
    System.out.println("The Greatest Common Divisor is : " + num1);
  }
}
