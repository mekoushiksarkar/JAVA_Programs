/** Write a program to accept a string and display:
 * i. The number of lowercase characters
 * ii. The number of uppercase characters
 * iii. The number of special characters
 * iv. The number of digits present in the string
 */
/* Count.java */
import java.util.*;
public class Counts
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int length, ucase = 0, lcase = 0, special = 0, digits = 0;
        char tmpchar;
        System.out.println("Enter a string:");
        String string = scan.nextLine();
        length = string.length();
        for(int i = 0; i < length; i++)
        {
            tmpchar = string.charAt(i);
            if (tmpchar >= 'a' && tmpchar <= 'z')
            lcase++;
            else if(tmpchar >= 'A' && tmpchar <= 'Z')
            ucase++;
            else if(tmpchar >= '0' && tmpchar <= '9')
            digits++;
            else
            special++;
        }
        System.out.println("The number of lowercase characters: " + lcase);
        System.out.println("The number of uppercase characters: " + ucase);
        System.out.println("The number of special characters : " +  special);
        System.out.println("The nubmer of digits : " + digits);
        scan.close();
    }
}