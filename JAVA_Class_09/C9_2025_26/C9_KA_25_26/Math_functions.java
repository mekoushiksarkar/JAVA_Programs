//WAP which is composite to show different Mathematical functions of Math class in java.

import java.util.Scanner;

public class Math_functions{
    public static void main(String[]args){
        //taking input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of 'x' =");
        double x= sc.nextDouble();
        System.out.println("Enter the value of 'y' =");
        double y= sc.nextDouble();
        System.out.println(" ");
        
        //rint
        System.out.println("Math.rint(x)=" + Math.rint(x));
        System.out.println("Math.rint(y)=" + Math.rint(y));
        System.out.println(" ");
        //absolute
        System.out.println("Math.abs(x)=" + Math.abs(x));
        System.out.println("Math.abs(y)=" + Math.abs(y));
        System.out.println(" ");
        //ceil value
        System.out.println("Math.ceil(x)=" + Math.ceil(x));
        System.out.println("Math.ceil(x)=" + Math.ceil(y));
        System.out.println(" ");
        //floor value
        System.out.println("Math.floor(x)=" + Math.floor(x));
        System.out.println("Math.floor(y)=" + Math.floor(y));
        System.out.println(" ");
        //round 
        System.out.println("Math.round(x)=" + Math.round(x));
        System.out.println("Math.round(y)=" + Math.round(y));
        System.out.println(" ");
        //sqrt
        System.out.println("Math.sqrt(x)=" + Math.sqrt(x));
        System.out.println("Math.sqrt(y)=" + Math.sqrt(y));
        System.out.println(" ");
        //cbrt
        System.out.println("Math.cbrt(x)=" + Math.cbrt(x));
        System.out.println("Math.cbrt(y)=" + Math.cbrt(y));
        System.out.println(" ");
        //minimum
        System.out.println("Math.min(x)=" + Math.min(x,y));
        System.out.println(" ");
        //maximum
        System.out.println("Math.min(y)=" + Math.max(x,y));
        System.out.println(" ");
                
        System.out.println("THESE ARE SOME OF THE MATHEMATCAL FUNCTION");
    }
}