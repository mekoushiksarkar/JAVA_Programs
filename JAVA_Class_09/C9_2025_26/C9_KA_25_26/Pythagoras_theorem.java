/* FindHypotenuse.java */

import java.util.*;
public class Pythagoras_theorem
{
    public static void main(String args[]) {
        double hypotenuse;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the first side of a right-angled triangle: ");
        int first_side = scnr.nextInt();
        System.out.println("Enter the second side of the right-angled triangle: ");
        int second_side = scnr.nextInt();
        hypotenuse = Math.sqrt(Math.pow(first_side,2) + Math.pow(second_side,2));
        System.out.println("Length of the hypotenuse is : " + hypotenuse);
        scnr.close();
    }
}