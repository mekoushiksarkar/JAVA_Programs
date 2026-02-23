/* IfStatementDemo.java */

import java.util.*;

public class If_Statement_Demo {

  public static void main(String args[]) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter age: ");
    int age = scnr.nextInt();
    if (age >= 18) System.out.println("Candidate can vote.");
    System.out.println("******  End  ******");
    scnr.close();
  }
}
