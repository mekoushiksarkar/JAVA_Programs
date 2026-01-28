//Use o Scanner class for diffferent inputs

import java.util.Scanner;
import java.io.*;

public class Scanner2{
    public static void main(String[]args){
     int integer;
     long longInteger;
     float realnumber;
     String string1;
     String string2;
     Scanner in = new Scanner(System.in);
     System.out.println("Enter an integer--> ");
     integer = in.nextInt();
     System.out.println("Enter a long integer--> ");
     Scanner s1 = new Scanner(System.in);
     longInteger = s1.nextLong();
     System.out.println("Enter a Float integer--> ");
     System.out.println("Enter a long integer--> ");
     Scanner s2 = new Scanner(System.in);
     string1 = s2.nextLine();
     System.out.println("Enter a String--> ");
     Scanner s3 = new Scanner(System.in);
     string2 = s3.next();
     System.out.println("Enter a String--> ");
    }
}