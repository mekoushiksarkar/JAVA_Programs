/** Define a class to declare an array of size twenty of double datatype, accept the elements into the array and perform
 * the following.
 * # Calculate and print the product of all the elements.
 * # Print the square of each element of the array.
 */

import java.util.Scanner;
public class ArrayOperations
{
    public static double calculateProduct(double[] num)
    {
        double product = 1.0;
        for (int i = 0; i < 20; i++)
        {
            product *= num[i];
        }
        return product;
    }
    public static void printSquare(double[] num)
    {
        for (int i = 0; i < 20; i++)
        {
            System.out.println("Square of " + num[i] + " : " + (num[i] * num[i]));
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double[] array = new double[20];
        System.out.println("Enter twenty double numbers: ");
        for (int i = 0; i < 20; i++)
        {
            array[i] = scanner.nextDouble();
        }
        double product = calculateProduct(array);
        System.out.println("Product of all elements: " + product);
        System.out.println("Square of each element: ");
        printSquare(array);
        scanner.close();
    }
}