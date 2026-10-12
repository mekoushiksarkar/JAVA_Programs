// Program to sort an array of integers in ascending order in Java using bubble sort

import java.util.*;
class N_um
{
    public static void main(String[] args)
    {
        int i,j,t;
        int m[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers in the cells:");
        for(i=0;i<5;i++)
            m[i]=sc.nextInt();
        for(i=0;i<4;i++)
        {
            for(j=0;j<(4-i);j++)
            {
                if(m[j]>m[j+1])
                {
                    t=m[j];
                    m[j]=m[j+1];
                    m[j+1]=t;
                }
            }
        }
        System.out.println("The numbers arranged in ascending order are:");
        for(i=0;i<5;i++)
        System.out.println(m[i]);
    }    
}

// o/p

// Enter the numbers in the cells:
// 85
// 6
// 100
// 25
// 92
// The numbers arranged in ascending order are:
// 6
// 25
// 85
// 92
// 100

// === Code Execution Successful ===