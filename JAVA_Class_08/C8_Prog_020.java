// AVERAGE OF EVEN NUMBERS

import java.util.*;
class AverageOffEven
{
    public static void main(String[]args)
    {
        int i,n,s=0,c=0;
        float av;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        for(i=1;i<=10;i++)
        {
            n=sc.nextInt();
            if(n%2==0)
            {
                s=s+n;
                c++;
            }
        }
	}
}