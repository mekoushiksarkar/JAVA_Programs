/* FindLarger.java */

import java.util.*;

public class Larger_Number_If {

  public static void main(String args[]) {
    int largest;
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int num1 = scnr.nextInt();
    System.out.println("Enter the second number: ");
    int num2 = scnr.nextInt();
    largest = num1;
    if (num2 > num1) 
        largest = num2;
    System.out.println("Largest of " + num1 + " and " + num2 + " is " + largest);
    scnr.close();
  }
}
