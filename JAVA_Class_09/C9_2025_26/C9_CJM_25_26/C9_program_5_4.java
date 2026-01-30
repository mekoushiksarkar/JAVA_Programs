//A program to calculate the values

import java.util.*;

public class Velocity {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of m:");
    double m = sc.nextDouble();
    double d = m++ * 5 + --m;
    System.out.println("The value is:" + d);
  }
}

// Output

// Enter the value of m:
// 21
// The value is:126.0

// === Code Execution Successful ===
