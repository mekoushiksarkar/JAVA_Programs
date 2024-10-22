// Grade: MARKS IN ENGLISH

import java.util.Scanner;
public class FindGrade
{
   public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int marks;
        char grade;
        System.out.println("Enter the marks in English: "); 
        marks=sc.nextInt();
        if(marks>=90)
        grade='A';
        else if(marks>=70 && marks<=89)
        grade='B';
        else if(marks>=50 && marks<=69) 
        grade='C';
        else if(marks>=35 && marks<=49) 
        grade='D';
        else
        grade='E';
        System.out.println("Grade Obtained= " +grade); 
    }
}