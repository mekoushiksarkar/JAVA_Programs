/* A program to calculate the scholarship earned by Satvik who gets Rs. 750 per month for 5 years */

public class scholarship
{
   public static void main(String args[]) {
       int money_per_month = 750;
       int total_months = 12*5;
       int money_in_five_years = money_per_month * total_months;
       
       System.out.println("The scholarship earned by Satvik in 5 years is Rs. " + money_in_five_years);
   }
}
