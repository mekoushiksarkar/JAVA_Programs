// WAP to swap between two numbers using if statement

import java.util.Scanner;

public class swap_ifstatement
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER");
        double a = sc.nextDouble();
        System.out.println("ENTER THE SECOND NUMBER");
        double b = sc.nextDouble();
        
        if(a>b)
        {
            a=a+b;
            b=a-b;
            a=a-b;
        }
        if(b<a)
        {
            b=b-a;
            a=b-a;
            b=a-b;
        }
        System.out.println("NUMBER AFTER SWAPPING");
        System.out.println(+a);
        System.out.println(+b);
    }
}