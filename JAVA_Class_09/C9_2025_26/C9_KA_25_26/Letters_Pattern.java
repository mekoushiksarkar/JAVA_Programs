/* LettersPattern.java */

import java.util.*;

public class Letters_Pattern {

  public static void main(String args[]) {
    char ch = 'A';
    Scanner scnr = new Scanner(System.in);
    System.out.print("Please enter the number of rows: ");
    int numRows = scnr.nextInt();
    for (int i = 1; i <= numRows; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(ch + "  ");
      }
      ch++;
      System.out.println();
    }
    scnr.close();
  }
}
