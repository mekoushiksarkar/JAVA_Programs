// If Even no. then SUM of digits OR Odd no. then MUL of digits

import java.util.*;
class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int b;
		System.out.println("Enter an integer: ");
		b=sc.nextInt();
		if(b%2==0)
		{
			System.out.println("Even");
			int a=(b%10);
			int q=(b/10);
			int sum=(a+q);
			System.out.println("The sum is: "+sum);
		}
		else
		{
			System.out.println("Odd");
			int r=(b%10);
			int s=(b/10);
			int m=(r*s);
			System.out.println("The multiplication is: "+m);
		}
	}
}
