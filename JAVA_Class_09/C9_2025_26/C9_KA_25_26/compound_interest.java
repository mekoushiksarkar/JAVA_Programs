// WAP to calculate the compound interest for a given amount for a certain period for a certain period

import java.util.*;   

public class compound_interest
{
    public static void main(String[]args)
    {
        //taking for all the arguments
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR CAPITAL: ");
        double p = sc.nextDouble();
        System.out.println("ENTER YOUR RATE OF INTEREST: ");
        double r = sc.nextDouble();
        System.out.println("ENTER YOUR TIME PERIOD: ");
        double t = sc.nextDouble();
        
        //calculating compound interest
        double a = p*(1+(r/t));
        double cp = a-p;
        System.out.println("THE COMPOUND INTEREST IS"+" "+cp);
    }
}    