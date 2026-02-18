/* AscendingNumberPyramid.java */

import java.util.*;

public class AscendingNumPyramid {

  public static void main(String args[]) {
    Scanner scnr = new Scanner(System.in);
    System.out.print("Please enter number of rows: ");
    int rows = scnr.nextInt();
    int myNum = 1;
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(myNum + "  ");
        myNum++;
      }
      System.out.println();
    }
    scnr.close();
  }
}
