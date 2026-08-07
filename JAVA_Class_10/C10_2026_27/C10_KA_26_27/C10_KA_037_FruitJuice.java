/** Define a class called FruitJuice with the following description:
    Instance variables/ Data members:
    int product_code        : stores the product code number
    String flavour          : stores the flavour of the juice(orange, apple, etc.).
    String pack_type        : stores the type of packaging (tetra-pack, bottle, etc.)
    int pack_size           : stores package size (200ml, 400 ml, etc.)
    int product_price       : stores the price of the product
    Member Methods:
    FruitJuice()            : default constructor to initialize integer date members to zero and string date members to "".
    void input()            : to input and store the product code, flavour, pack type, pack size, and product price.
    void discount()         : to reduce the product price by 10.
    void display()          : to display the product code, flavour, pack type, pack size, and product size.
 */
/* Fruit.Juice.java */
import java.util.Scanner;
public class FruitJuice
{
    int product_code;
    int pack_size;
    int product_price;
    String pack_type;
    String flavour;
    public FruitJuice()
    {
        product_code = 0;
        flavour = " ";
        pack_type = " ";
        pack_size = 0;
        product_price = 0;
    }
    public void input()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Product Code: ");
        product_code = keyboard.nextInt();
        System.out.print("Enter Flavour: ");
        flavour = keyboard.next();
        System.out.print("Enter Pack Type: ");
        pack_type = keyboard.next();
        System.out.print("Enter Pack Size (in ml) : ");
        pack_size = keyboard.nextInt();
        System.out.print("Enter Product Price: ");
        product_price = keyboard.nextInt();
        keyboard.close();
    }
    public void discount()
    {
        product_price = (int) (0.9 * product_price);
    }
    public void display()
    {
        System.out.println("Product Code: " + product_code);
        System.out.println("Flavour: " + flavour);
        System.out.println("Pack Type: " + pack_type);
        System.out.println("Pack Size (in ml): " + pack_size);
        System.out.println("Product Price: " + product_price);
    }
}