//A program to calculate the values

import java.util.*;

public class Velocity {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a:");
    double a = sc.nextDouble();
    a = a - ++a + a++ + 4;
    System.out.println("The value is:" + a);
  }
}

// Output
// Enter the value of a:
// 1
// The value is:5.0