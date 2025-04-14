// Biggest number among three numbers

import java.util.*;
class Main 
{
    public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three integers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b)
        {
            if(a>c)
				System.out.println("A is greater:"+a);
            else
				System.out.println("C is greater:"+c);
        }
        else
        {
            if(b>c)
				System.out.println("B is greater:"+b);
            else
				System.out.println("C is greater:"+c);
        }
    }
}