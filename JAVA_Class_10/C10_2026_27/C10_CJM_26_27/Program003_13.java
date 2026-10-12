// Program to find the minimum and maximum number from an array of integers in Java

import java.util.*;
class Min_Max
{
    public static void main(String[] args)
    {
        int i,min,max;
        int m[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of cells:");
        for(i=0;i<5;i++)
            m[i]=sc.nextInt();
        max=m[0];min=m[0];
        for(i=0;i<5;i++)
        {
            if(m[i]>max)
              max=m[i];
            if(m[i]<min)
              min=m[i];
        }
        System.out.println("Greatest:"+max);
        System.out.println("Smallest:"+min);
    }
}

// o/p

// Enter the number of cells:
// 12
// 63
// 8
// 94
// 20
// Greatest:94
// Smallest:8

// === Code Execution Successful ===