// Odd or Even

import java.util.Scanner;
public class Check
{
	void evenOrOdd()
	{
		Scannersc=new Scanner(System.in);
		int n;
		System.out.println("Enter an integer: ");
		n= sc.nextInt();
		if (n%2==0)
			System.out.println("Even");
		else             
			System.out.println("Odd");
	}
}