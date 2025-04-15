// Check the Sum is Even or Odd

import java.util.*;
class Main 
{
    public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two integers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        if(c%2==0)
        System.out.println("Sum is an even number.");
        else
        System.out.println("Sum is a odd number.");
    }
}