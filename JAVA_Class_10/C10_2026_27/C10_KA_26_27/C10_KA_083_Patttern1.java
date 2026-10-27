/** Write a program to input a word and display each character of the word on a separate line.
 * Sample Input: ICSE
 * Sample Output:
 * I
 * C
 * S
 * E
 */
/*Pattern1.java*/
import java.util.*;
public class Patttern1
{
    public static void main(String args[]) 
    {
    Scanner scan = new Scanner(System.in);
    int length;
    System.out.println("Enter a word: ");
    String word = scan.next();
    length = word.length();
    for(int i = 0; i  < length; i++)
    {
        System.out.println(word.charAt(i));
    }
    scan.close();
}
}