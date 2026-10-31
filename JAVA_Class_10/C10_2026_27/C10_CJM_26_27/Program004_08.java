// To enter a full name and to print initials with surname

import java.util.*;
public class Surname
{
    public static void main(String args[])
    {
        String st, sn, st1 = "", st2 = "";
        int i, p;
        char chr;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the full name: ");
        st = in.nextLine();
        
        st = " " + st;
        p = st.lastIndexOf(' ');
        sn = st.substring(p);
        
        for(i = 0; i < p; i++)
        {
            chr = st.charAt(i);
            if(chr == ' ')
            {
                st1 = st1 + st.charAt(i + 1) + ". ";
            }
        }
        
        st2 = st1 + sn.trim();
        System.out.println("Initials with surname: " + st2);
    }
}

// o/p
// Enter the full name: Sanchari Pramanik
// Initials with surname: S. Pramanik
