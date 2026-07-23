/** A private cab service company provides service within the city at the following rates:
                        AC Car                 Non AC Car
   Upto 5 km            Rs.150/-               Rs.120/-
   Beyond 5 km          Rs.10/-per km          Rs.08/-per km

   Design a class CabService with the following description:
   Member variables/data members:
   String car_type          to store the type of car(AC or Non AC)
   double km                to store the kilometer travelled
   double bill              to calculate and store the bill amount
   Member methods:
   CabService()             Default constructor to initialize data members. String data members to " " and double data members to 0.0.
   void accept()            to accept car_type and km(using Scanner class only).
   void calculate()         to calculate the bill as per the rules given above.
   void display()           to display the bill as per the following format:
                            
                            CAR TYPE:
                            KILOMETER TRAVELLED:
                            TOTAL BILL:
  
   Create an object of the class in the main method and invoke the member methods.
 */
import java.util.Scanner;
import java.io.*;
public class CabService
{
    private String car_type;
    private double km;
    private double bill;
    public CabService()
    {
        car_type = " ";
        km = 0.0;
        bill = 0.0;
    }
    public void accept()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter car type: ");
        car_type = input.nextLine();
        System.out.print("Please enter kilometer travelled: ");
        km = input.nextDouble();
        input.close();
    }
    public void calculate()
    {
        switch(car_type.toUpperCase())
        {
            case "AC":
                if(km <= 5)
                bill = km * 150;
                else
                bill = 750 + ((km-5) * 10);
                break;
            case "NON AC" :
                if(km <=5)
                bill = km *120;
                else
                bill = 600 + ((km-5) * 8);
                break;
            default:
                System.out.println("Invalid car type. Exiting...");
                System.exit(0);
        }
    }
    public void display()
    {
        System.out.println("CAR TYPE: " + car_type.toUpperCase());
        System.out.println("KILOMETER TRAVELLED: " + km);
        System.out.println("TOTAL BILL: " + bill);
    }
    public static void main(String args[])
    {
        CabService objcab = new CabService();
        objcab.accept();
        objcab.calculate();
        objcab.display();
    }
}
