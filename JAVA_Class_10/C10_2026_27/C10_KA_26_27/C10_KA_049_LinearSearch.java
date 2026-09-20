/* LinearSearch.java */

import java.util.*;
public class LinearSearch
{
    public static void main(String args[]) 
    {
        Scanner keyboard = new Scanner(System.in);
        int searchNumber;
        int foundIndex = -1;
        int list[] = {11, 87, 34, 45, 88 , 12, 99, 75, 50};
        System.out.println("Enter a number to search:");
        searchNumber = keyboard.nextInt();
        for(int i = 0; i < list.length; i++)
        {
            if(list[i] == searchNumber)
            {
                foundIndex = i;
                break;
            }
        }
        if(foundIndex >= 0)
        System.out.println("Number " + searchNumber + " found at index " + foundIndex);
        else
        System.out.println("Number " + searchNumber + " not found");
        keyboard.close();
    }
}