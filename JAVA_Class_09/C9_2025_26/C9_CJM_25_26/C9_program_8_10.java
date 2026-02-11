// Displaying Only Positive Sum

import java.util.*;

class Number {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, c, i;
    for (i = 1; i <= 5; i++) {
      System.out.println("Enter the first number:");
      a = sc.nextInt();
      System.out.println("Enter the second number:");
      b = sc.nextInt();
      c = a + b;
      if (c < 0) 
        continue;
      System.out.println("Sum of two numbers:" + c);
    }
  }
}
