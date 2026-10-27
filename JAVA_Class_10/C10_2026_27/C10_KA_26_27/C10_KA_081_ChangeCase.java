/** Write a program to accept a string and change the case of each letter of the string. Display the new string.
 * Sample Input: WelComE TO School
 * Sample Output: wELcOMe to sCHOOL
 */
/* ChangeCase.java */
import java.util.*;
public class ChangeCase
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int length;
        char tmpChar;
        String newString = "";
        System.out.println("Enter a string:");
        String string = scan.nextLine();
        length = string.length();
        for(int i = 0; i < length; i++)
        {
            tmpChar = string.charAt(i);
            if(tmpChar >= 'a' && tmpChar <= 'z')
            newString = newString + Character.toUpperCase(tmpChar);
            else if (tmpChar >= 'A' && tmpChar <= 'Z')
            newString = newString + Character.toLowerCase(tmpChar);
            else
            newString = newString + tmpChar;
        }
        System.out.println("New string after conversion is: ");
        System.out.println(newString);
        scan.close();
    }
}