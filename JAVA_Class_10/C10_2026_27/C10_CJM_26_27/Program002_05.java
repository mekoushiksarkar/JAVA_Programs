// To encode a character

import java.util.*;
class Encode {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char c, ch;
    int t;
    System.out.println("Enter a letter:");
    c = sc.next().charAt(0);
    if (Character.isUpperCase(c)) 
        t = (int) c + 5;
    else 
        t = (int) c - 3;
    ch = (char) t;
    System.out.println("encoded letter is\t:" + ch);
  }
}

// o/p

// Enter a letter:
// S
// encoded letter is	:X

// === Code Execution Successful ===
