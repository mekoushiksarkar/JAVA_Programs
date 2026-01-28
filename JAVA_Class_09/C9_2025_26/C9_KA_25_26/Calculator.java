// WAP to implement a class calculator that models handheld calculator. It should have (atleast) the following functioniliy.  

import java.util.Scanner;

public class Calculator{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the the first number =");
        double a = sc.nextDouble();
        System.out.println("Enter the the second number =");
        double b = sc.nextDouble(); 
        System.out.println("Enter the operation sign (i.e.'+''-''*''/'");
        char o = sc.next().charAt(0);
        double result = 0.0;
        switch (o){
            case '+' : result = a+b ;
                       System.out.println("Addition of numbers is ="+result);
                       break;
            case '-' : result = a-b;
                       System.out.println("Subtraction of numbers is = "+result);
                       break;
            case '*' : result = a*b;
                       System.out.println("Multiplication of numbers is = "+result);
                       break;
            case '/' : result = a/b;
                       System.out.println("Division of numbers is = "+result);
                       break;
            case '%' : result = a%b;
                       System.out.println("Remainder of numbers is = "+result);
                       break;
            default  : System.out.println("Operator selected is wrong");
        }
    }
}