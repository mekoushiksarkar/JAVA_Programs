// Program to sort an array of integers in ascending order in Java using selection sort

import java.util.*;
class S_Sort
{
    public static void main(String[] args)
    {
        int i,j,t,min;
        int m[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number in the cells:");
        for(i=0;i<5;i++)
            m[i]=sc.nextInt();
        for(i=0;i<4;i++)
        {
            min=i;
            for(j=i+1;j<5;j++)
            {
                if(m[j]<m[min])
                  min=j;
            }
          t=m[i];
          m[i]=m[min];
          m[min]=t;
        }
        System.out.println("The numbers arranged in ascending order:");
        for(i=0;i<5;i++)
          System.out.println(m[i]);
    }
}


// o/p

// Enter the number in the cells:
// 52
// 96
// 2
// 100
// 25
// The numbers arranged in ascending order:
// 2
// 25
// 52
// 96
// 100

// === Code Execution Successful ===