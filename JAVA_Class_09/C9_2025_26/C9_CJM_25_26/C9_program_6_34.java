//A program to find the smallest numbers

import java.util.*;

public class Smallest {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the three numbers:");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    double d = Math.min(a, b);
    Double e = Math.min(c, d);
    System.out.println("Smallest number:" + e);
  }
}

// Output

// Enter the three numbers:
// 14
// 65
// 99
// Smallest number:14.0

// === Code Execution Successful ===
