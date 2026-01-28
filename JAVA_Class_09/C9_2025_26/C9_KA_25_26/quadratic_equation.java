/* WAP to solve a quadratic equation 
 * to find the value of y=ax^2 + bx -c; (if x>=4)
 *                      y=-ax^2 + bx -c; (if x<4)
 */ 
import java.util.Scanner;

public class quadratic_equation
    {
        public static void main(int a, int b, int c, int x)
        {
            int y;
            System.out.println("Value of x="+x);
            System.out.println("Value of a="+a);
            System.out.println("Value of b="+b);
            System.out.println("Value of c="+c);
            if (x>=4){
                System.out.println("Value of y="+(a*x*x+b*x+c));
            }
            else{
                System.out.println("Value of y="+(-a*x*x+b*x-c));
            }
        }
    }