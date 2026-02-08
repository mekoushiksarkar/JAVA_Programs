// Odd and Even Digits check in a Number

import java.util.*;

class Negative {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int d, n;
    System.out.println("Enter a number:");
    n = sc.nextInt();
    do {
      d = n % 10;
      if (d % 2 == 0) 
        System.out.println(d + ":an even digit");
      else 
        System.out.println(d + ": an odd digit");
      n = n / 10;
    } while (n > 0);
  }
}

// o/p

// Enter a number:
// 5943269
// 9: an odd digit
// 6:an even digit
// 2:an even digit
// 3: an odd digit
// 4:an even digit
// 9: an odd digit
// 5: an odd digit

// === Code Execution Successful ===
