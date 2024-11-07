// SUM OF Numbers WHICH ARE MULTIPLES OF 9

import java.util.*;
class SumMultiplesOf9
{
    public static void main(String[]args)
    {
        int i,n,s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        for(i=1;i<=10;i++)
        {
            n=sc.nextInt();
            if(n%9==0)
                s=s+n;
        }
        System.out.println("Sum= "+s);
    }
}