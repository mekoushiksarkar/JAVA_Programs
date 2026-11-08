// Using method

import java.util.*;
public class Check_Number
{
    void Number()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("1. To check a Buzz Number");
        System.out.println("2. To check a Composite Number");
        System.out.print("Enter your choice: ");
        int ch = in.nextInt();

        switch (ch)
        {
            case 1:
                System.out.print("Enter a number: ");
                int n = in.nextInt();
                if (n % 7 == 0 || n % 10 == 7)
                    System.out.println(n + " is a Buzz number");
                else
                    System.out.println(n + " is not a Buzz number");
                break;

            case 2:
                System.out.print("Enter a number: ");
                int a = in.nextInt();
                int c = 0;
                for (int i = 2; i < a; i++)
                {
                    if (a % i == 0)
                        c++;
                }
                if (c > 0)
                    System.out.println(a + " is a composite number");
                else
                    System.out.println(a + " is not a composite number");
                break;

            default:
                System.out.println("Wrong choice!!");
        }
    }

    public static void main(String args[])
    {
        Check_Number ob = new Check_Number();
        ob.Number();
    }
}

// o/p

// 1. To check a Buzz Number
// 2. To check a Composite Number
// Enter your choice: 1
// Enter a number: 49
// 49 is a Buzz number
