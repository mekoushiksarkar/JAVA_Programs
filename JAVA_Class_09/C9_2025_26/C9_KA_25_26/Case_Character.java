/* CheckCase.java */

import java.util.*;

public class Case_Character {

  public static void main(String args[]) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter a character: ");
    char mychar = scnr.next().charAt(0);
    if (mychar >= 'A' && mychar <= 'Z') 
        System.out.println(mychar + " is in Uppercase");
    else 
        System.out.println(mychar + " is in Lowercase");
    scnr.close();
  }
}
