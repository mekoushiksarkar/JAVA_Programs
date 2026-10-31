// To arrange the letters of a String in alphabetical order

import java.util.*;
public class Alphabet
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String str;
        int i, j, p;
        char ch;
        
        System.out.print("Enter a String in Uppercase: ");
        str = in.next().toUpperCase();
        p = str.length();
        
        System.out.println("The letters arranged in alphabetical order:");
        
        for(i = 65; i <= 90; i++)
        {
            for(j = 0; j < p; j++)
            {
                ch = str.charAt(j);
                if(ch == (char)i)
                    System.out.print(ch);
            }
        }
    }
}

// o/p

// Enter a String in Uppercase: SUPERCALIFRASCTICFAGILISTIC
// The letters arranged in alphabetical order:
// AAACCCCEFFGIIIIILLPRRSSSTTU
