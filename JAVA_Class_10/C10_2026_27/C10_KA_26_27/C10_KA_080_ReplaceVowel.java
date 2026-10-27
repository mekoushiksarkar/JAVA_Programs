/** Write a program to accept a word and convert into lowercase if it is in uppercase, and display the new word by replacing only
 * the vowels with the character following it.
 * Sample Input: computer
 * Sample Output: cpmpvtfr
 */
/* ReplaceVowels.java */
import java.util.*;
public class ReplaceVowel
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int length;
        String newWord = "";
        char tmpChar;
        System.out.println("Enter a word: ");
        String inputString = scan.nextLine();
        length = inputString.length();
        for(int i =0; i < length; i++)
        {
            tmpChar = inputString.charAt(i);
            if (Character.isUpperCase(tmpChar))
            tmpChar = Character.toLowerCase(tmpChar);
            if (tmpChar == 'a' || tmpChar == 'e' || tmpChar == 'i' || tmpChar == 'o' || tmpChar == 'u')
            tmpChar++;
            newWord = newWord + tmpChar;
        }
        System.out.println("Encoded word is: " + newWord);
        scan.close();
    }
}