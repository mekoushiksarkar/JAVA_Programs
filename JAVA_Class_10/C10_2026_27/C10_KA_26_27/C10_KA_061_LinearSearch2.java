/** Define a class to accept values into an array of double data types of size 20. Accept a double value from user the search
 *  in the array using linear search method. If value is found, display message, "Found" with its position where it is
 *  present in the array. Otherwise display message "not found".
 */

import java.util.Scanner;
public class LinearSearch2
{
    public static int linearSearch(double[] array, double key)
    {
        for(int i = 0; i < array.length; i++)
        {
            if (array[i] == key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double[] array = new double[20];
        System.out.println("Enter twenty double numbers:");
        for(int i = 0; i < 20; i++)
        {
            array[i]  = scanner.nextDouble();
        }
        System.out.println("Enter the double value to search:");
        double searchValue = scanner.nextDouble();
        int position = linearSearch(array, searchValue);
        if(position != -1)
        {
            System.out.println("Found at position: " + (position));
        }
        else
        {
            System.out.println("Not found.");
        }
        scanner.close();
    }
}