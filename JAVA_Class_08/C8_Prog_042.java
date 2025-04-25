// Sum Series: 1 + 1/2 + 1/3 + 1/4 + ...

import java.util.*;
class Main 
{
    public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range:");
        double n=sc.nextInt();
        double i=0;
        double s=0;
        for(i=1;i<=n;i++)
        {
            s=s+1/i;
        }
        System.out.println("The Sum of the series is: "+s);
    }
}