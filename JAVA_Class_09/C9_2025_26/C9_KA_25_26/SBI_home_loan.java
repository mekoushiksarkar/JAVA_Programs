/* SBI home finance revised is rate for public deposits as follows
 *   YEARS               Cumulative Interest             ANNUAL INCOME SCHEME
 *    1                          -                              10%
 *    2                          -                             10.5%
 *    3                         11.5%                           11%
 *    4                         11.5%                           11%
 *    5                         11.5%                           11%
 *    
 *    WAP tp find  i)amount due for sum principal invested under the cummulative option scheme
 *                ii)invest for each year under the annual scheme.
 */

import java.util.Scanner;

public class SBI_home_loan{
    public static void main(String[]args)
    {
        
        //input for the calculation
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time period");
        int year = sc.nextInt();
        System.out.println("Enter the rate of interest");
        double r = sc.nextDouble();
        System.out.println("Enter your Principal : ");
        double p = sc.nextDouble();
        
        //calculations
        double a = 0 , i = 0 ;
        for(year = 1; year <=5; year++)
        {
            if (year<=2){
                r=0;
            }
            else{
            r=0.115;
            a=p*(1+r);
            System.out.println("Amount after " + (year+1) + "year" + "=" + a);
            }
        }
        System.out.println("Annual Incime Scheme");
        for(year = 1; year <=5; year++)
        {
            if(year==1)
            {
                r=0.10;
            }
            else if (year==2)
            {
                r=0.105;
            }
            else{
                r=0.115;
                i=p*r;
            }
            System.out.println("Interest After" + (year+1) + "year" + "=" + i);
        }
    } 
}


