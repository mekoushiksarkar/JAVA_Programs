/* CheckPositiveNegative.java */

import java.util.*;
public class positive_negative
{
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = scnr.nextInt();
        if (x > 0)
            System.out.println("You entered a postitive number");
        else
        {
            if (x < 0)
                System.out.println("You entered a negative number");
            else
                System.out.println("You entered a zero");
        }
        scnr.close();
    }
}
