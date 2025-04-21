// Sum Series: Even

import java.util.*;
class Main 
{
    public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range:");
        int n=sc.nextInt();
        int i, s=0;
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
            s=s+i;
        }
        System.out.println("The Sum of the series is: "+s);
        
    }
}