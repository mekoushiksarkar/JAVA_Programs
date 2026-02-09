// Checking of Perfectsquare numbers

import java.util.*;

class Prfct_Sqares {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    double p;
    while (true) {
      System.out.println("Enter a positive number and zero to terminate");
      n = sc.nextInt();
      if (n == 0) break;
        p = Math.sqrt(n);
      if ((int) p * p == n) 
        System.out.println(n + " is a perfect square number");
      else 
        System.out.println(n + " is not a perfect square number");
    }
    System.out.println("Program Terminates!");
  }
}

// o/p

// Enter a positive number and zero to terminate
// 7281
// 7281 is not a perfect square number
// Enter a positive number and zero to terminate
// 81
// 81 is a perfect square number
// Enter a positive number and zero to terminate
// 1131
// 1131 is not a perfect square number
// Enter a positive number and zero to terminate
// 25
// 25 is a perfect square number
// Enter a positive number and zero to terminate
// 0
// Program Terminates!

// === Code Execution Successful ===
