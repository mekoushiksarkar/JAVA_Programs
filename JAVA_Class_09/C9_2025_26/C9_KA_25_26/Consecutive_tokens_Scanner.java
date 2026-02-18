/* GetFirstTwoTokens.java */

import java.util.Scanner;

public class Consecutive_tokens_Scanner {

  public static void main(String args[]) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the string : ");
    String firstToken = scnr.next();
    System.out.println("First token is " + firstToken);
    String secondToken = scnr.next();
    System.out.println("Second token is " + secondToken);
    scnr.close();
  }
}
