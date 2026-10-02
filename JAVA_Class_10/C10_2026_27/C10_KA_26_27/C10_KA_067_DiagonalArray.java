/** Define a class to accept values into an integer array of order 4 x 4 and check whether it is a DIAGONAL array or not.
 *  An array is DIAGONAL if the sum of the left diagonal elements equals the sum of the right diagonal element. Print the 
 *  appropriate message.
 *  Example:
 *      3   4   2   5       Sum of the left diagonal elements = 
 *      2   5   2   3       3 + 5 + 2 + 1 = 11
 *      5   3   2   7       Sum of the right diagonal elements =
 *      1   3   7   1       5 + 2 + 3 + 1 = 11
 */

import java.util.*;
public class DiagonalArray
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter size of n x n array: ");
        int size = keyboard.nextInt();
        int array2D[][] = new int[size][size];
        int sumLeftDiag= 0 , sumRightDiag = 0;
        System.out.println("Enter " + (size * size) + " numbers");
        for(int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                array2D[i][j] = keyboard.nextInt();
            }
        }
        System.out.println("Two dimensional array is: ");
        for (int i =0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                System.out.print(array2D[i][j] + " ");
                //Sum of left diagonal
                if(i==j)
                sumLeftDiag += array2D[i][j];
                //Sum of right diagonal
                if ((i+j) == (size -1))
                sumRightDiag += array2D[i][j];
            }
            System.out.println();
        }
        if (sumLeftDiag == sumRightDiag)
        System.out.println("Array is diagonal");
        else
        System.out.println("Array is not diagonal");
        keyboard.close();
    }
}