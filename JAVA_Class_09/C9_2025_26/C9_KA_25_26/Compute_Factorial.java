/* ComputeFactorial.java */

import java.util.*;

public class Compute_Factorial {

  public static void main(String args[]) {
    int factorial = 1;
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = scnr.nextInt();
    for (int i = 1; i <= num; i++) {
      factorial *= i;
    }
    System.out.println(num + "! = " + factorial);
  }
}
