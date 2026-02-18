/* BuzzNumber.java */

import java.util.*;

public class Buzz_Number {

  public static void main(String args[]) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = scnr.nextInt();
    if ((num % 10 == 7) || (num % 7 == 0)) 
        System.out.println(num + " is a buzz number.");
    else 
        System.out.println(num + " is not a buzz number.");
    scnr.close();
  }
}
