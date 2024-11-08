// AVERAGE OF 10 NUMBERS

import java.util.*;
class Average
{
    public static void main(String[]args)
    {
        int i,n,s=0;
        float av;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        for(i=1;i<=10;i++)
        {
            n=sc.nextInt();
            s=s+n;
        }
        av=s/10f;
        System.out.println("Average= "+av);
    }
}