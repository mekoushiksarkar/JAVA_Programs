//A program to calculate the side,area,perimeter and diagonal of a square

import java.util.*;

public class square {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the side of the square:");
    double a = sc.nextDouble();
    double ar = a * a;
    double p = 4 * a;
    double d = Math.sqrt(2) * a;
    System.out.println("The side is:" + a);
    System.out.println("The area is:" + ar);
    System.out.println("The perimeter is:" + p);
    System.out.println("The diagonal is:" + d);
  }
}

// Output

// Enter the side of the square:
// 5
// The side is:5.0
// The area is:25.0
// The perimeter is:20.0
// The diagonal is:7.0710678118654755

// === Code Execution Successful ===
