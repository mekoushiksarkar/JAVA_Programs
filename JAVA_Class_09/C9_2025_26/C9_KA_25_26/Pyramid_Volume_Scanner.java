// Program to calculate the volume of a pyramid using Scanner class

import java.util.Scanner;
public class Pyramid_Volume_Scanner
{
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Enter the length of the base of the pyramid : ");
        double length = scnr.nextDouble();
        
        System.out.println("Enter the breadth of the base of the pyramid : ");
        double breadth = scnr.nextDouble();
        
        System.out.println("Enter the height of the pyramid : ");
        double height = scnr.nextDouble();
        
        double area_of_base = length * breadth;
        double volume = (1/3.0) * area_of_base * height;
        
        System.out.println("The volume of the pyramid is " + volume + " cube cm.");
    }
}
