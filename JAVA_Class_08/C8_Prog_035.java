// Sum of Natural no.

import java.util.*;
class Main 
{
    public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n=sc.nextInt();
        int s=0;
        int i=1;
        for(i=1;i<=n;i++)
        {
            s=s+i;
        }
        System.out.println("Sum of numbers: " +s );
    }
}
