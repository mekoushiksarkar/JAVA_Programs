// A program to calculate discount on the cost of purchased items

import java.util.*;
class ShowRoom
{
    String name;
    long mobno;
    double cost;
    double dis, amount;
    ShowRoom()
    {
        name = "";
        mobno = 0;
        cost = 0.0;
        dis = 0.0;
        amount = 0.0;
    }
    void input()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        name = in.nextLine();
        System.out.print("Enter mobile number: ");
        mobno = in.nextLong();
        System.out.print("Enter cost: Rs ");
        cost = in.nextDouble();
    }
    void calculate()
    {
        if (cost <= 10000)
            dis = cost * 5 / 100;
        else if (cost <= 20000)
            dis = cost * 10 / 100;
        else if (cost <= 35000)
            dis = cost * 15 / 100;
        else
            dis = cost * 20 / 100;
        amount = cost - dis;
    }
    void display()
    {
        System.out.println("Customer Name: " + name);
        System.out.println("Mobile Number: " + mobno);
        System.out.println("Amount to pay after discount: Rs " + amount);
    }
    public static void main(String args[])
    {
        ShowRoom ob = new ShowRoom();
        ob.input();
        ob.calculate();
        ob.display();
    }
}

// o/p

// Enter customer name: RIU
// Enter mobile number: 7954350987
// Enter cost: Rs 56000
// Customer Name: RIU
// Mobile Number: 7954350987
// Amount to pay after discount: Rs 44800.0
