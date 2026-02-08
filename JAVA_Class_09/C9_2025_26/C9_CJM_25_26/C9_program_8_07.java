// Negative Sum to Terminate the Program

import java.util.*;

class ngtve {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, c, i;
    for (i = 1; i <= 10; i++) {
      System.out.println("Enter two numbers:");
      a = sc.nextInt();
      b = sc.nextInt();
      c = a + b;
      if (c < 0) 
        break;
      System.out.println("Sum of two numbers:" + c);
    }
    System.out.println("Program Terminates!");
  }
}

// o/p

// Enter two numbers:
// 45
// 20
// Sum of two numbers:65
// Enter two numbers:
// -52
// -52
// Program Terminates!

// === Code Execution Successful ===
