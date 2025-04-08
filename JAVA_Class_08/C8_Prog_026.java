// Pythagorean Triplets or NOT

import java.util.*;
class Main 
{
    public static void main(String[] args) 
	{
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three numbers:");
        double h=sc.nextDouble();
        double p=sc.nextDouble();
        double b=sc.nextDouble();
        if(h*h==(p*p)+(b*b))
			System.out.println("The numbers are pythagorean triplets.");
        else
			System.out.println("The numbers are not pythagorean triplets.");
    }
}
