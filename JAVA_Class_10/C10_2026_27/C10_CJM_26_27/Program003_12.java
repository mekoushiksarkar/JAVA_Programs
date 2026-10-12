// Program to demonstrate the use of array of integers in Java

import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        int i,s=0;
        int m[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of cells:");
        for(i=0;i<5;i++)
            m[i]=sc.nextInt();
        for(i=0;i<5;i++)
        {
            if(m[i]%3==0 || m[i]%5==0)
            s=s+m[i];
        }
        System.out.println("Sum:"+s);
    }
}

// o/p

// Enter the number of cells:
// 54
// 6
// 3
// 3
// 69
// Sum:135

// === Code Execution Successful ===