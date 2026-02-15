// Program to find the sum of series

import java.util.*;

class Series {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i, a;
    double s = 0;
    System.out.println("Enter the value of a:");
    a = sc.nextInt();
    for (i = 0; i <= 10; i++) {
      if (i % 2 == 0) 
        s = (s + (Math.pow(a, i)));
      else 
        s = (s - (Math.pow(a, i)));
    }
    System.out.println("The sum of series:" + s);
  }
}

// o/p

// Enter the value of a:
// 69
// The sum of series:2.4112484312168346E18

// === Code Execution Successful ===
