// Count the no. of Even and Odd Numbers

import java.util.*;
class Main 
{
    public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range:");
        int n=sc.nextInt();
        int i, e=0, o=0;
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
                e=e+1;
            else
				o=o+1;
        }
        System.out.println("The count for even numbers is: "+e);
        System.out.println("The count for odd numbers is: "+o);
    }
}