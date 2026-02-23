/* NivenNumber.java */

import java.util.*;

public class Niven_Number {

  public static void main(String args[]) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int number = scnr.nextInt();
    int sumOfDigits = 0;
    int temp = number;
    while (temp != 0) {
      int digit = temp % 10;
      sumOfDigits = sumOfDigits + digit;
      temp = temp / 10;
    }
    if (number % sumOfDigits == 0) 
        System.out.println(number + " is a Niven number");
    else 
        System.out.println(number + " is not a Niven number");
    scnr.close();
  }
}
