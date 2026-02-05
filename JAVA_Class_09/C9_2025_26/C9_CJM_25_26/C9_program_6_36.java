//A program to find the value of an expression

import java.util.*;

public class Side {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a:");
    double a = sc.nextDouble();
    System.out.println("Enter the value of b:");
    double b = sc.nextDouble();
    System.out.println("Enter the value of c:");
    double c = sc.nextDouble();
    double d = 1 / Math.pow(a, 2) + 1 / Math.pow(b, 3) + 1 / Math.pow(c, 4);
    System.out.println("Value of the expression=" + d);
  }
}

// Output

// Enter the value of a:
// 2
// Enter the value of b:
// 5
// Enter the value of c:
// 3
// Value of the expression=0.2703456790123457

// === Code Execution Successful ===
