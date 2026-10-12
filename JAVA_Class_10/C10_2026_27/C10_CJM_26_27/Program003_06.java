// Insertion of an element in an array

import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        int i,n,ele,pos;
        int arr[]=new int[50];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of array elements:");
        n=sc.nextInt();
        System.out.println("Enter array elements:");
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter the element to be inserted:");
        ele=sc.nextInt();
        System.out.println("Enter the position of insertion:");
        pos=sc.nextInt();
        for(i=n-1;i>=pos;i--)
            arr[i+1]=arr[i];
            arr[pos]=ele;
            n++;
        System.out.println("Array elements after insertion:");
        for(i=0;i<n;i++)
            System.out.println(arr[i]);
    }
}

// o/p

// Enter number of array elements:
// 5
// Enter array elements:
// 49
// 16
// 5
// 3
// 0
// Enter the element to be inserted:
// 69
// Enter the position of insertion:
// 4
// Array elements after insertion:
// 49
// 16
// 5
// 3
// 69
// 0

// === Code Execution Successful ===