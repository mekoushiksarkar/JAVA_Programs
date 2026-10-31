// To delete the repeated letters present in a word

import java.util.*;
public class Duplicate
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String s1, s2 = "";
        int i, j, p, t;
        char ch1, ch2;
        
        System.out.print("Enter a word in lowercase: ");
        s1 = in.next();
        p = s1.length();
        
        for(i = 0; i < p; i++)
        {
            ch1 = s1.charAt(i);
            t = 0;
            
            for(j = 0; j < s2.length(); j++)
            {
                ch2 = s2.charAt(j);
                if(ch1 == ch2)
                {
                    t = 1;
                    break;
                }
            }
            
            if(t == 0)
                s2 = s2 + ch1;
        }
        
        System.out.println("The new word after removing duplicate letters: " + s2);
    }
}

// o/p

// Enter a word in lowercase: MADAM
// The new word after removing duplicate letters: MAD
