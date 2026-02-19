// A program in Java to input three integers and compute their average.
/* FindAverage.java */

import java.util.Scanner;

public class Find_Average_Scanner {

  public static void main(String args[]) {
    int num1, num2, num3;
    double avg;
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the first number:");
    num1 = scnr.nextInt();
    System.out.println("Enter the second number:");
    num2 = scnr.nextInt();
    System.out.println("Enter the third number:");
    num3 = scnr.nextInt();
    avg = (num1 + num2 + num3) / 3.0;
    System.out.println("Average is: " + avg);
    scnr.close();
  }
}
