// Program to demonstrate various string manipulation methods in Java

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
        System.out.println("The output:");
        for(a=0;a<b;a++)
        {  
            chr=st.charAt(a);
            {
            if(chr=='e')
            chr='*';
            }
            System.out.print(chr);
        }
            System.out.println();
    }
}

// o/p

// Enter a string:
// heeehee
// The output:
// h***h**

// === Code Execution Successful ===