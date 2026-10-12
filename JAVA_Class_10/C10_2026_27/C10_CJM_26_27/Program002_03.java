// To find the sum of ASCII codes of a character

import java.util.*;
class ASCII
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        char c;
        int i,s=0;
        System.out.println("Enter any 10 characters:");
        for(i=1;i<=10;i++)
        {
            c=sc.next().charAt(0);
            s=s+(int)c;
        }
        System.out.println("Sum of ASCII codes\t:"+s);
    }
    
}

// o/p

// Enter any 10 characters:
// *
// 4
// a
// $
// h
// 89
// /
// r
// s
// W
// Sum of ASCII codes	:750

// === Code Execution Successful ===