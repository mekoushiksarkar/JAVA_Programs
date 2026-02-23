/* IncomeTaxCalculator.java */

import java.util.*;

public class Income_Tax_Calculator {

  public static void main(String args[]) {
    String employeeName;
    double annualSalary, annualSavings, taxableIncome, incomeTax;
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter Employee's Name: ");
    employeeName = scnr.nextLine();
    System.out.println("Enter Annual Salary: ");
    annualSalary = scnr.nextDouble();
    System.out.println("Enter Annual Savings: ");
    annualSavings = scnr.nextDouble();
    taxableIncome = annualSalary - annualSavings;
    if (taxableIncome <= 200000) 
        incomeTax = 0;
    else if (taxableIncome <= 500000) 
        incomeTax = (taxableIncome - 200000) * 0.10;
    else if (taxableIncome <= 1000000) 
        incomeTax = (300000 * 0.10) + (taxableIncome - 500000) * 0.20;
    else incomeTax = (300000 * 0.10) + (500000 * 0.20) + (taxableIncome - 1000000) * 0.30;
    System.out.println("Employee's Name: " + employeeName);
    System.out.println("Annual Salary  : " + annualSalary);
    System.out.println("Annual Savings : " + annualSavings);
    System.out.println("Taxable Income : " + taxableIncome);
    System.out.println("Income Tax     : " + incomeTax);
    scnr.close();
  }
}
