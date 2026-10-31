// Program to print the pattern of a word entered by the user

import java.util.*;
public class Pattern
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String st;
        int a, b;
        
        System.out.print("Enter a word to print the pattern: ");
        st = in.next().toUpperCase();
        b = st.length();
        
        System.out.println("The Pattern:");
        
        for(a = 1; a <= b; a++)
        {
            System.out.println(st.substring(0, a));
        }
    }
}

// o/p

// Enter a word to print the pattern: SHREYAAN
// The Pattern:
// S
// SH
// SHR
// SHRE
// SHREY
// SHREYA
// SHREYAA
// SHREYAAN
