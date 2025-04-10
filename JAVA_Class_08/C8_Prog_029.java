// Swap using Third Variable

import java.util.*;
class Main 
{
    public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two integers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c;
		c=a;
        a=b;
        b=c;
        System.out.println("First number:"+a);
        System.out.println("Second number:"+b);
    }
}
