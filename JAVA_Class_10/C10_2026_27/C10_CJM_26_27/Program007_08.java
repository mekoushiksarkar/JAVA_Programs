// To calculate the average and maximum marks

import java.util.*;
public class Marks
{
    String name;
    int age, m1, m2, m3, max;
    double avg;
    Marks(String n, int d, int a, int b, int c)
    {
        name = n;
        age = d;
        m1 = a;
        m2 = b;
        m3 = c;
    }
    void compute()
    {
        avg = (m1 + m2 + m3) / 3;
        if(m1 > m2 && m1 > m3)
            max = m1;
        if(m2 > m1 && m2 > m3)
            max = m2;
        if(m3 > m1 && m3 > m2)
            max = m3;
    }
    void display()
    {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age + " years");
        System.out.println("Marks in three subjects : " + m1 + " " + m2 + " " + m3);
        System.out.println("The highest marks in three subjects : " + max);
        System.out.println("The average marks : " + avg);
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String nm;
        int ag, a1, b1, c1;
        System.out.println("Enter Name, Age, Marks in three subjects one by one:");
        nm = in.nextLine();
        ag = in.nextInt();
        a1 = in.nextInt();
        b1 = in.nextInt();
        c1 = in.nextInt();
        Marks ob = new Marks(nm, ag, a1, b1, c1);
        ob.compute();
        ob.display();
    }
}

// o/p
// Enter Name, Age, Marks in three subjects one by one:
// SHREYAAN
// 8
// 99
// 98
// 97
// Name : SHREYAAN
// Age : 8 years
// Marks in three subjects : 99 98 97
// The highest marks in three subjects : 99
// The average marks : 98.0
