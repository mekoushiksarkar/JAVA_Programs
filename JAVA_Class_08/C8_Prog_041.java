// Sum Series: 1/2 + 1/4 + 1/6 + ...

import java.util.*;
class Main 
{
    public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range:");
        double n=sc.nextInt();
        double i,s=0;
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                s=s+1/i;
            }
        }
        System.out.println("The Sum of the series is: "+s);
    }
}