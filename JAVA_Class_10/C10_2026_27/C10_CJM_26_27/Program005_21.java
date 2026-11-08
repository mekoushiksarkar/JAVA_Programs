// Using method

import java.util.*;
class Overload
{
    double perform(double r, double h)               // CSA of cone
    {
        double l = Math.sqrt(r * r + h * h);
        return Math.PI * r * l;
    }

    void perform(int r, int c)                       // Pattern
    {
        for (int i = 1; i <= r; i++)
        {
            for (int j = 1; j <= c; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }

    void perform(int m, int n, char ch)              // Quotient / Remainder
    {
        if (ch == 'Q' || ch == 'q')
            System.out.println("Quotient = " + (m / n));
        else if (ch == 'R' || ch == 'r')
            System.out.println("Remainder = " + (m % n));
        else
            System.out.println("Invalid character");
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        Overload ob = new Overload();

        System.out.println("1. CSA of Cone");
        System.out.println("2. Print Pattern");
        System.out.println("3. Quotient / Remainder");
        System.out.print("Enter choice: ");
        int ch = in.nextInt();

        switch (ch)
        {
            case 1:
                System.out.print("Enter radius and height: ");
                double r = in.nextDouble(), h = in.nextDouble();
                System.out.println("CSA = " + ob.perform(r, h));
                break;
            case 2:
                System.out.print("Enter rows and columns: ");
                int rows = in.nextInt(), cols = in.nextInt();
                ob.perform(rows, cols);
                break;
            case 3:
                System.out.print("Enter two numbers and character (Q/R): ");
                int m = in.nextInt(), n = in.nextInt();
                char c = in.next().charAt(0);
                ob.perform(m, n, c);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}

// o/p

// 1. CSA of Cone
// 2. Print Pattern
// 3. Quotient / Remainder
// Enter choice: 2
// Enter rows and columns: 9
// 7
// 1 2 3 4 5 6 7 
// 1 2 3 4 5 6 7 
// 1 2 3 4 5 6 7 
// 1 2 3 4 5 6 7 
// 1 2 3 4 5 6 7 
// 1 2 3 4 5 6 7 
// 1 2 3 4 5 6 7 
// 1 2 3 4 5 6 7 
// 1 2 3 4 5 6 7 
