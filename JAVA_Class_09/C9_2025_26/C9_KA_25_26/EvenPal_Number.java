/* EvenPalNumber.java */

import java.util.*;

public class EvenPal_Number {

  public static void main(String args[]) {
    Scanner scnr = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scnr.nextInt();
    int numOriginal = num, numReverse = 0;
    int sumOfDigits = 0;
    while (num > 0) {
      int digit = num % 10;
      sumOfDigits += digit;
      numReverse = numReverse * 10 + digit;
      num = num / 10;
    }
    boolean isPalindrome = numReverse == numOriginal;
    boolean isSumOfDigitsEven = sumOfDigits % 2 == 0;
    System.out.println("isPalindrome:       " + isPalindrome);
    System.out.println("isSumOfDigitsEven:  " + isSumOfDigitsEven);
    if (isPalindrome && isSumOfDigitsEven) 
        System.out.println(numOriginal + " is EvenPal number");
    else 
        System.out.println(numOriginal + " is not EvenPal number");
    scnr.close();
  }
}
