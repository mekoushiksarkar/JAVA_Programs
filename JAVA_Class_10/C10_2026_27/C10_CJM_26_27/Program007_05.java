// To calculate and display either profit percent or loss percent

import java.util.*;
class Profit_Loss
{
    int cp, sp, pr, loss;
    double pp, lp;
    Profit_Loss()
    {
        cp = 0;
        sp = 0;
    }
    void input(int m, int n)
    {
        cp = m;
        sp = n;
    }
    void display()
    {
        if(sp > cp)
        {
            pr = sp - cp;
            pp = (double)pr / cp * 100;
            System.out.println("The profit percent :" + pp);
        }
        if(cp>sp)
        {
            loss=cp-sp;
            lp=(double)loss/cp*100;
            System.out.println("The loss percent:"+lp);
        }
    }
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter cost price: ");
       int cp = in.nextInt();
       System.out.print("Enter selling price: ");
       int sp = in.nextInt();
       Profit_Loss ob = new Profit_Loss();
       ob.input(cp, sp);
       ob.display();
    }
}
    
	
// o/pEnter cost price: 1000
// Enter selling price: 1569
// The profit percent :56.89999999999999
