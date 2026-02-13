// Display sum of any 10 natural numbers

import java.util.*;

class Natural {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, n, s = 0;
    for (a = 1; a <= 10; a++) {
      System.out.println("Enter a number:");
      n = sc.nextInt();
      s = s + n;
    }
    System.out.println("The sum of numbers:" + s);
  }
}

// o/p

// Enter a number:
// 75
// Enter a number:
// 96
// Enter a number:
// 250
// Enter a number:
// 45
// Enter a number:
// 58413
// Enter a number:
// 632
// Enter a number:
// 9
// Enter a number:
// 5412379
// Enter a number:
// 69
// Enter a number:
// 541267
// The sum of numbers:6013235

// === Code Execution Successful ===
