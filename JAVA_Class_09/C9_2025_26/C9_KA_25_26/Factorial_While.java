/* Factorial_While.java */

import java.util.*;

public class Factorial_While {

  public static void main(String args[]) {
    Scanner scnr = new Scanner(System.in);
    int factorial = 1;
    System.out.print("Enter a number:  ");
    int num = scnr.nextInt();
    while (num > 0) {
      factorial *= num;
      num--;
    }
    System.out.println("Factorial is: " + factorial);
    scnr.close();
  }
}
