//A program to find the diagonal of a square

import java.util.*;

public class Diagonal {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the side of a square:");
    int a = sc.nextInt();
    double d = Math.sqrt(2) * a;
    System.out.println("Side of a square=" + a);
    System.out.println("Diagonal of square:" + d);
  }
}

// Output

// Enter the side of a square:
// 9
// Side of a square=9
// Diagonal of square:12.727922061357857

// === Code Execution Successful ===
