// Program to count the number of vowels in a string

import java.util.*;
class Manipulation2
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a,b,v=0;
        String st;
        char chr;
        System.out.println("Enter a string:");
        st=sc.next();
        b=st.length();
        System.out.println("The pattern:");
        for(a=0;a<b;a++)
        {  
            chr=st.charAt(a);
            if("AEIOUaeiou".indexOf(chr)>=0)
            v++;
        }
            System.out.println("The no. of vowels="+v);
    }
}

// o/p

// Enter a string:
// SANCHARI
// The pattern:
// The no. of vowels=3

// === Code Execution Successful ===