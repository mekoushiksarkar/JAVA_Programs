// Program to find Pronic numbers in a given range

import java.util.*;
public class Pronic_Number
{
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a number: ");
        // int number = scnr.nextInt();
        int n = scnr.nextInt();
        
        // int pronic = 5;
        for(int j=1; j<=n; j++)
        {
            int number=j;
            for (int i =1; i < number; i++)
            {
                int product = i * (i + 1);
                if (product == number)
                {
                    // pronic = 1;
                    System.out.println(i +"*"+ (i+1) +"="+number + " is a Pronic number");
                    // break; // no need to continue any further
                }
            }
        }