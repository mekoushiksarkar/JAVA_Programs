// Using method

import java.util.*;
class Overload
{
    public double area(double a, double b, double c)   // Triangle
    {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double area(int a, int b, int height)       // Trapezium
    {
        return 0.5 * height * (a + b);
    }

    public double area(double d1, double d2)           // Rhombus
    {
        return 0.5 * d1 * d2;
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        Overload ob = new Overload();

        System.out.println("1. Scalene Triangle");
        System.out.println("2. Trapezium");
        System.out.println("3. Rhombus");
        System.out.print("Enter choice: ");
        int ch = in.nextInt();

        switch (ch)
        {
            case 1:
                System.out.print("Enter three sides: ");
                double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble();
                System.out.println("Area = " + ob.area(a, b, c));
                break;
            case 2:
                System.out.print("Enter parallel sides and height: ");
                int p1 = in.nextInt(), p2 = in.nextInt(), h = in.nextInt();
                System.out.println("Area = " + ob.area(p1, p2, h));
                break;
            case 3:
                System.out.print("Enter two diagonals: ");
                double d1 = in.nextDouble(), d2 = in.nextDouble();
                System.out.println("Area = " + ob.area(d1, d2));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}

// o/p

// 1. Scalene Triangle
// 2. Trapezium
// 3. Rhombus
// Enter choice: 2
// Enter parallel sides and height: 9
// 7
// 19
// Area = 152.0
