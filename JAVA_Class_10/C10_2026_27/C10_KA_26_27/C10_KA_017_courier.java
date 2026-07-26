/** DTDC a courier company charges for the courier based on the weight of the parcel. Define a class with the following specifications:
    Class name              courier
    Member variable         name - name of the customer
                            weight - weight of the parcel in kilogram
                            address - address of the recipient
                            bill - amount to be paid
                            type - 'D' for domestic and 'I' for international
    Member methods:
    void accept()           to accept the detail using the methods of the Scanner class only.
    void calculate()        to calculate the bill as per the following criteria:
                            Weight in Kg                    Rate per kg
                            First 3 Kgs                       Rs.800
                            Next 5 Kgs                        Rs.700
                            Above 8 Kgs                       Rs.500
                            An additional amount of Rs. 1500 is charged if the type of the courier is I International
    void print()-           to print the details
    void main()-            to create an object of the class and invoke the methods.
 */
import java.util.Scanner;
public class courier
{
    private String name;
    private double weight;
    private String address;
    private double bill;
    private char type;
    public void accept()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        name = scanner.nextLine();
        System.out.print("Enter weight of the person in kilograms: ");
        weight = scanner.nextDouble();
        System.out.print("Enter address of the recipient: ");
        address = scanner.nextLine();
        System.out.print("Enter type of courier (D for domestic, I for international: ");
        type = scanner.next().charAt(0);
    }
    public void calculate()
    {
        if(weight <= 3)
        {
            bill = weight * 800;
        }
        else if(weight <= 8)
        {
            bill = 6 * 800 + (weight - 3) * 700;
        }
        else
        {
            bill = 3 * 800 + 5 * 700 + (weight - 8) * 500;
        }
        if(type == 'I')
        {
            bill += 1500;
        }
    }
    public void print()
    {
        System.out.println("Customer Name: " + name);
        System.out.println("Parcel Weight: " + weight);
        System.out.println("Recipient Address: " + address);
        System.out.println("Type of courier: " + (type == 'D' ? "Domestic" : "International"));
        System.out.println("Bill Amount: Rs. " + bill);
    }
    public static void main(String args[])
    {
        courier parcel = new courier();
        parcel.accept();
        parcel.calculate();
        parcel.print();
    }
}