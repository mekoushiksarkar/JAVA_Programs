// Triangle Forming

import java.util.*;
class Main 
{
    public static void main(String[] args) 
	{
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of three sides of the triangle: ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        if(a==b&&a==c)
        {
            System.out.println("An equilateral triangle is formed.");
            double p=(a+b+c);
            double area=(1.73/4*(a*a));
            System.out.println("the perimeter and area is: "+p+ " and " +area);
        }
        else if(a==b||b==c||a==c)
        {
            System.out.println("An isosceles triangle is formed.");
            double p=(a+b+c);
            double s=((a+b+c)/2);
            double ar=(s*((s-a)*(s-b)*(s-c)));
            double area=Math.sqrt(ar);
            System.out.println("The perimeter and area is: "+p+ " and " +area);
        }
        else
            System.out.println("No triangle is formed");
    }
}