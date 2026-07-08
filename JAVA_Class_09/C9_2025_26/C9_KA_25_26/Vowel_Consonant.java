/* VowelOrConsonant.java */

import java.util.*;
public class Vowel_Consonant
{
  public static void main(String args[]) {
      Scanner scnr = new Scanner(System.in);
      System.out.println("Enter a character: ");
      char mychar = scnr.next().charAt(0);
      if ((mychar >= 'a' && mychar <= 'z') || (mychar >= 'A' && mychar <= 'Z'))
      if (mychar == 'a' || mychar == 'e' || mychar == 'i' || mychar == 'u' || mychar == 'o' || mychar == 'A' || mychar == 'E' || 
      mychar == 'O' || mychar == 'I' || mychar == 'U')
      System.out.println("Character " + mychar + " is a Vowel");
      else 
      System.out.println("Character " + mychar + " is a Consonant");
      else
      System.out.println(mychar + " is not an alphabet");
      scnr.close();
  }
}
