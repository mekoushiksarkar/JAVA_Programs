// Using method

import java.util.*;
class Overload
{
    void print()                                     // Pattern @#@#@
    {
        for (int i = 1; i <= 4; i++)
        {
            for (int j = 1; j <= 5; j++)
            {
                if (j % 2 == 1)
                    System.out.print("@");
                else
                    System.out.print("#");
            }
            System.out.println();
        }
    }

    double print(double a, double b)                 // Sum with difference 0.5
    {
        double sum = 0.0;
        for (double p = a; p <= b; p += 0.5)
            sum += p;
        return sum;
    }

    int print(char ch1, char ch2)                    // Larger character ASCII
    {
        return (ch1 > ch2) ? ch1 : ch2;
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        Overload ob = new Overload();

        System.out.println("1. Print Pattern");
        System.out.println("2. Sum from a to b (diff 0.5)");
        System.out.println("3. Larger character ASCII");
        System.out.print("Enter choice: ");
        int ch = in.nextInt();

        switch (ch)
        {
            case 1:
                ob.print();
                break;
            case 2:
                System.out.print("Enter a and b: ");
                double a = in.nextDouble(), b = in.nextDouble();
                System.out.println("Sum = " + ob.print(a, b));
                break;
            case 3:
                System.out.print("Enter two characters: ");
                char c1 = in.next().charAt(0);
                char c2 = in.next().charAt(0);
                System.out.println("ASCII of larger = " + ob.print(c1, c2));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}

// o/p

// 1. Print Pattern
// 2. Sum from a to b (diff 0.5)
// 3. Larger character ASCII
// Enter choice: 2
// Enter a and b: 98
// 100
// Sum = 495.0
