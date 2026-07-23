/** Design a class name ShowRoom with the following description:
    Instance variables / Data members:
    String name             to store the name of the customer
    long mobno              to store the mobile number of the customer
    double cost             to store the cost of the items purchased
    double dis              to store the discount amount
    double amount           to store the amount to be paid after discount
    Member methods:
    ShowRoom()              default constructor to initialise data members
    void input()            to input customer name, mobile  number, cost
    void calculate()        to calculate discount on the cost of purchased items, based on following criteria:
    
                                    Cost                                            Discount(in percentage)
                    Less than or equal to Rs.10000                                              5%
                    More than Rs.10000 and less than or equal to Rs.20000                       10%
                    More than Rs.20000 and less than or equal to Rs.35000                       15%
                    More than Rs.35000                                                          20%
                    
    Write a main method to create an object of the class and call the above member methods.
 */
/* ShowRoom.java */
import java.util.Scanner;
public class ShowRoom
{
    private String name;
    private long mobno;
    private double cost;
    private double dis;
    private double amount;
    public ShowRoom()
    {
        name = new String();
        mobno = 0;
        cost = 0.0;
        dis = 0.0;
        amount = 0.0;
    }
    public void input()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        name = keyboard.nextLine();
        System.out.print("Enter Mobile Number: ");
        mobno = keyboard.nextLong();
        System.out.print("Enter Cost: ");
        cost = keyboard.nextDouble();
    }
    public void calculate()
    {
        if(cost <= 10000)
        dis = 5.0;
        else if(cost <= 20000)
        dis = 10.0;
        else if (cost <= 35000)
        dis = 15.0;
        else 
        dis = 20.0;
        amount = cost - dis;
        dis = dis / 100.0 * cost;
    }
    public void display()
    {
        System.out.println("********************************");
        System.out.println("Customer Name: " + name);
        System.out.println("Mobile Number: " + mobno);
        System.out.println("Amount to be paid: " + amount);
        System.out.println("********************************");
    }
    public static void main(String args[])
    {
        ShowRoom obj = new ShowRoom();
        obj.input();
        obj.calculate();
        obj.display();
    }
}