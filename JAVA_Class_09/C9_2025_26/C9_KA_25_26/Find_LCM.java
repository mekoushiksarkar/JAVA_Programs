/* FindLCM.java */

import java.util.*;

public class Find_LCM {

  public static void main(String args[]) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the first number:  ");
    int num1 = scnr.nextInt();
    System.out.println("Enter the second number:  ");
    int num2 = scnr.nextInt();
    int lcm = (num1 > num2) ? num1 : num2;
    while (true) {
      if (lcm % num1 == 0 && lcm % num2 == 0) 
        break;
      lcm++;
    }
    System.out.println("The Lowest Common Multiple is : " + lcm);
  }
}
