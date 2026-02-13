// Display sum of natural numbers

import java.util.*;

class Natural {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, n, s = 0;
    System.out.println("Enter the value of n:");
    n = sc.nextInt();
    for (a = 1; a <= n; a++) {
      s = s + a;
    }
    System.out.println("The sum of natural numbers up to " + n + ":" + s);
  }
}

// o/p

// Enter the value of n:
// 75
// The sum of natural numbers up to 75:300
