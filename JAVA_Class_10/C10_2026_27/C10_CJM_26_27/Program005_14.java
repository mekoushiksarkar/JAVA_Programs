// Using method

import java.util.*;

public class Twinp
{
    int prime(int n)
    {
        if (n <= 1) return 0;
        int c = 0;
        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0)
                c++;
        }
        return (c == 2) ? 1 : 0;
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = in.nextInt();
        System.out.print("Enter second number: ");
        int y = in.nextInt();

        Twinp ob = new Twinp();
        if (ob.prime(x) == 1 && ob.prime(y) == 1 && Math.abs(x - y) == 2)
            System.out.println(x + " and " + y + " are Twin Prime numbers");
        else
            System.out.println(x + " and " + y + " are not Twin Prime numbers");
    }
}

// o/p

// Enter first number: 17
// Enter second number: 19
// 17 and 19 are Twin Prime numbers
