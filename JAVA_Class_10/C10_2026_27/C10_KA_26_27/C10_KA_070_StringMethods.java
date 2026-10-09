/* VariousStringMethods.java */

public class StringMethods
{
    public static void main(String args[])
    {
        String testString = "     DiPaShRi     ";
        System.out.println("Trimmmed string is: " +  testString.trim());
        System.out.println("Testing the toLowerCase() method: " + testString.toLowerCase());
        System.out.println("Testing the toUpperCase() method: " + testString.toUpperCase());
        System.out.println("Length of " + testString +  " is " + testString.length());
        System.out.println("The character at 8th position is " + testString.charAt(8));
        System.out.println("Index of a is " + testString.indexOf('a'));
        System.out.println("Last index of i is " + testString.lastIndexOf('i'));

        String string2 = " Biswas";
        System.out.println("Concatenated string is " + testString.concat(string2));

        if(testString.equals(string2))
            System.out.println("Both strings are equal");
        else
        System.out.println("Both strings are not equal");

        if(testString.equalsIgnoreCase(string2))
            System.out.println("Both strings are equal");
        else
            System.out.println("Both strings are not equal");

        System.out.println(testString.compareTo(string2));
        System.out.println(string2.compareTo(testString));
        System.out.println(testString.compareTo(testString));
        System.out.println(testString.compareToIgnoreCase(string2));
        System.out.println(testString.replace('i','u'));
        System.out.println(testString.substring(8));
        System.out.println(testString.substring(8,10));

        String string3 = "Dipa";
        System.out.println(testString.startsWith(string3));

        String string4 = "shri";
        System.out.println(testString.endsWith(string4));

        long mylong = 989541255;
        System.out.println(String.valueOf(mylong));

        boolean myboolean = true;
        System.out.println(String.valueOf(myboolean));
        
        char[] myCharArray = {'S', 'u', 'n', 'd', 'a', 'y'};
        System.out.println(String.valueOf(myCharArray));
        System.out.println(String.valueOf(myCharArray, 3, 3));
        String colour = "RED";
        System.out.println("colour.charAt(1) : " + colour.charAt(1));
    }
}