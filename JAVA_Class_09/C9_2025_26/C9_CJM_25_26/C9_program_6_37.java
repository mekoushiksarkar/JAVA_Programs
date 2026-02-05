//A program to calculate the final velocity

import java.util.*;

public class Velocity {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of u:");
    double u = sc.nextDouble();
    System.out.println("Enter the value of a:");
    double a = sc.nextDouble();
    System.out.println("Enter the value of s:");
    double s = sc.nextDouble();
    double d = 1 / Math.sqrt(Math.pow(u, 2) + 2 * a * s);
    System.out.println("Final velocity=" + d);
  }
}

// Output

// Enter the value of u:
// 32
// Enter the value of a:
// 69
// Enter the value of s:
// 3
// Final velocity=0.026370633137494492

// === Code Execution Successful ===
