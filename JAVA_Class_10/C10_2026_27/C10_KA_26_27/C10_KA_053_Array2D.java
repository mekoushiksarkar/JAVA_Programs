/* Array2DUsing Scanner.java */

import java.util.*;
public class Array2D
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = keyboard.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = keyboard.nextInt();
        int array2D[] [] = new int[rows][columns];
        System.out.println("Enter " + (rows * columns) + " numbers");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                array2D[i][j] = keyboard.nextInt();
            }
        }
        System.out.println("Two dimensional array is: ");
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j< columns; j++)
            {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}