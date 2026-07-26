/** Define a class Salary as described below:
        Data Members:       Name,Address, Phone, Subject, Specialisation, Monthly Salary, Income Tax
        Member Methods:     i. To accept the details of a teacher including the monthly salary
                            ii. To display the details of the teacher
                            iii. To compute the annual income tax at 5% of the annual salary above Rs. 1,75,000
    Write a main() method to create an object of the class and call the above member methods.
 */
/* Salary.java */
import java.util.Scanner;
public class Salary
{
    String name, address, subject, specialisation;
    long phone;
    double monthlySalary, incomeTax;
    public void AcceptInput()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = keyboard.nextLine();
        System.out.print("Enter Address: ");
        address = keyboard.nextLine();
        System.out.print("Enter Phone: ");
        phone = keyboard.nextLong();
        System.out.print("Enter Subject: ");
        subject = keyboard.next();
        System.out.print("Enter specialisation: ");
        specialisation = keyboard.next();
        System.out.print("Enter Monthly Salary: ");
        monthlySalary = keyboard.nextDouble();
        keyboard.close();
    }
    public void Compute()
    {
        double annualSalary = 12 * monthlySalary;
        if(annualSalary > 175000)
            incomeTax = annualSalary * 0.05;
        else
            incomeTax = 0;
    }
    public void DisplayData()
    {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Subject: " + subject);
        System.out.println("Specialistaion: " + specialisation);
        System.out.println("Monthly Salary: Rs. " + monthlySalary);
        System.out.println("income tax: " + incomeTax);
    }
    public static void main(String args[]) 
    {
        Salary objSalary = new Salary();
        objSalary.AcceptInput();
        objSalary.Compute();
        objSalary.DisplayData();
    }
}