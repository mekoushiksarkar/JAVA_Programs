// Using method

import java.util.*;
public class Sorting
{
    void sort(int m[])
    {
        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9 - i; j++)
            {
                if (m[j] > m[j + 1])
                {
                    int t = m[j];
                    m[j] = m[j + 1];
                    m[j + 1] = t;
                }
            }
        }

        System.out.println("The numbers in ascending order are:");
        for (int i = 0; i < 10; i++)
            System.out.println(m[i]);
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n[] = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++)
            n[i] = in.nextInt();

        Sorting ob = new Sorting();
        ob.sort(n);
    }
}

// o/p

// Enter 10 numbers:
// 67

// 78
// 79
// 7
// 8
// 97
// 132
// 56
// 35
// 22
// The numbers in ascending order are:
// 7
// 8
// 22
// 35
// 56
// 67
// 78
// 79
// 97
// 132
