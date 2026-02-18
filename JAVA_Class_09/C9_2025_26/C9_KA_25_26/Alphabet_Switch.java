/* VowelOrConsonantWithSwitch.java */

import java.util.*;

public class Alphabet_Switch {

  public static void main(String args[]) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter a character: ");
    char mychar = scnr.next().charAt(0);
    if ((mychar >= 'a' && mychar <= 'z') || (mychar >= 'A' && mychar <= 'Z')) {
      switch (mychar) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
          System.out.println("Character " + mychar + " is a Vowel");
          break;
        default:
          System.out.println("Character " + mychar + " is a Consonant");
      }
    } else System.out.println(mychar + " is not an alphabet");
    scnr.close();
  }
}
