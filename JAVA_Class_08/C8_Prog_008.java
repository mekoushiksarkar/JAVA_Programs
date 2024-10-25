// TYPE OF TRIANGLES

import java.util.*; 
class Triangle
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner (System.in);
		System.out.println ("Enter the length of three sides of the triangle:");
        int a = obj.nextInt();
        int b = obj.nextInt(); 
        int c = obj.nextInt(); 
        if (a == b && a == c)
			System.out.print ("They form an equilateral triangle.All sides are equal in length");
        else if ( a==b ||b==c ||a==c)   
			System.out.print ("They form an isosceles triangle as two sides are equal in length");
        else
			System.out.print ("They form a scalene triangle as all sides are unequal in length");  
    }
}