/* Marks.java */

import java.util.Scanner;
public class Marks
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int N = keyboard.nextInt();
        //Declare arrrays of size n
        String name[] = new String[N];
        int totalmarks[] = new int[N];
        //Accept name and marks
        for (int i = 0; i < N; i++)
        {
            System.out.println("Student" + (i+1) + " Name: ");
            name[i] = keyboard.nextLine();
            System.out.println("Student" + (i+1) + " Marks: ");
            totalmarks[i] = keyboard.nextInt();
        }
        keyboard.close();
        //Compute sum of total marks of all the students
        int sum = 0;
        for (int i = 0; i < N; i++)
        {
            sum = sum + totalmarks[i];
        }
        //Compute
        double average = (double) sum / N;
        System.out.println("Average of the total marks is: " + average);
        for (int i = 0; i < N; i++)
        {
            double deviation = totalmarks[i] - average;
            System.out.println("Student: " + name[i] + " Marks: " + totalmarks[i] + " Deviation: " + deviation);
        }
    }
}