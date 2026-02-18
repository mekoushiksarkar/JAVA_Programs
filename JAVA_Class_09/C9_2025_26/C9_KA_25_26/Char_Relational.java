/* A program to demonstrate comparing different char values*/

public class Char_Relational {

  public static void main(String args[]) {
    char letter1 = 'a';
    char letter2 = 'A';

    System.out.println("letter1 < letter2 is " + (letter1 < letter2));
    System.out.println("letter1 > letter2 is " + (letter1 > letter2));
    System.out.println("letter2 == letter1 is " + (letter2 == letter1));
    System.out.println("letter2 != letter1 is " + (letter2 != letter1));
  }
}
