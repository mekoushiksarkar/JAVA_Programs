/* Series3.java */

import java.util.*;
public class Series3
{
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the value of n:  ");
        int n = scnr.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= n; i++)
        {
            sum += 1.0 / i;
        }
        System.out.println("Sum of the series (1 + 1/2 + 1/3 +....+ 1/" + n + "): " + sum);
        scnr.close();
    }
}
