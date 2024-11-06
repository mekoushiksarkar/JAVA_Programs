// SUM OF 10 NUMBERS 

import java.util.*;
class InputAndSum
{
    public static void main(String[]args)
    {
        int i,n,s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        for(i=1;i<=10;i++)
        {
            n=sc.nextInt();
            s=s+n;
        }
        System.out.println("Sum= "+s);
    }
}