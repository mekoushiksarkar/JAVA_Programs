// To find the number of uppercase and lowercase letters

import java.util.*;
class Count
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        char c;
        int i,n,nlc=0,nuc=0;
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        System.out.println("Enter any "+n+" characters:");
        for(i=1;i<=n;i++)
        {
            c=sc.next().charAt(0);
            if(Character.isUpperCase(c))
                nuc++;
            else
                nlc++;
        }
        System.out.println("Number of uppercase letters\t:"+nuc);
        System.out.println("Number of lowercase letters\t:"+nlc);
        
    }
    
}

// o/p

// Enter the value of n:
// 5
// Enter any 5 characters:
// R
// s
// Q
// k
// l
// Number of uppercase letters	:2
// Number of lowercase letters	:3

// === Code Execution Successful ===