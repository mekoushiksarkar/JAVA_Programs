// Program to delete an element from an array at a given position

import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        int i, n, pos;
        int arr[] = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array elements:");
        n = sc.nextInt();
        System.out.println("Enter array elements:");
        for (i = 0; i < n; i++) 
            arr[i] = sc.nextInt();
        System.out.println("Enter the position of deletion:");
        pos = sc.nextInt();
        for (i = pos + 1; i < n; i++) 
            arr[i - 1] = arr[i];
        n--;
        System.out.println("Array elements after deletion:");
        for (i = 0; i < n; i++) 
            System.out.println(arr[i]);
    }
}

// o/p

// Enter number of array elements:
// 5
// Enter array elements:
// 54
// 63
// 95
// 82
// 14
// Enter the position of deletion:
// 4
// Array elements after deletion:
// 54
// 63
// 95
// 82

// === Code Execution Successful ===
