/* Series1.java */

import java.util.*;
public class Series1
{
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        double x = scnr.nextInt();
        System.out.print("Enter the number of terms(n):  ");
        int n = scnr.nextInt();
        double sum = 0.0;
        for ( int i = 1; i <= n; i++)
        {
            if (i % 2 == 1)
            {
                // for odd terms (1, 3, 5, ...)
                sum+= x / i;
            }
            else
            {
                // for even terms (2, 4, 6, ...)
                sum -= x / i;
            }
        }
        System.out.println("Sum of the series: " + sum);
        scnr.close();
    }
}
