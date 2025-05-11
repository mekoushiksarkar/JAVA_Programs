// Factorial of a no.

import java.util.*;
class Main 
{
    public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range:");
        double n=sc.nextInt();
        double i, m=1;
        for(i=1;i<=n;i++)
        {
            m=m*i;
        }
        System.out.println("The factorial of the number is: "+m);
    }
}