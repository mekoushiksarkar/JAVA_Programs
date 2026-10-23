// Using method

import java.util.*;

public class Series
{
    int sum(int a)
    {
        int s = 0;
        for (int i = 1; i <= a; i++)
            s = s + (i * (i + 1));
        return s;
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();

        Series ob = new Series();
        int p = ob.sum(n);
        System.out.println("The sum of the series is " + p);
    }
}


// o/p

// Enter the value of n: 5
// The sum of the series is 70
