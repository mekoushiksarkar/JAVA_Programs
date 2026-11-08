// Using method

import java.util.*;
class Number
{
    void Number(int num, int d)          // Frequency of digit
    {
        int f = 0, original = num;
        while (num > 0)
        {
            if (num % 10 == d)
                f++;
            num /= 10;
        }
        System.out.println("Frequency of digit " + d + " in " + original + " = " + f);
    }

    void Number(int n)                   // Sum of even digits
    {
        int sum = 0, original = n;
        while (n > 0)
        {
            int digit = n % 10;
            if (digit % 2 == 0)
                sum += digit;
            n /= 10;
        }
        System.out.println("Sum of even digits in " + original + " = " + sum);
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        Number ob = new Number();

        System.out.print("Enter a number and a digit: ");
        int num = in.nextInt();
        int d = in.nextInt();
        ob.Number(num, d);

        System.out.print("Enter a number: ");
        int n = in.nextInt();
        ob.Number(n);
    }
}

// o/p

// Enter a number and a digit: 1656478
// 6
// Frequency of digit 6 in 1656478 = 2
// Enter a number: 17779898
// Sum of even digits in 17779898 = 16
