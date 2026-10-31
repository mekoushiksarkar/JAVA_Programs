// Replace each vowel by next character and each consonant by previous character

import java.util.*;
public class Replace
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String st, nst = "";
        char ch;
        
        System.out.print("Enter a String: ");
        st = in.nextLine();
        st = st.toUpperCase();
        
        int p = st.length();
        
        for(int i = 0; i < p; i++)
        {
            ch = st.charAt(i);
            
            if(Character.isLetter(ch))
            {
                if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                    nst = nst + (char)(ch + 1);
                else
                    nst = nst + (char)(ch - 1);
            }
            else
                nst = nst + ch;
        }
        
        System.out.println("New String: " + nst);
    }
}

// o/p

// Enter a String: BECONFIDENTINYOURLIFE
// New String: AFBPMEJCFMSJMXPVQKJEF
