/* SumOfFactors.java */

import java.util.*;
public class SumOfFactors
{
    public static void main(String args[]) {
        int sum = 0;
        int i = 1;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = scnr.nextInt();
        do
        {
            if (num % i == 0)
            {
                System.out.println("Found factor : " + i);
                sum += i;
            }
            i++;
        }
        while (i <= num);
        System.out.println("Sum of factors is : " + sum);
        scnr.close();
    }
}
