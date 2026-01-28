/*Develop java program to solve the quadratic equation 
 *   ax^2 + bx + c = 0 (a>0)
 *   
 *the two values of x cn be givn by x = (-b +/- √b^2 - 4ac)/2a
 *
 * if b^2 - 4ac > 0  roots are real and unequal
 * if b^2 - 4ac = 0  roots are equal and real
 * if b^2 - 4ac < 0  roots are imaginary and unequal
 */  
  
import java.util.Scanner;

public class rootEquation
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println ("ENTER THE VALUE OF 'a'=");
        double a = sc.nextDouble();
        System.out.println ("ENTER THE VALUE OF 'b'=");
        double b = sc.nextDouble();
        System.out.println ("ENTER THE VALUE OF 'c'=");
        double c = sc.nextDouble();
        double r1  =0  ,  r2 = 0;              
        //r1 for '+' condition result and r2 for the '-' condition result
        
        if ((b*b-4*a*c)>0)                          //first condition calculation
        {
            r1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
            r2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
            System.out.println("First root is --> " + " " + r1);
            System.out.println("Second root is --> " + " " + r2);
        }
        else if((b*b-4*a*c)==0)                     //second condition calculation
        {
            r1 = -b / (2*a);
            r2 = -b / (2*a);
            System.out.println("First root is --> " + " " + r1);
            System.out.println("Second root is --> " + " " + r2);
        }
        else if ((b*b-4*a*c)<0)                     //third condition calculation                                                                
        {
            r1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
            r2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
            System.out.println("Roots are imaginary");           
        }
        
        //solving the quadratic equation given in the question i.e.ax^2 + bx + c = 0 (a>0)
        double x=r1;
        double result = a*x*x + b*x + c ;
        if (result == 0){
        System.out.println("a*x*x + b*x + c = 0 , which is correctly proved");
        }
        else{
        System.out.println("a*x*x + b*x + c =" + " " + result + " " + "which is incorrect so retry changing the values");
        }
    }
}