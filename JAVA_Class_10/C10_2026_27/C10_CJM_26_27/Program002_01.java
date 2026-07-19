// Program to check whether the given character is an uppercase letter, lowercase letter, digit or special character.

import java.util.*;
class Char
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        char chr;
        System.out.println("Enter a character:");
        chr=sc.next().charAt(0);
        if(Character.isLetter(chr)==true)
        {
            if(Character.isUpperCase(chr)==true)
              System.out.println(chr+"is an uppercase letter");
            if(Character.isLowerCase(chr)==true)
              System.out.println(chr+"is a lowercase letter");
        }
        else
        {
            if(Character.isDigit(chr)==true)
              System.out.println(chr+"is a digit");
            else
              System.out.println(chr+"is a special character");
        }
    }
    
}

// o/p

// Enter a character:
// @
// @is a special character

// === Code Execution Successful ===