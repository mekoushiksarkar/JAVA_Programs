/** Write a program that encodes a word in PigLatin. To translate a word into PigLatin word, convert the word into uppercase
 * and then place the first vowel of the original word as a start of the new word along with the remainging alplabets. The 
 * alphabets present before the vowel being shifted towards the end followed by "AY".
 * Sample Input: London         Sample Output : ONDONLAY
 * Sample Input: Olympics       Sample Output: OLYMPICSAY
 */
/* PigLatinWord.java */
import java.util.*;
public class PigLatinWord
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int length;
        String pigLatinWord = "", preVowelWord = "", postVowelWord = "";
        char tmpChar;
        int posVowel = -1; 
        System.out.println("Enter a string: ");
        String inputString = scan.nextLine();
        inputString = inputString.toUpperCase();
        length = inputString.length();
        for( int i = 0; i < length; i++)
        {
            tmpChar = inputString.charAt(i);
            if (tmpChar == 'A' || tmpChar == 'E' || tmpChar == 'I' || tmpChar == 'O' || tmpChar == 'U')
            {
                posVowel = i;
                System.out.println("Postion: " + posVowel);
                break;
            }
        }
        if(posVowel >= 0)
        {
            preVowelWord = inputString.substring (0, posVowel);
            postVowelWord = inputString.substring(posVowel);
            pigLatinWord = postVowelWord + preVowelWord + "AY";
            System.out.println("Piglatin of " + inputString + " is " + pigLatinWord);
        }
        else
        {
            System.out.println("No vowels found");
        }
        scan.close();
    }
}