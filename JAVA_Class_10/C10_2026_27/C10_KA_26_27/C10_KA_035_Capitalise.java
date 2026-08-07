/** Write a program in Java to accept a string in lowercase and change the first letter of every word to uppercase.
    Display the new string.
    Sample INPUT: we are in cyber world
    Sample OUTPUT: We Are In Cyber World
 */
/* capitalise.java */
import java.util.Scanner;
public class Capitalise
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String output = "";
        for (int i = 0; i < input.length(); i++)
        {
            char currentChar =  input.charAt(i);
            if(i == 0 || input.charAt(i-1) == ' ')
                output += Character.toUpperCase(currentChar);
            else
                output += currentChar;
        }
        System.out.println("New string is: " + output);
        scanner.close();
    }
}