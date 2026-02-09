// Displaying positive or negative number

import java.util.*;

class Number {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    do {
      System.out.println("Enter a number and zero to terminate:");
      n = sc.nextInt();
      if (n == 0) 
        break;
      if (n > 0) 
        System.out.println(n + ": a positive number");
      else 
        System.out.println(n + ": a negative number");
    } while (true);
    System.out.println("Program Terminates!");
  }
}

// o/p

// Enter a number and zero to terminate:
// 45521
// 45521: a positive number
// Enter a number and zero to terminate:
// -42632
// -42632: a negative number
// Enter a number and zero to terminate:
// 98562
// 98562: a positive number
// Enter a number and zero to terminate:
// 4523
// 4523: a positive number
// Enter a number and zero to terminate:
// -89653
// -89653: a negative number
// Enter a number and zero to terminate:
// 0
// Program Terminates!

// === Code Execution Successful ===
