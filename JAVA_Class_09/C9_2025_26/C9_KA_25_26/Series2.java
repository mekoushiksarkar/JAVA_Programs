/* Series2.java */

import java.util.*;
public class Series2
{
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a positive number n:  ");
        int n = scnr.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++)
        {
            sum += i * i;
        }
        System.out.println("Sum of the series (1^2 + 2^2 + ..... + " + n + "^2) : " + sum);
        scnr.close();
    }
}

