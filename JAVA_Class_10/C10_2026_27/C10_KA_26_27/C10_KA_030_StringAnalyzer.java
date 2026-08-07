/** Define a class to accept a String and print the number of digits, alphabets and special characters in the string.
    Example: S = "ROHITSHARMA@45"
    Output: Number of digit - 2
    Number of Alphabets - 11
    Number of Special characters - 1
 */
public class StringAnalyzer
{
    public static void analyzeString(String str)
    {
        int digitCount = 0;
        int alphabetCount = 0;
        int specialCharCount = 0;
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(Character.isDigit(ch))
            {
                    digitCount++;
            }
            else if(Character.isLetter(ch))
            {
                alphabetCount++;
            }
            else
            {
                specialCharCount++;
            }
        }
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Number of Alphabets: " + alphabetCount);
        System.out.println("Number of Special characters: " + specialCharCount);
    }
    public static void main(String[] args)
    {
        String S = "ROHITSHARMA@45";
        analyzeString(S);
    }
}