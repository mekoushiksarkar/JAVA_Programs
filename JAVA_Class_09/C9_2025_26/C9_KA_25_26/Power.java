/* Power.java */

import java.util.*;
public class Power
{
    public static void main(String args[]) {
        int power = 1;
        int counter = 1;
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = scnr.nextInt();
        System.out.print("Enter the second number: ");
        int y = scnr.nextInt();
        while (counter <= y) 
        {
            power = power * x;
            counter++;
        }
        System.out.println(x + "^" + y + "=" + power);
        scnr.close();
    }
}
