//A program to find the side of a cube

import java.util.*;

public class Side {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the volume of a cube:");
    double a = sc.nextDouble();
    double d = Math.cbrt(a);
    System.out.println("Side of the square:" + d);
  }
}

// Output

// Enter the volume of a cube:
// 125
// Side of the square:5.0

// === Code Execution Successful ===
