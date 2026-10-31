// To display a word in Pig Latin form

import java.util.*;
public class Piglatin
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String str, str1, str2;
        int m, p;
        char ch;
        
        System.out.print("Enter a word: ");
        str = in.next().toUpperCase();
        p = str.length();
        
        for(m = 0; m < p; m++)
        {
            ch = str.charAt(m);
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                break;
        }
        
        str1 = str.substring(m);
        str2 = str.substring(0, m);
        
        System.out.println("Input string: " + str);
        System.out.println("Pig Latin form: " + str1 + str2 + "AY");
    }
}

// o/p

// Enter a word: SANCHARI
// Input string: SANCHARI
// Pig Latin form: ANCHARISAY
