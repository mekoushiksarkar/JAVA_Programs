// Using method

import java.util.*;

public class Morphic
{
    boolean isAutomorphic(int n)
    {
        int sq = n * n;
        int temp = n;
        int digits = 0;

        while (temp != 0)
        {
            digits++;
            temp /= 10;
        }

        int lastDigits = (int)(sq % Math.pow(10, digits));
        return lastDigits == n;
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        Morphic ob = new Morphic();
        if (ob.isAutomorphic(num))
            System.out.println(num + " is an Automorphic number");
        else
            System.out.println(num + " is not an Automorphic number");
    }
}

// o/p

// Enter a number: 659
// 659 is not an Automorphic number
