// Sum Series: 1 + 1/2 + 2/3 + 3/4 + ...

import java.util.*;
class Main 
{
    public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range:");
        double n=sc.nextInt();
        double i, s=1;
        for(i=1;i<=n;i++)
        {
            s=s+i/(i+1);
        }
        System.out.println("The Sum of the series is: "+s);
    }
}