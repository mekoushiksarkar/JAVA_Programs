// Displaying Digits

import java.util.*;

class Negative {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int d, n;
    System.out.println("Enter a number:");
    n = sc.nextInt();
    System.out.println("The digits are:");
    while (n > 0) {
      d = n % 10;
      System.out.println(d);
      n = n / 10;
    }
  }
}

// o/p

// Enter a number:
// 29658
// The digits are:
// 8
// 5
// 6
// 9
// 2

// === Code Execution Successful ===
