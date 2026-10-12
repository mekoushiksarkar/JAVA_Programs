// Program to search an element in an array of integers using binary search in Java

import java.util.*;
class B_S
{
    public static void main(String[] args)
    {
        int i,k=0,ns,p=0,lb=0,ub=9;
        int m[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number in ascending order:");
        for(i=0;i<5;i++)
            m[i]=sc.nextInt();
        System.out.println("Enter the number to be searched:");
        ns=sc.nextInt();
        while(lb<=ub)
        {
            p=(lb+ub)/2;
            if(m[p]<ns)
              lb=p+1;
            if(m[p]>ns)
              ub=p-1;
            if(m[p]==ns)
            {
                k=1;
                break;
            }
        }
        if(k==1)
          System.out.println("The number is present");
        else
          System.out.println("The number is not present");
    }
}

// o/p

// Enter the number in ascending order:
// 25
// 39
// 48
// 99
// 150
// Enter the number to be searched:
// 65
// The number is not present

// === Code Execution Successful ===
