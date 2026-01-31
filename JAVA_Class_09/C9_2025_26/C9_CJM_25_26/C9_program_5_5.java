//A program to calculate the values

import java.util.*;

public class Velocity {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of y:");
    double y = sc.nextDouble();
    double d = (++y * (y++ + 5));
    System.out.println("The value is:" + d);
  }
}

// Output

// Enter the value of y:
// 15
// The value is:336.0

// === Code Execution Successful ===
