// Display sum or square of sum of any two numbers

import java.util.*;

class Square {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, c, i = 1, s = 0;
    do {
      System.out.println("Enter two numbers:");
      a = sc.nextInt();
      b = sc.nextInt();
      c = a + b;
      if (c > 0) 
        System.out.println("Sum of two numbers:" + c);
      else {
        s = c * c;
        System.out.println("Square of the sum:" + s);
      }
      i++;
    } while (i <= 5);
  }
}

// o/p

// Enter two numbers:
// -48
// -169
// Square of the sum:47089
// Enter two numbers:
// 58
// 63
// Sum of two numbers:121
// Enter two numbers:
// 789546
// -58
// Sum of two numbers:789488
// Enter two numbers:
// -8954632
// -85210
// Square of the sum:-1599356028
// Enter two numbers:
// 78954
// -622385
// Square of the sum:-1035491663

// === Code Execution Successful ===
