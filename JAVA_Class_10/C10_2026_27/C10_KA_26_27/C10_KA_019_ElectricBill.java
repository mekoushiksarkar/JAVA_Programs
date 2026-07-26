/** Define a class Electic Bill with the following specifications:
    Class: Electric Bill
    Instance Variables/Data Member:
    String n                to store the name of the customer
    int units               to store the number of units consumed
    double bill             to store the amount to be paid
    Member Methods:
    void accept()           to accept the name of the customer and number of units consumed
    void calculate()        to calculate the bill as per the following tariff:
                            Number of units             Rate per unit
                            First 100 units                 Rs.2.00
                            Next 200 units                  Rs.3.00
                            Above 300 units                 Rs.5.00
    A surcharge of 2.5% charged if the number of units consumed is above 300 units.
    void print()            to print the details as follows:
                            Name of the customer........
                            Number of units consumed.....
                            Bill amount......
    Write a main method to create an object of the class and call the above member methods.
 */
/*ElectricBill.java*/
import java.util.Scanner;
public class ElectricBill
{
    private String n;
    private int units;
    private double bill;
    public void accept()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Name: ");
        n = keyboard.nextLine();
        System.out.print("Enter units: ");
        units = keyboard.nextInt();
        keyboard.close();
    }
    public void calculate()
    {
        double surcharge;
        if (units <= 100)
            bill = units * 2;
        else if (units <= 300)
            bill = 100 * 2 + (units - 100) * 3;
        else
        {
            bill = 100 * 2 + 200 * 3 + (units - 300) * 5;
            surcharge = bill * 2.5;
            bill = bill + surcharge;
        }
    }
    public void print()
        {
         System.out.println("Name of the customer: " + n);
            System.out.println("Number of units consumed: " + units);
            System.out.println("Bill amount: " + bill);
        }
    public static void main(String args[])
        {
          ElectricBill electricBill = new ElectricBill();
          electricBill.accept();
          electricBill.calculate();
          electricBill.print();
        }
    
}