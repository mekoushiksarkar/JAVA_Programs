// WAP to find the values of sin and cosine of a given angle

import java.util.Scanner;

public class sine_cosine{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the angle =");
        double x= sc.nextDouble();
        double a = x*22/1260;
        System.out.println("Sine value of the angle = " + Math.sin(x));
        System.out.println("Cosine value of the angle = " + Math.cos(x));
    }
}