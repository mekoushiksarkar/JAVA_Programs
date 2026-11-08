// Using method

import java.util.*;
public class Vowels
{
    void display(String st)
    {
        System.out.println("The vowels are:");
        for (int i = 0; i < st.length(); i++)
        {
            char ch = st.charAt(i);
            if ("AEIOUaeiou".indexOf(ch) >= 0)
                System.out.println(ch);
        }
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = in.next();

        Vowels ob = new Vowels();
        ob.display(str);
    }
}

// o/p
// Enter a word: GUTU
// The vowels are:
// U
// U
