// To check whether a word is Palindrome or not

import java.util.*;
public class Palindrome
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String word, word1 = "";
        int i, p;
        char chr;
        
        System.out.print("Enter a word in lowercase or uppercase: ");
        word = in.next();
        p = word.length();
        
        for(i = p - 1; i >= 0; i--)
        {
            chr = word.charAt(i);
            word1 = word1 + chr;
        }
        
        if(word.equalsIgnoreCase(word1))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}

// o/p

// Enter a word in lowercase or uppercase: MAAM
// Palindrome
