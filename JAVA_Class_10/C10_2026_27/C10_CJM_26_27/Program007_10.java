// To calculate the bill

import java.util.*;
class Cabservice
{
    String taxino, name;
    int d, amt;
    Cabservice()
    {
        taxino = "";
        name = "";
        d = 0; amt = 0;
    }
    void input()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter taxi number: ");
        taxino = in.nextLine();
        System.out.println("Enter name of the passenger: ");
        name = in.nextLine();
        System.out.println("Enter distance travelled: ");
        d = in.nextInt();
    }
    void calculate()
    {
        if (d <= 1)
            amt = 25;
        if (d > 1 && d <= 5)
            amt = d * 30;
        if (d > 5 && d <= 10)
            amt = d * 35;
        if (d > 10 && d <= 20)
            amt = d * 40;
        if (d > 20)
            amt = d * 45;
    }
    void display()
    {
        System.out.println("Taxi No." + "\t" + "Name" + "\t" + "Distance(km)" + "\t" + "Bill Amount(Rs)");
        System.out.println(taxino + "\t" + name + "\t" + d + "\t" + amt);
    }
    public static void main(String args[])
    {
        Cabservice ob = new Cabservice();
        ob.input();
        ob.calculate();
        ob.display();
    }
}

// o/p

// Enter taxi number: 
// 1234567890
// Enter name of the passenger: 
// SURAJIT
// Enter distance travelled: 
// 60
// Taxi No.	Name	Distance(km)	Bill Amount(Rs)
// 1234567890	SURAJIT	60	2700
