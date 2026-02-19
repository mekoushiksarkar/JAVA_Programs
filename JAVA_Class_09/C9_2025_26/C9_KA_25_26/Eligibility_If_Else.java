/* Eligibility.java */

import java.util.*;

public class Eligibility_If_Else {

  public static void main(String args[]) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter age: ");
    int age = scnr.nextInt();
    if (age >= 18) 
        System.out.println("Candidate can vote.");
    else 
        System.out.println("Candidate cannot vote.");
    System.out.println("****** End *****");
    scnr.close();
  }
}
