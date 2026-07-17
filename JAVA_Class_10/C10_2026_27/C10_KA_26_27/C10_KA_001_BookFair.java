/** Define a class named BookFair with the following description:
    Instance variables/Data members:
    String Bname                stores the name of the book.
    double price                stores the price of the book.
    Member Methods:
    BookFair()                  default constructor to initialise data members.
    void Input()                to input and store the name and the price of the book.
    void calculate()            to calculate the price after discount. Discount is calculated based on the following criteria:
                                PRICE                                                       DISCOUNT
                                Less than or equal to Rs 1000                               2% of price
                                More than Rs 1000 and less than or equal to Rs 3000         10% of price
                                More than Rs 3000                                           15% of price
    void display()              to display the name and price of the book after discount.
    Write a main() method to create an object of the class and call the above member methods.
 */
/* BookFair.java */
import java.util.Scanner;
public class BookFair
{
    String Bname;
    double price;
    double priceDiscounted;
    public BookFair()
    {
        Bname = " ";
        price = 0;
    }
    public void input()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Book Name: ");
        Bname = keyboard.nextLine();
        System.out.print("Enter Book Price: ");
        price = keyboard.nextDouble();
        keyboard.close();
    }
    public void calculate()
    {
        double discountPercentage = 0;
        if (price <= 1000)
            discountPercentage = 2;
        else if (price > 1000 && price <= 3000)
            discountPercentage = 10;
        else if (price > 3000)
            discountPercentage = 15;
        priceDiscounted = price - (price * discountPercentage / 100);
    }
    public void display()
    {
        System.out.println("Book name: " + Bname);
        System.out.println("Price after discount : " + priceDiscounted);
    }
    public static void main(String args[])
    {
        BookFair objBookFair = new BookFair();
        objBookFair.input();
        objBookFair.calculate();
        objBookFair.display();
    }
}