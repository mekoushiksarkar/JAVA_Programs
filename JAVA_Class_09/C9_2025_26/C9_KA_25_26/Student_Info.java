/* StudentInfo.java */

import java.util.*;
public class Student_Info
{
    public static void main(String args[]) {
        String studentName, studentClass;
        char studentGrade;
        int rollNumber, marksSub1, marksSub2, marksSub3, marksSub4, marksSub5;
        double totalMarks, percentageMarks;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter Student's Name: ");
        studentName = scnr.nextLine();
        System.out.println("Enter Class: ");
        studentClass = scnr.nextLine();
        System.out.println("Enter Roll Number: ");
        rollNumber = scnr.nextInt();
        System.out.println("Enter Marks in 5 subjects out of 100: ");
        marksSub1 = scnr.nextInt();
        marksSub2 = scnr.nextInt();
        marksSub3 = scnr.nextInt();
        marksSub4 = scnr.nextInt();
        marksSub5 = scnr.nextInt();
        totalMarks = marksSub1 + marksSub2 + marksSub3 + marksSub4 + marksSub5;
        percentageMarks = (totalMarks/500.0) * 100;
        if (percentageMarks >= 90)
			studentGrade = 'A';
        else if ((percentageMarks >= 70) && (percentageMarks < 90))
			studentGrade = 'B';
        else if ((percentageMarks  >= 50) && (percentageMarks < 70))
			studentGrade = 'C';
        else if ((percentageMarks >= 40) && (percentageMarks < 50))
			studentGrade = 'D';
        else if ((percentageMarks >= 0) && (percentageMarks < 40))
			studentGrade = 'E';
        else
			studentGrade = 'F';
        System.out.println("********  Invalid marks entered  ********");
        System.out.println("Student's Name:   " + studentName);
        System.out.println("Class:            " + studentClass);
        System.out.println("Roll Number:      " + rollNumber);
        System.out.println("Marks:            " + marksSub1 + " , " + marksSub2 + " , " + marksSub3 + " , " + marksSub4 + " , " + marksSub5);
        System.out.println("Total Marks:      " + totalMarks);
        System.out.println("Percentage Marks: " + percentageMarks);
        System.out.println("Grade:            " + studentGrade);
        scnr.close();
    }
}