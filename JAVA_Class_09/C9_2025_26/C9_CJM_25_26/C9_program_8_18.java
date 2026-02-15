// Program to find the sum of series

import java.util.*;

class Series {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i, a;
    double s = 0;
    System.out.println("Enter the value of a:");
    a = sc.nextInt();
    for (i = 1; i <= 20; i++) {
      if (i % 2 == 0) 
        s = (s - (double) (a / i));
      else 
        s = (s + (double) (a / i));
    }
    System.out.println("The sum of series:" + s);
  }
}

// o/p

// Enter the value of a:
// 85
// The sum of series:57.0

// === Code Execution Successful ===
