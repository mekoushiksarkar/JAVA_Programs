//A program to calculate the values

import java.util.*;
public class Velocity
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of c:");
        double c=sc.nextDouble();
        double d=++c + c++ +4;
        System.out.println("The value is:"+d);
    }
}

Output

Enter the value of c:
5
The value is:16.0