/** Write a program to search for an integer value input by the user in the sorted list given below using the binary search
 * technique. If found display "Search Successful" and print the element, otherwise display "Search Unsuccessful"
 *  {31, 36, 45, 50, 60, 75, 86, 90}
 */
/* BinarySearch.java */

import java.util.Scanner;
public class Successful
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int searchNumber;
        int foundIndex = -1;
        int start, mid, end;
        int list[] = {31, 36, 45, 50, 60, 75, 86, 90};
        System.out.println("Enter a number to search: ");
        searchNumber = keyboard.nextInt();
        start = 0;
        end = list.length-1;
        while (start<= end)
        {
            mid = (start + end)/2;
            if (searchNumber == list[mid])
            {
                foundIndex = mid;
                break;
            }
            else if (searchNumber < list[mid])
            end = mid - 1;
            else
            start = mid + 1;
        }
        if (foundIndex >= 0)
        {
            System.out.println("Search Succesful");
            System.out.println("Number: " + searchNumber + " found at index " + foundIndex);
        }
        else
        System.out.println("Search Unsuccessful");
        keyboard.close();
    }
}