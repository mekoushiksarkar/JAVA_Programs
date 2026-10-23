// Program to demonstrate various string manipulation methods in Java

class Manipulation2
{
    public static void main(String[] args) 
    {
        StringBuffer k= new StringBuffer("SUBHAS CHANDRA BOSE");
        String a="understanding";
        String b="computer";
        String c="prime number";
        String d1="COMPUTER FEST";
        String d2="computer fest";
        System.out.println("The substring from 5th position="+a.substring(5));
        System.out.println("The substring from 5th index and excluding 10th index="+a.substring(5,10));
        System.out.println("The first position of the character m="+b.indexOf('m'));
        System.out.println("The position of 'm' from 5th character="+c.indexOf('m',5));
        System.out.println("The compare string="+d1.compareTo(d2));
        System.out.println("The comparing strings after ignoring cases="+d1.compareToIgnoreCase(d2));
        System.out.println("The comparison using equals ignore case="+d1.equalsIgnoreCase(d2));
        System.out.println("The reversed string="+k.reverse());
    }
}

// o/p

// The substring from 5th position=standing
// The substring from 5th index and excluding 10th index=stand
// The first position of the character m=2
// The position of 'm' from 5th character=8
// The compare string=-32
// The comparing strings after ignoring cases=0
// The comparison using equals ignore case=true
// The reversed string=ESOB ARDNAHC SAHBUS

// === Code Execution Successful ===