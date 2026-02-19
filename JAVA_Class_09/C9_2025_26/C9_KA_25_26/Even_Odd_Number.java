/* EvenOdd.java */

import java.util.*;

public class Even_Odd_Number {

  public static void main(String args[]) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = scnr.nextInt();
    if (num % 2 == 0) 
        System.out.println(num + " is an Even number");
    else 
        System.out.println(num + " is an Odd number");
    scnr.close();
  }
}
