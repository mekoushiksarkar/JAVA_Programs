/* TotalMarks.java */

import java.util.*;
public class Total_Marks
{
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the total marks out of 100: ");
        int totalMarks = scnr.nextInt();
        if (totalMarks >= 80) {
            System.out.println("You did pass");
            System.out.println("Well done!");
        }
        else {
            System.out.println("You did not pass");
            System.out.println("Try harder next time.");
        }
        scnr.close();
    }
}
