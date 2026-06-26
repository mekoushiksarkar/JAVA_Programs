/* PrintTable.java */

import java.util.*;
public class Print_Table
{
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scnr.nextInt();
        System.out.println("****** Table of " + num + " ******");
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(num + " x " + i + " = " + (i * num));
        }
    }
}
