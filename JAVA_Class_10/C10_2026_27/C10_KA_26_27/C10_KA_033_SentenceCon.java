/** Write a program to input a sentence and convert it into uppercase and display each word in a separate line.
    Example: Input: India is my country
    Output: INDIA
            IS
            MY
            COUNTRY
 */
import java.util.Scanner;
public class SentenceCon
{
    public static void convertAndDisplay(String sentence)
    {
        String word = "";
        for(int i = 0; i < sentence.length(); i++)
        {
            char ch = sentence.charAt(i);
            if(ch != ' ')
            {
                word += Character.toUpperCase(ch);
            }
            else
            {
                System.out.println(word);
                word = "";
            }
        }
        //Print the last word
        System.out.println(word);
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = scanner.nextLine();
        convertAndDisplay(input);
        scanner.close();
    }
}