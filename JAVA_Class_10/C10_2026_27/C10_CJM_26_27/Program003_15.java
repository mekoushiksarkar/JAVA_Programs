// Program to search an element in an array of integers in Java

import java.util.*;
class N_S
{
    public static void main(String[] args)
    {
        int i,k=0,ns;
        int m[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers in cells:");
        for(i=0;i<5;i++)
            m[i]=sc.nextInt();
        System.out.println("Enter the element to be searched:");
        ns=sc.nextInt();
        for(i=0;i<5;i++)
        {
            if(m[i]==ns)
              k=1;
        }
        if(k==1)
          System.out.println("The number is present");
        else
          System.out.println("The number is not present");
    }
}

// o/p

// Enter the number of cells:
// 1
// 52
// 69
// 50
// 20
// Enter the element to be searched:
// 58
// The number is not present

// === Code Execution Successful ===