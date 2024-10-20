// Percentage of Three Subjects

import java.util.*;
class Percent
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Name of student: ");
        String name = obj.next();
        System.out.println("Enter the marks in three subjects: ");
        int m1 = obj.nextInt();
        int m2 = obj.nextInt();
        int m3 = obj.nextInt();
        double percentage= (m1+m2+m3)/300.0*100;
        System.out.println("Percentage obtained= " + percentage);
    }
}