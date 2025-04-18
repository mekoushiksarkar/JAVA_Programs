// Sum of Even No. using FOR

import java.util.*;
class Main 
{
    public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n=sc.nextInt();
        int s=0;
        int i=0;
        for(i=1;i<=n;i++)
        {
           if(i%2==0)
			s=s+i;
        }
        System.out.println("Sum of Even number: " +s);
    }
}