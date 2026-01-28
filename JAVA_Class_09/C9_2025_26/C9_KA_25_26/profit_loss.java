/* Write a program to input the Selling Price and Cost Price of a commodity 
 * and find the Profit or Loss made upon selling the product.
*/

import java.util.Scanner;

public class profit_loss
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the selling price of the Commodity");
        double sp = sc.nextDouble();
        System.out.println("Enter the cost price of the Commodity");
        double cp = sc.nextDouble();
        
        if (sp>cp){
            System.out.println("Profit = " + (sp-cp));
        }
        else if (cp>sp){
            System.out.println("Loss = "+ (cp-sp));
        }
        else{
            System.out.println(".........Neither PROFIT nor LOSS");
        }
    }
}