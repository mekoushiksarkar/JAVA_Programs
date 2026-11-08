// Using method

import java.util.*;
public class Electricity
{
    double cal(int u)
    {
        double c = 0.0;
        if (u <= 100)
            c = u * 1.25;
        else if (u <= 200)
            c = 100 * 1.25 + (u - 100) * 1.50;
        else
            c = 100 * 1.25 + 100 * 1.50 + (u - 200) * 1.80;
        return c;
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter consumer's name: ");
        String name = in.nextLine();
        System.out.print("Enter consumer's number: ");
        int cno = in.nextInt();
        System.out.print("Enter previous reading: ");
        int prev = in.nextInt();
        System.out.print("Enter present reading: ");
        int pres = in.nextInt();

        int units = pres - prev;
        Electricity ob = new Electricity();
        double amt = ob.cal(units);

        System.out.println("\nConsumer No. : " + cno);
        System.out.println("Name          : " + name);
        System.out.println("Units consumed: " + units);
        System.out.println("Amount        : Rs. " + amt);
    }
}

// o/p 

// Enter consumer's name: SANCHARI
// Enter consumer's number: 4576
// Enter previous reading: 78965
// Enter present reading: 985670

// Consumer No. : 4576
// Name          : SANCHARI
// Units consumed: 906705
// Amount        : Rs. 1631984.0
