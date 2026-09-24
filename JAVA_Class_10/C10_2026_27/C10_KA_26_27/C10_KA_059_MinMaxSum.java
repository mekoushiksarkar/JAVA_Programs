/** Write a program to input integer elements into an array of size 20 and perform the following operations:
 * i. Display the largest number from the array.
 * ii. Display the smallest number from the array.
 * iii. Display the sum of all the elements of the array.
 */
/* MinMaxSum.java */

import java.util.Scanner;
public class MinMaxSum
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int element[] = new int[20];
        System.out.print("Enter 20 elements: ");
        for(int i = 0; i < 20; i++)
        {
            element[i] = keyboard.nextInt();
        }
        int largest = element[0];
        int smallest = element[0];
        int sum  = 0;
        for (int i = 0; i < 20; i++)
        {
            if (element[i] < smallest)
            smallest = element[i];
            if (element[i] > largest)
            largest = element[i];
            sum = sum + element[i];
        }
        System.out.println("Largest element is: " + largest);
        System.out.println("Smallest element is: " + smallest);
        System.out.println("Sum of all the elements is: " + sum);
    }
}