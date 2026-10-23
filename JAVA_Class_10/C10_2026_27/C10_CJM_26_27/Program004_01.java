// Program to demonstrate various string manipulation methods in Java

class Manipulation
{
    public static void main(String[] args) 
    {
        String a="akash";
        String b="conputer";
        String c="    easy understanding    ";
        String d1="Information Technology";
        String d2="Information Technology";
        String e="kumar";
        System.out.println("The uppercase of akash="+a.toUpperCase());
        System.out.println("After replacing 'n' by 'm'="+b.replace('n','m'));
        System.out.println("The string after removing blank spaces="+c.trim());
        System.out.println("The equal string="+d1.equals(d2));
        System.out.println("The length of the string kumar="+e.length());
        System.out.println("The character at 5th position="+b.charAt(5));
        System.out.println("The concat of the strings="+a.concat(e));
    }
}

// o/p

// The uppercase of akash=AKASH
// After replacing 'n' by 'm'=computer
// The string after removing blank spaces=easy understanding
// The equal string=true
// The length of the string kumar=5
// The character at 5th position=t
// The concat of the strings=akashkumar

// === Code Execution Successful ===