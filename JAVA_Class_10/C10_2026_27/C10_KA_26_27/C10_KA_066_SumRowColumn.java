/** Write a program in Java to input a two-dimensional array of size n x m (rows = n; columns = m) and perform the following tasks:
 *  i. Print the array in matrix form (n x m).
 *  ii. Compute and print the sum of elements of each row.
 *  iii. Compute and print the sum of elements of each column.
 */
/* SumRowsColumns.java */

import java.util.Scanner;
public class SumRowColumn
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        int sumRow = 0;
        int sumColumn = 0;
        System.out.println("Enter number of rows: ");
        int rows = keyboard.nextInt();
        System.out.println("Enter number of columns:");
        int columns = keyboard.nextInt();
        int array2D[][] = new int[rows][columns];
        System.out.println("Enter " + (rows * columns) + " numbers");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                array2D[i][j] = keyboard.nextInt();
            }
        }
        System.out.println("Two dimensional array:");
        for(int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum of rows: ");
        for( int i = 0; i < rows; i++)
        {
            sumRow = 0;
            for (int j = 0; j < columns ; j++)
            {
                sumRow = sumRow + array2D[i][j];
            }
            System.out.println("Sum of row with index " + i + " is " + sumRow);
        }
        System.out.println("Sum of columns: ");
        for (int i = 0; i < columns; i++)
        {
            for (int j = 0 ; j < rows; j++)
            {
                sumColumn = sumColumn + array2D[i][j];
            }
            System.out.println("Sum of columns with index " + i +  " is " + sumColumn);
        }
        keyboard.close();
    }
}