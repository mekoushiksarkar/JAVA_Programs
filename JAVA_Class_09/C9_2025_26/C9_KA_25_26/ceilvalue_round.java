//WAP to input positive real number and its Math.ceil() value. Note that the function Math.ceil() should not be used.

import java.util.Scanner;

public class ceilvalue_round{
    public static void main(String[]args){
     System.out.println("Enter a positive real number: ");
     Scanner sc = new Scanner(System.in);
     double n = sc.nextDouble();
     n=Math.round(n);
     System.out.println("The ceil value is--> "+n);
    }
}