/* LetterOrDigit.java */
public class LetterOrDigit
{
    public static void main(String args[])
    {
        char ch1 = '9';
        char ch2 = 'Z';
        char ch3 = '%';
        char ch4 = ' ';
        if (Character.isDigit(ch1 ))
            System.out.println(ch1 + " is a digit");
        else 
            System.out.println(ch1 + " is not a digit");
        if (Character.isLetter(ch2))
            System.out.println(ch2 + " is a letter");
        else
            System.out.println(ch2 + " is not a letter");
        if (Character.isLetterOrDigit(ch3))
            System.out.println(ch3 + " is a letter or digit");
        else
            System.out.println(ch3 + " is not a letter or a digit");
        if (Character.isWhitespace(ch4))
            System.out.println(ch4 + " is a whitespace character");
        else
            System.out.println(ch4 + " is not a whitespace character");
    }
}