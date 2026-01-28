/*WAP of calculate the comission of a salesman of books as per following data
 *     Sales                        Comission
 *   >=100000                          25%
 *  80000=99999                       22.5%
 *  60000=79999                        20%
 *  40000=59999                        15%
 *    <40000                          12.5%
 */

import java.util.Scanner;

public class sales_commision
{
    public static void main(String[]ars)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SALES OF YOUR CHOICE :");
        double a = sc.nextDouble();
        double comm=0;
        if(a>=100000)
        {
            comm = a*0.25;
            System.out.println("The comission will be of 25%, i.e." + " " + comm);
        }
        else if(a<80000)
        {
           comm = a*0.225;
           System.out.println("The comission will be of 22.5%, i.e." + " " + comm); 
        }
        else if(a<60000)
        {
           comm = a*0.20;
           System.out.println("The comission will be of 20%, i.e." + " " + comm); 
        }
        else if(a<40000)
        {
           comm = a*0.15;
           System.out.println("The comission will be of 15%, i.e." + " " + comm); 
        }
        else
        {
           comm = a*0.125;
           System.out.println("The comission will be of 12.5%, i.e." + " " + comm); 
        }
    }
}