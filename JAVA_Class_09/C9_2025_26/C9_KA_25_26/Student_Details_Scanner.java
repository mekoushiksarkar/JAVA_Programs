/* StudentDetails.java */

import java.util.Scanner;
public class Student_Details_Scanner
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String myName = scnr.nextLine();
        System.out.println("Enter class:        ");
        int myClass = scnr.nextInt();
        System.out.println("Enter Section:        ");
        char mySection = scnr.next().charAt(0);
        System.out.println("Enter Roll Number:          ");
        int rollNumber =  scnr.nextInt();
        System.out.println("Enter Total Percentage:        ");
        float totalPercentage = scnr.nextFloat();
        System.out.println("Name:          " + myName);
        System.out.println("Class:                " + myClass);
        System.out.println("Section:              " + mySection);
        System.out.println("Roll Number:          " + rollNumber);
        System.out.println("Total Percentage:     " + totalPercentage);
        scnr.close();
    }
}