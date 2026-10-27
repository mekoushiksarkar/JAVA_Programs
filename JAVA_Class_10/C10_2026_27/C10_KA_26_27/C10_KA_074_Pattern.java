/** Write a menu-driven program to display the pattern as per user's choice
 * Pattern 1            Pattern 2
 * ABCDE                B
 * ABCD                 LL
 * ABC                  UUU
 * AB                   EEEE
 * For an incorrect option, an appropriate error message should be displayed
 */
/* Patter.java */
import java.util.Scanner;
public class Pattern
{
    public static void main(String args[])
    {
        int length;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter pattern number (1 or 2):");
        int choice = keyboard.nextInt();
        switch(choice)
        {
            case 1:
                length = "ABCDE".length();
                for (int i = length; i >= 1; i--)
                {
                    for(int j = 0; j < i; j++)
                    {
                        System.out.print((char)('A' + j));
                    }
                    System.out.println();
                }
            break;
            case 2:
                String stg = "BLUE";
                length = stg.length();
                for(int i = 0; i < length ; i++)
                {
                    char ch = stg.charAt(i);
                    for (int j = 1; i <= ( i + 1); j++)
                    {
                        System.out.print(ch);
                    }
                    System.out.println();
                }
            break;
            default:
                System.out.println("invalid option entered");
        }
        keyboard.close();
    }
}