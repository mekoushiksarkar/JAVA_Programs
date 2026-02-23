/* FindMaxMinOfThree.java */

import java.util.Scanner;

public class Max_Min_of_three_numbers {

  public static void main(String args[]) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the first number");
    double first_number = scnr.nextDouble();
    System.out.println("Enter the second number");
    double second_number = scnr.nextDouble();
    System.out.println("Enter the third number");
    double third_number = scnr.nextDouble();
    System.out.println("Maximum number is : " + Math.max(third_number, Math.min(first_number, second_number)));
    System.out.println("Minimum number is : " + Math.min(third_number, Math.min(first_number, second_number)));
    scnr.close();
  }
}
