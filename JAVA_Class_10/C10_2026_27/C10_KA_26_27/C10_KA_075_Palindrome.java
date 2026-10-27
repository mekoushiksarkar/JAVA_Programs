/** Write a program that accepts a word and checks if it is Palindrome or just a special word.
 * Hint: A palindrome is a word which reads the same backwards as forward. For example, MADAM, MALAYALAM CIVIC, etc.
 * Special words are those which start and end with the same character. For example, COMIC , WINDOW, etc.
 */
/*PalindromeSpecial.java */
import java.util.*;
public class Palindrome
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int length;
        String reverseString = "";
        System.out.println("Enter a string:");
        String inputString = scan.nextLine();
        length = inputString.length();
        for ( int i = length-1; i >= 0; i--)
        {
            reverseString = reverseString + inputString.charAt(i);
        }
        if ( reverseString.equalsIgnoreCase(inputString))
        {
            System.out.println(inputString + " is a Palindrome word");
        }
        else if (inputString.charAt(0) ==  inputString.charAt(length-1))
        {
            System.out.println(inputString + " is a Special word");
        }
        else
        System.out.println(inputString + " is neither a Palindrome nor a Special word");
        scan.close();
    }
}