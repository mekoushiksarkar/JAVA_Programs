/** Define a class called Library with the following description:
    Instance variables/Data members:
    int acc_num:            to store the accession number of the book
    String title:           to store the title of the book
    String author:          to store the name of the author
    Member Methods:
    void input():           to input and store accession number, title and author.
    void computer():        to accept the number of days late, calculate and display the fine charges at the rate of Rs.2 per day
    void display():         to display the details in the following format:
                                Accession Number            Title           Author
    Write a main() method to create an object of the class and call the above member methods.
 */
/* Library.java */
import java.util.Scanner;
public class Library
{
    int acc_num;
    String title, author;
    public void input()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Accession Number: ");
        acc_num = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Enter Title: ");
        title = keyboard.nextLine();
        System.out.println("Enter Author's Name: ");
        author = keyboard.nextLine();
        keyboard.close();
    }
    public void compute()
    {
        int numDays, fineAmount;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number of days late: ");
        numDays = keyboard.nextInt();
        fineAmount = 2 * numDays;
        System.out.println("Fine to be paid is: " + fineAmount);
        keyboard.close();
    }
    public void display()
    {
        System.out.println("Accession Number\tTitle\tAuthor");
        System.out.println(acc_num + "\t" + title + "\t" + author);
    }
    public static void main(String args[])
    {
        Library objLibrary = new Library();
        objLibrary.input();
        objLibrary.compute();
        objLibrary.display();
    }
}