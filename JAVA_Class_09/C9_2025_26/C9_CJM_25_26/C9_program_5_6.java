//A program to calculate the values

import java.util.*;

public class Velocity {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a:");
    double a = sc.nextDouble();
    System.out.println("Enter the value of b");
    double b = sc.nextInt();
    double d = a++ * 6 + ++b * 5 + 10;
    System.out.println("The value is:" + d);
  }
}

// Output

// Enter the value of a:
// 4
// Enter the value of b
// 3
// The value is:54.0

// === Code Execution Successful ===
