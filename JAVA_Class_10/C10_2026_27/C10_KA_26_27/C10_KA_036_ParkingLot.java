/** Define a class ParkingLot with the following description:
    Instance variables/ Date members:
    int vno             : to store the vehicle number
    int hours           : to store the number of hours the vehicle is parked in the parking lot
    double bill         : to store the bill amount
    Member Methods:
    void input()        : to input and store vno and hours\
    void calculate()    : to compute the parking charge at the rate of Rs.3 for the first hour or part thereof, and Rs. 1.50 for
                          each additional hour or part thereof.
    void display()      : to display the detail
    Write a main() method to create an object of the class and call the above methods.
 */
/* ParkingLot.java */
import java.util.Scanner;
public class ParkingLot
{
    int vno;
    int hours;
    double bill;
    public void input()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Vehicle Number: ");
        vno = keyboard.nextInt();
        System.out.print("Enter Number of hours: ");
        hours = keyboard.nextInt();
        keyboard.close();
    }
    public void calculate()
    {
        bill = 3 + ( hours - 1) * 1.50;
    }
    public void display()
    {
        System.out.println("Vehicle Number: " + vno);
        System.out.println("Hours Parked : " + hours);
        System.out.println("Bill Amount : " + bill);
    }
    public static void main(String args[])
    {
        ParkingLot objParkingLot = new ParkingLot();
        objParkingLot.input();
        objParkingLot.calculate();
        objParkingLot.display();
    }
}