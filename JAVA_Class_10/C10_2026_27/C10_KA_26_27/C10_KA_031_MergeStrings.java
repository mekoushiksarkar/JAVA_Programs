/** Define a class to accept two strings of same length and form a new word in such a way thay, the first character of the first
    word is followed by the first character of the second word and so on.
    Example:
    Input string 1 - BALL
    Input string 2 - WORD
    OUTPUT: BWAOLRLD
 */
import java.util.Scanner;
public class MergeStrings
{
    public static String mergeWords(String str1, String str2)
    {
        String merged = "";
        for (int i = 0; i < str1.length(); i++)
        {
            merged += str1.charAt(i);
            merged += str2.charAt(i);
        }
        return merged;
    }
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter String1:  ");
        String input1 = keyboard.nextLine();
        System.out.print("Enter String2: ");
        String input2 = keyboard.nextLine();
        String output = mergeWords(input1, input2);
        System.out.println(output);
    }
}