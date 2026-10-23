// Program to print each character of a given uppercase word in a new line in Java

import java.util.*;
class Manipulation2
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        String st;
        System.out.println("Enter the word in uppercase:");
        st=sc.next();
        b=st.length();
        System.out.println("The pattern:");
        for(a=0;a<b;a++)
        {
            System.out.println(st.charAt(a));
        }
    }
}

// o/p

// Enter the word in uppercase:
// SANCHARI
// The pattern:
// S
// A
// N
// C
// H
// A
// R
// I

// === Code Execution Successful ===