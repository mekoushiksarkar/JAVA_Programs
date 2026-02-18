/* ArmstrongNumber.java */

import java.util.*;

public class Armstrong_Number {

  public static void main(String args[]) {
    Scanner scnr = new Scanner(System.in);
    long numOriginal, sumOfPowers = 0;
    int totalDigits = 0;
    System.out.print("Enter a number: ");
    long num = scnr.nextInt();

    // Save the original number for later use
    numOriginal = num;
    
    // Count number of digits in the number
    while (num != 0) {
      totalDigits++;
      num = num / 10;
    }
    num = numOriginal;
    while (num > 0) {
      // Get the last digit
      int digit = (int) num % 10;
      //Find its raise to the power of total number of digits
      long digitpower = (int) Math.pow(digit, totalDigits);
      //add to the sum
      sumOfPowers = sumOfPowers + digitpower;
      // Remove the used last digit from num
      num = num / 10;
    }
    if (numOriginal == sumOfPowers) System.out.println(
      numOriginal + " is an Armstrong number"
    );
    else System.out.println(numOriginal + " is not an Armstrong number");
    scnr.close();
  }
}
