// Using method

import java.util.*;

public class Palin
{
    int reverse(int n)
    {
        int r = 0;
        while (n != 0)
        {
            int d = n % 10;
            r = r * 10 + d;
            n = n / 10;
        }
        return r;
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = in.nextInt();

        Palin ob = new Palin();
        int k = ob.reverse(a);

        if (k == a)
            System.out.println(a + " is a palindrome number");
        else
            System.out.println(a + " is not a palindrome number");
    }
}

// o/p

// Enter a number: 111
// 111 is a palindrome number
