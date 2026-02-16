// A nested for loop pattern

import java.util.*;

class NestedLoop {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i, j, k, n;
    System.out.println("Enter 1 for a triangle and 2 for an inverted triangle");
    System.out.println("Enter your choice:");
    k = sc.nextInt();
    switch (k) {
      case 1:
        System.out.print("Enter the number of terms:");
        n = sc.nextInt();
        System.out.println("The pattern is a triangle:");
        for (i = 1; i <= n; i++) {
          for (j = 1; j <= i; j++) {
            System.out.print(i + "");
          }
          System.out.println();
        }
        break;
      case 2:
        System.out.print("Enter the number of terms:");
        n = sc.nextInt();
        System.out.println("The pattern is an inverted triangle:");
        for (i = n; i >= 1; i--) {
          for (j = 1; j <= i; j++) {
            System.out.print(i + "");
          }
          System.out.println();
        }
        break;
      default:
        System.out.println("Wrong choice!!!");
    }
  }
}

// o/p

// Enter 1 for a triangle and 2 for an inverted triangle
// Enter your choice:
// 2
// Enter the number of terms:7
// The pattern is an inverted triangle:
// 7777777
// 666666
// 55555
// 4444
// 333
// 22
// 1

// === Code Execution Successful ===
