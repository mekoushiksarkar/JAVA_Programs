//A program to calculate the final velocity

import java.util.*;
public class Velocity
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        double a=sc.nextDouble();
        double d=a++ + ++a;
        System.out.println("The value is:"+d);
    }
}

Output

Enter the value of a:
56
The value is:114.0