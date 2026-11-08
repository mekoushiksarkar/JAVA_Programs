// To calculate the gross and net salary of an employee

import java.util.*;
public class Employee_Sal
{
    String name, empno;
    int basic;
    double da, hra, pf, gs, net;
    Employee_Sal(String n, String en, int bs)
    {
        name = n;
        empno = en;
        basic = bs;
    }
    void compute()
    {
        da = basic * 30.0 / 100.0;
        hra=basic*15.0/100.0;
        pf=basic*12.0/100.0;
        gs=basic+da+hra;
        net=gs-pf;
    }
    void display()
    {
        System.out.println("Name : " + name);
        System.out.println("Employee Number : " + empno);
        System.out.println("Gross Salary : Rs " + gs);
        System.out.println("Net Salary : Rs " + net);
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String nm, enm;
        int bsal;
        System.out.println("Enter Employee's Name, Employee No. and Basic Salary :");
        nm = in.nextLine();
        enm = in.nextLine();
        bsal = in.nextInt();
        Employee_Sal ob = new Employee_Sal(nm, enm, bsal);
        ob.compute();
        ob.display();
    }
}

// o/p
// Enter Employee's Name, Employee No. and Basic Salary :
// SANCHARI
// 1234567890
// 200000
// Name : SANCHARI
// Employee Number : 1234567890
// Gross Salary : Rs 290000.0
// Net Salary : Rs 266000.0
