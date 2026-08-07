/** Write a program to input a sentence and convert it into uppercase and count and display the total number of words starting with
    a letter 'A'.
    Example:
    Sample Input: ADVANCEMENT AND APPLICATION OF INFORMATION TECHNOLOGY ARE EVER CHANGING.
    Sample Output: Total number of words starting with letter 'A' = 4.
 */
/* WordCount.java */
import java.util.Scanner;
public class WordCount
{
    public static void main(String[] args)
    {
        int count = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = keyboard.nextLine();
        sentence = sentence.toUpperCase();
        System.out.println(sentence);
        for(int i = 0; i < sentence.length(); i++)
        {
            char ch = sentence.charAt(i);
            if (i==0)
            {
                if (ch == 'A')
                {
                    count++;
                }
                
            }
            else
            {
                if (sentence.charAt(i-1) == ' ' & ch == 'A')
                {
                    count++;
                }
            
            }
        }
        System.out.println("Total number of words starting with letter 'A' = " + count);
        keyboard.close();
        }
    }
