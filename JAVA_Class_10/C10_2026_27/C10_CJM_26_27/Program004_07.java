// Program to count the number of uppercase and lowercase letters in a string and check if it is a super string

import java.util.*;
class Manipulation2
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a,b,uc=0,lc=0;
        String st;
        char chr;
        System.out.println("Enter a string:");
        st=sc.next();
        b=st.length();
        System.out.println("The output:");
        for(a=0;a<b;a++)
        {  
            chr=st.charAt(a);
            if(chr>='a' && chr<='z')
            lc++;
            if(chr>='A' && chr<='Z')
            uc++;
        }
        System.out.println("No. of uppercase letters:"+uc);
        System.out.println("No. of lowercase letters:"+lc);    
        if(uc==lc)
           System.out.println("It is a super string");
        else
           System.out.println("It is not a super string");
    }
}

// o/p

// Enter a string:
// COmmITmeNt
// The output:
// No. of uppercase letters:5
// No. of lowercase letters:5
// It is a super string

// === Code Execution Successful ===