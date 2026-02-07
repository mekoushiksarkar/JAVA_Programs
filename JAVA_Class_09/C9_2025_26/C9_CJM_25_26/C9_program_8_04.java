// Sum of only negative numbers

import java.util.*;

class Negative {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = 1, n, s = 0;
    System.out.println("Enter any 5 numbers:");
    while (a <= 5) {
      n = sc.nextInt();
      if (n < 0) 
        s = s + n;
      a++;
    }
    System.out.println("Sum of negative numbers:" + s);
  }
}

// o/p

// Enter any 5 numbers:
// -12
// 6
// 0
// -69
// 70
// Sum of negative numbers:-81

// === Code Execution Successful ===
