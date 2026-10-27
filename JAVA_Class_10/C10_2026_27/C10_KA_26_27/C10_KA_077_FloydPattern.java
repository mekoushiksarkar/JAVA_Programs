/** Using the switch statement, write a menu driven program for the following:
 * i. To print the Floyd's triangle             ii. To display the following pattern
 * 1                                                I
 * 2 3                                              IC
 * 4 5 6                                            ICS
 * 7 8 9 10                                         ICSE
 * 11 12 13 14 15 
 * For an incorrect option, an appropriate error message should be displayed.
 */
/*FLoydPattern.java */
import java.util.Scanner;
public class FloydPattern
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("********************");
        System.out.println("1. Floyd's Triangle");
        System.out.println("2. ICSE Pattern");
        System.out.println();
        System.out.print("Enter your choice:");
        int choice = keyboard.nextInt();
        switch (choice)
        {
            case 1 :
                System.out.print("Enter number of rows of the Floyd's Triangle: ");
                int rows = keyboard.nextInt();
                int num = 1;
                for(int i  =1; i <= rows; i++)
                {
                    for(int j = 1; j <= i; j++)
                    {
                        System.out.print(num + " ");
                        num++;
                    }
                    System.out.println();//Move to the next row
                }
                break;
            case 2:
                System.out.print("Enter the word:");
                String word = keyboard.next();
                for(int i = 0; i < word.length(); i++)
                {
                    for(int  j = 0; j<= i; j++)
                    {
                        System.out.print(word.charAt(j) + " ");
                    }
                    System.out.println();//Move to the next row
                }
                break;
                default:
                    System.out.println("Invalid option entered.");
        }
        keyboard.close();
    }
}