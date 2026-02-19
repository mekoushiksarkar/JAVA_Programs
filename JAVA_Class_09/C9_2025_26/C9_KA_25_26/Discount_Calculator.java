/* DiscountCalculator.java */

import java.util.*;

public class Discount_Calculator {

  public static void main(String args[]) {
    double producePrice, unitsSold, totalAmount, discountRate, discountAmount, payAmount;
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the Product Price: ");
    producePrice = scnr.nextDouble();
    System.out.println("Enter Units Sold: ");
    unitsSold = scnr.nextDouble();
    totalAmount = producePrice * unitsSold;
    if (totalAmount >= 100000) 
        discountRate = 0.075;
    //7.5% discount
    else if ((totalAmount >= 50000) && (totalAmount < 100000)) 
        discountRate =
      0.05;
    //5% discount
    else if ((totalAmount >= 25000) && (totalAmount < 50000)) 
        discountRate =
      0.035;
    //3.5% discount
    else if ((totalAmount >= 10000) && (totalAmount < 25000)) 
        discountRate =
      0.02;
    //2% discount
    else 
        discountRate = 0.01; //1% discount
    discountAmount = totalAmount * discountRate;
    payAmount = totalAmount - discountAmount;
    System.out.println("***********************************************");
    System.out.println("Product Price  : " + producePrice);
    System.out.println("Units Sold     : " + unitsSold);
    System.out.println("Total Amount   : " + totalAmount);
    System.out.println("Discount Rate  : " + (discountRate * 100) + " %");
    System.out.println("Discount Amount: " + discountAmount);
    System.out.println("Amount Payable : " + payAmount);
    System.out.println("***********************************************");
    scnr.close();
  }
}
