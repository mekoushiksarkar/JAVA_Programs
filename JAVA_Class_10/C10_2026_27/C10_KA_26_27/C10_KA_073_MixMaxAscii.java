/** Define a class to declare a character array of size ten. Accept the characters into the array and display the characters with 
 * the highest and lowest ASCII (American Standard Code for Information Interchange) value.
 * EXAMPLE:
 * INPUT:
 *      'R', 'z','q', 'A', 'N', 'p', 'm', 'U', 'Q', 'F'
 * OUTPUT:
 *      Character with highest ASCII value = z
 *      Character with lowest ASCII value = A
 */
import java.util.Scanner;
public class MixMaxAscii
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        char[] characters = new char[10];
        System.out.println("Enter 10 characters:");
        for(int i = 0; i < 10; i++)
        {
            characters[i] = scanner.next().charAt(0);
        }
        char maxChar = characters[0];
        char minChar = characters[0];
        for (int i = 1; i < characters.length; i++)
        {
            if(characters[i] > maxChar)
            {
                maxChar = characters[i];
            }
            if (characters[i] < minChar)
            {
                minChar = characters[i];
            }
        }
        System.out.println("Character with the highest ASCII value: " + maxChar);
        System.out.println("Character with the lowest ASCII value: " + minChar);
        scanner.close();
    }
}