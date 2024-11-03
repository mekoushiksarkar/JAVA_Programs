// SUM OF ALL NATURAL NUMBERS

import java.util.*;
class Sum
{
    public static void main(String[]args)
    {
        int i,n,s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            s=s+i;
        }
        System.out.println("Sum= "+s);
    }
}