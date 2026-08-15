/* ArrayUsingScanner.java */

import java.util.*;
public class ArrayScanner
{
    public static void main (String args[]) {
        Scanner keyboard = new Scanner(System.in);
        float numbers[] = new float[5];
        System.out.println("Enter 5 floating point numbers: ");
        for ( int i = 0; i < 5; i++)
            numbers[i] = keyboard.nextFloat();
        System.out.println("Numbers in reverse order are: ");
        for (int i = 4; i >= 0; i--)
            System.out.println(numbers[i]);
        keyboard.close();
    }
}