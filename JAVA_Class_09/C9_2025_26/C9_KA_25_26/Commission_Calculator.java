/* CommissionCalculator.java */

import java.util.*;

public class Commission_Calculator {

  public static void main(String args[]) {
    double totalSales, commissionRate, commissionAmount, amountPayable;
    int advanceAmount = 1500;
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter total sales this month: ");
    totalSales = scnr.nextDouble();
    if (totalSales < 10000) 
        commissionRate = 0.05;
    else if (totalSales < 15000) 
        commissionRate = 0.10;
    else if (totalSales < 20000) 
        commissionRate = 0.15;
    else if (totalSales < 25000) 
        commissionRate = 0.18;
    else 
        commissionRate = 0.20;
    commissionAmount = totalSales * commissionRate;
    amountPayable = commissionAmount - advanceAmount;
    System.out.println("Commission Rate : " + (commissionRate * 100) + " %");
    System.out.println("Amount Payable : " + amountPayable);
    scnr.close();
  }
}
