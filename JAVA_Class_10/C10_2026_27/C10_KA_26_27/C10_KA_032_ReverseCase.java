/** Define a class to accept a string, and print the characters with the uppercase and lowercase reversed, but all the other characters 
    should remain the same as before.
    EXAMPLE:
    INPUT: WelCoMe_2022
    OUTPUT : wELcOmE_2022
 */
import java.util.Scanner;
public class ReverseCase
{
    public static String reverseCase(String str)
    {
        String result ="";
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch))
            {
                result += Character.toLowerCase(ch);
            }
            else if(Character.isLowerCase(ch))
            {
                result += Character.toUpperCase(ch);
            }
            else
            {
                result += ch;
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = keyboard.nextLine();
        String output = reverseCase(input);
        System.out.println(output);
    }
}