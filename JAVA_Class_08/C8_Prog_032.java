// Leap Year using if-else

import java.util.*;
class Main 
{
    public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an year: ");
        int year=sc.nextInt();
        if((year%400==0)||((year%4==0)&&(year%100!=0)))
			System.out.println("It is a leap year.");
        else
			System.out.println("It is not a leap year.");
    }
}