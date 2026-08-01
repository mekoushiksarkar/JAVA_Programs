/** Accept an integer number from a java program and print the binary, octal, and hexadecimal equivalent of the number. */
/* ConvertInteger.java */
import java.util.Scanner;
public class ConvertInt
{
    public static void main(String args[])
    {
        System.out.print("Enter an integer: ");
        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();
        System.out.println("Binary equivalent: " + Integer.toBinaryString(num));
        System.out.println("Octal equivalent: " + Integer.toOctalString(num));
        System.out.println("Hexadecimal equivalent: " + Integer.toHexString(num));
        keyboard.close();
    }
}