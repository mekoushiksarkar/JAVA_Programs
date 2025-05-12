// Sum Series: 1 + 1/2! + 1/3! + ...

import java.util.*;
class Main 
{
    public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range:");
        double n=sc.nextInt();
        double i, j, s=0;
        for(i=1;i<=n;i++)
        {
			double m=1;
			for(j=1;j<=i;j++)
				m = m * j;
            s=s+1/m;
        }
        System.out.println("The Sum of the series is: "+s);
    }
}