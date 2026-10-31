// To display the frequency of a word in a sentence

import java.util.*;
public class Frequency
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String st, s1, s2 = "";
        int i, p, f = 0;
        char chr;
        
        System.out.println("Enter a string:");
        st = in.nextLine();
        
        System.out.println("Enter a word to be searched in the sentence:");
        s1 = in.nextLine();
        
        st = st + " ";
        p = st.length();
        
        for(i = 0; i < p; i++)
        {
            chr = st.charAt(i);
            
            if(chr != ' ')
                s2 = s2 + chr;
            else
            {
                if(s2.equalsIgnoreCase(s1))
                    f++;
                s2 = "";
            }
        }
        
        System.out.println("Frequency of searched word present in the sentence: " + f);
    }
}


// o/p

// Enter a string:
// I AM SANCHARI
// Enter a word to be searched in the sentence:
// AM
// Frequency of searched word present in the sentence: 1
