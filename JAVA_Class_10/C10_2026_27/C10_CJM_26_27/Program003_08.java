// Program to merge two arrays

import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        int i,n,m,p,pos;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of array elements of arr1:");
        n=sc.nextInt();
        System.out.println("Enter number of array elements of arr2:");
        m=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        int arr3[]=new int[n+m];
        System.out.println("Enter the elements of arr1:");
        for(i=0;i<n;i++)
            arr1[i]=sc.nextInt();
        System.out.println("Enter the elements of arr2:");
        for(i=0;i<m;i++)
            arr2[i]=sc.nextInt();
        for(i=0;i<n;i++)
            arr3[i]=arr1[i];
        for(i=0;i<m;i++)
            arr3[n+i]=arr2[i];
        System.out.println("Array elements after merging:");
        for(i=0;i<(n+m);i++)
            System.out.println(arr3[i]);
    }
}

// o/p

// Enter number of array elements of arr1:
// 2
// Enter number of array elements of arr2:
// 3
// Enter the elements of arr1:
// 52
// 6
// Enter the elements of arr2:
// 15
// 89
// 30
// Array elements after merging:
// 52
// 6
// 15
// 89
// 30

// === Code Execution Successful ===