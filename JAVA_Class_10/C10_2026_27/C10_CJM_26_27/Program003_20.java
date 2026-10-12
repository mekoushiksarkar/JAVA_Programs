// Program to calculate the sum of one-digit and two-digit numbers in an array of integers in Java

import java.util.*;
class N_um
{
    public static void main(String[] args)
    {
        int i,sd=0,dd=0;
        int m[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        for(i=0;i<5;i++)
            m[i]=sc.nextInt();
        for(i=0;i<5;i++)
        {
           if(m[i]>=0 && m[i]<10)
             sd=sd+m[i];
           if(m[i]>=10 && m[i]<100)
             dd=dd+m[i];
        }
        System.out.println("Sum of one-digit numbers:"+sd);
        System.out.println("Sum of two-digit numbers:"+dd);
    }    
}

// o/p

// Enter 5 numbers:
// 45
// 8
// 25
// 3
// 9
// Sum of one-digit numbers:20
// Sum of two-digit numbers:70

// === Code Execution Successful ===