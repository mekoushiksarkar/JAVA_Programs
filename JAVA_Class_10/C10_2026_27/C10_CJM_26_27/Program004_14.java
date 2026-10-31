// To convert the first letter of each word of the sentence to uppercase

import java.util.*;
public class Convert
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String str, str1 = "";
        int i, p;
        char chr, chr1;
        
        System.out.print("Enter a string: ");
        str = in.nextLine();
        
        str = " " + str;
        p = str.length();
        
        for(i = 0; i < p; i++)
        {
            chr = str.charAt(i);
            
            if(chr == ' ')
            {
                chr1 = str.charAt(i + 1);
                str1 = str1 + " " + Character.toUpperCase(chr1);
                i++;
            }
            else
                str1 = str1 + chr;
        }
        
        System.out.println("The new string after converting the first letter of the words:");
        System.out.println(str1.trim());
    }
}

// o/p

// Enter a string: i love my brother and sister
// The new string after converting the first letter of the words:
// I Love My Brother And Sister
