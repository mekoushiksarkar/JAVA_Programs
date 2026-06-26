/* PronicNumber.java */

import java.util.*;
public class Pronic_Number
{
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scnr.nextInt();
        boolean pronic = false;
        for (int i =1; i < number; i++)
        {
            int product = i * (i + 1);
            if (product == number)
            {
                pronic = true;
                break; // no need to continue any further
            }
        }
        if(pronic)
            System.out.println(number + " is a Pronic number");
        else
            System.out.println(number + " is not a Pronic number");
        scnr.close();
    }
}
