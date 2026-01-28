/* WAP to demonstrate while statement to find the factorial of a number 
 * e.g       facorial of 5 = 1*2*3*4*5 = 120
 */

import java.util.Scanner;

public class factorial_num
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER OF WHICH FACTORIAL SHOULD BE DONE");
        int n = sc.nextInt();
        int i;
        double fact;
        fact = 1;
        i = 1;
        while(i<=n)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("The factorial number is " + " " + fact);
    }
}