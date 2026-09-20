/* BinarySearch.java */

import java.util.*;
public class BinarySearch
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        int searchNumber;
        int foundIndex = -1;
        int start, mid, end;
        int list[] = { 11, 33, 40, 45, 68, 67, 56, 98, 87, 99, 78};
        System.out.println("Enter a number to search:");
        searchNumber = keyboard.nextInt();
        start = 0;
        end = list.length - 1;
        while(start <= end)
        {
            mid = (start + end) / 2;
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
        if(foundIndex >=0 )
        System.out.println("Number " + searchNumber + " found at index " + foundIndex);
        else
        System.out.println("Number " + searchNumber + " not found");
        keyboard.close();
    }
}