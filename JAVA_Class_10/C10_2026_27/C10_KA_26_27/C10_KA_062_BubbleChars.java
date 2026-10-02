/** Define a class to accept 10 characters from a user. Using the bubble sort technique, arrange them in ascending order.
 *  Display the sorted array and original array.
 */

import java.util.Scanner;
public class BubbleChars
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int len = 10;
        char[] originalArray = new char[len];
        System.out.println("Enter 10 characters:");
        for (int i =0 ; i < len; i++)
        {
            originalArray[i] = scanner.next().charAt(0);
        }
        char[] sortedArray = new char[len];
        for(int i = 0; i < len; i++)
        {
            sortedArray[i] = originalArray[i];
        }
        for(int i = 0; i < len - 1; i++)
        {
            for (int j = 0; j < len - i - 1; j++)
            {
                if (sortedArray[j] > sortedArray[j+1])
                {
                    char temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j+1];
                    sortedArray[j+1] = temp;
                }
            }
        }
        System.out.println("Original array: ");
        for (int i = 0; i < len; i++)
        {
            System.out.print(originalArray[i] + " ");
        }
        System.out.println();
        System.out.println("Sorted array:");
        for (int i = 0; i < len; i++)
        {
            System.out.print(sortedArray[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}