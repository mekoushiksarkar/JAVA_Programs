// Travel According to Budget

import java.util.*;
class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int amount;
		System.out.println("Enter the amount: ");
		amount=sc.nextInt();
		if(amount>=1000&&amount<=2000)
			System.out.println("Digha");
		else if(amount>=3000&&amount<=5000)
			System.out.println("Puri");
		else if(amount>5000&&amount<=7000)
			System.out.println("Darjeeling");
		else if(amount>7000&&amount<=10000)
			System.out.println("Sikkim");
		else if(amount>10000&&amount<=15000)
			System.out.println("Shimla");
		else if(amount>15000&&amount<=20000)
			System.out.println("Andaman");
		else
			System.out.println("No need to visit any places.");
	}
}