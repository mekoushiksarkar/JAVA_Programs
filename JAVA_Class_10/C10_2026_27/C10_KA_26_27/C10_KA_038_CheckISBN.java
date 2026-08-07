/** The International Standard Book Number (ISBN) is a unique numeric book identifier which is printed on every book. The ISBN is 
    based upon a 10-digit code. The ISBN is legal if:
    1 x digit1 + 2 x digit2 + 3 x digit3 + 4 x digit4 + 5 x digit5 + 6 x digit6 + 7 x digit7 + 8 x digit8 + 9 x digit9 
    + 10 x digit10 is divisible by 11.
    Example: For an ISBN 1401601499
    Sum = 1x1 + 2x4 + 3x0 + 4x1 + 5x6 + 6x0 + 7x1 + 8x4 + 9x9 + 10x9 = 253 which is divisible by 11.
    Write a program to:
    i. input the ISBN code as a 10-digit integer.
    ii. If the ISBN is not a 10-digit integer, output the message "Illegal ISBN" and terminate the program.
    iii. If the number if 10-digit, extract the digits of the number and compute the sum as explained above.
    If the sum is divisible by 11, output the message, "Legal ISBN". If the sum is not divisible by 11, output the message,"Illegal ISBN".
 */
/* CheckISBN.java */
import java.util.Scanner;
public class CheckISBN
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ISBN code: ");
        String isbnNumber = scanner.nextLine().trim();
        // Check if the input is exactly 10 digits long
        if(isbnNumber.length() != 10)
        {
            System.out.println("Wrong Input");
            System.exit(0);
        }
        int sumOfDigits = 0;
        // Compute the sum according to the ISBN validation formula
        for(int i = 0; i < 10; i++)
        {
            int numericDigit = Character.getNumericValue(isbnNumber.charAt(i));
            sumOfDigits += (i + 1) * numericDigit;
        }
        // Check if the sum is divisible by 11
        if (sumOfDigits % 11 == 0)
        {
            System.out.println("Legal ISBN");
        }
        else
        {
            System.out.println("Illegal ISBN");
        }
        scanner.close();
    }
}