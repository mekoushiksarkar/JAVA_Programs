/* LowerOrUpper.java */
public class LowerOrUpper
{
    public static void main(String args[])
    {
        char ch1 = 'a';
        char ch2 = 'B';
        if (Character.isLowerCase(ch1)){
            System.out.println(ch1 + " is a lowercase letter");
            System.out.println("Letter after converting to upppercase: " + Character.toUpperCase(ch1));
        }
        else{
            System.out.println(ch1 + " is not a lowercase letter");
            System.out.println("Letter after converting to lowercase: " + Character.toLowerCase(ch1));
        }
        if (Character.isLowerCase(ch2)){
            System.out.println(ch2 + " is a lowercase letter");
            System.out.println("Letter after converting to upppercase: " + Character.toUpperCase(ch2));
        }
        else{
            System.out.println(ch2 + " is not a lowercase letter");
            System.out.println("Letter after converting to lowercase: " + Character.toLowerCase(ch2));
        }
    }
}