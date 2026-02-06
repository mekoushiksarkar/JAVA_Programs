// Sum of only odd numbers

import java.util.*;

class Sum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i, n, sum = 0;
    for (i = 1; i <= 10; i++) {
      System.out.println("Enter the numbers one by one:");
      n = sc.nextInt();
      if (n % 2 != 0) 
        sum = sum + n;
    }
    System.out.println("Sum of odd numbers=" + sum);
  }
}

// o/p

// Enter the numbers one by one:
// 6
// Enter the numbers one by one:
// 9
// Enter the numbers one by one:
// 5
// Enter the numbers one by one:
// 0
// Enter the numbers one by one:
// 1
// Enter the numbers one by one:
// 3
// Enter the numbers one by one:

// 8
// Enter the numbers one by one:
// 6
// Enter the numbers one by one:
// 7
// Enter the numbers one by one:
// 2
// Sum of odd numbers=25

// === Code Execution Successful ===
