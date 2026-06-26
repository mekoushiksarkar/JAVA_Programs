/* PrintSeries.java */

import java.util.*;
public class Print_Series
{
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        int i = 1;
        long series = 0;
        System.out.print("Enter the number of terms in the series: ");
        int n = scnr.nextInt();
        while ( i <= n)
        {
            series = series * 10 + 1;
            System.out.println(series);
            i++;
        }
        scnr.close();
    }
}
