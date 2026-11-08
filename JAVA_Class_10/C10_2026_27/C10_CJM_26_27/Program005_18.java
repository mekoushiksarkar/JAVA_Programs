// Using method

import java.util.*;
class Over_loading
{
    void SumSeries(int n, double x)
    {
        double sum = 0.0;
        for (int i = 1; i <= n; i++)
        {
            if (i % 2 == 0)
                sum = sum - x / i;
            else
                sum = sum + x / i;
        }
        System.out.println("Sum of first series: " + sum);
    }

    void SumSeries()
    {
        long p = 1, sum1 = 0;
        for (int i = 1; i <= 20; i++)
        {
            p = p * i;
            sum1 = sum1 + p;
        }
        System.out.println("Sum of second series: " + sum1);
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = in.nextInt();
        System.out.print("Enter the value of x: ");
        double x = in.nextDouble();

        Over_loading ob = new Over_loading();
        ob.SumSeries(n, x);
        ob.SumSeries();
    }
}

// o/p

// Enter number of terms: 7
// Enter the value of x: 7
// Sum of first series: 5.316666666666667
// Sum of second series: 2561327494111820313
