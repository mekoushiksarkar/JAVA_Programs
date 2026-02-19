/* DaysInMonth.java */

import java.util.*;

public class Days_in_Month {

  public static void main(String args[]) {
    int numberOfDays = 0;
    boolean leapYear = false;
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter month: ");
    int month = scnr.nextInt();
    System.out.println("Enter year (yyyy): ");
    int year = scnr.nextInt();
    if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) 
        leapYear = true;
    else 
        leapYear = false;
    switch (month) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        numberOfDays = 31;
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        numberOfDays = 30;
        break;
      case 2:
        if (leapYear) numberOfDays = 29;
        else numberOfDays = 28;
        break;
      default:
        System.out.println("Invalid month " + month);
        System.exit(0);
    }
    System.out.println("Number of days is " + numberOfDays);
    scnr.close();
  }
}
