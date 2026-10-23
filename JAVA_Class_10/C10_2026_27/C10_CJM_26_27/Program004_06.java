// Program to demonstrate various string manipulation methods in Java

import java.util.*;
class Manipulation2
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a,b,v=0;
        String st,st1="";
        char chr,chr1;
        System.out.println("Enter a string:");
        st=sc.next();
        b=st.length();
        System.out.println("The output:");
        for(a=0;a<b;a++)
        {  
            chr=st.charAt(a);
            if(chr>='a' && chr<='z')
            {
               chr1=Character.toUpperCase(chr);
               st1=st1+chr1;
            }
            else if(chr>='A' && chr<='Z')
            {
               chr1=Character.toLowerCase(chr);
               st1=st1+chr1;
            }
            else
              st1=st1+chr;
        }
        System.out.println("The new string after converting the case of each letter:");
        System.out.println(st1);    
            System.out.println();
    }
}

// o/p

// Enter a string:
// sAnChArI
// The output:
// The new string after converting the case of each letter:
// SaNcHaRi


// === Code Execution Successful ===