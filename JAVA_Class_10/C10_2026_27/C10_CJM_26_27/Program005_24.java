// Using method

import java.util.*;
public class Boolean_search
{
    public boolean search(int m[], int ns)
    {
        for (int i = 0; i < 10; i++)
        {
            if (m[i] == ns)
                return true;
        }
        return false;
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int m[] = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++)
            m[i] = in.nextInt();

        System.out.print("Enter a number to be searched: ");
        int ns = in.nextInt();

        Boolean_search ob = new Boolean_search();
        boolean y = ob.search(m, ns);

        if (y)
            System.out.println("The search is successful");
        else
            System.out.println("The search is unsuccessful");
    }
}

// o/p

// Enter 10 numbers:
// 98
// 56
// 12
// 45
// 78
// 16
// 90
// 100
// 24
// 87
// Enter a number to be searched: 16
// The search is successful
