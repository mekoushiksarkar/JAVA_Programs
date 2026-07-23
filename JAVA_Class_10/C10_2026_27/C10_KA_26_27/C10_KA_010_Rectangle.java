/** Define a class with the following specifications:
        Class Name:             Rectangle
        Member Variables:       length, width
        Member Methods:         AcceptInput => To accept the length and width of the rectangle
                                Compute => To compute the area, perimeter and diagonal of the rectangle
                                DisplayData => To display the results
    Write a main() method in the class that creates an object of the Rectangle class and demonstrate its functionality.
 */
/* Rectangle.java */
import java.util.Scanner;
public class Rectangle
{
    int length, width;
    int area, perimeter;
    double diagonal;
    public void AcceptInput()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = keyboard.nextInt();
        System.out.print("Enter width: ");
        width = keyboard.nextInt();
        keyboard.close();
    }
    public void Compute()
    {
        area = length * width;
        perimeter = 2 * (length + width);
        diagonal = Math.sqrt(length * length + width * width);
    }
    public void DisplayData()
    {
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of rectangle is: " + perimeter);
        System.out.println("The perimeter of rectangle is: " + diagonal);
    }
    public static void main(String args[])
    {
        Rectangle myRectangle = new Rectangle();
        myRectangle.AcceptInput();
        myRectangle.Compute();
        myRectangle.DisplayData();
    }
}