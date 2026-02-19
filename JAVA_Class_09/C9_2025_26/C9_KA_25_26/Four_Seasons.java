/* FourSeasons.java */

import java.util.*;

public class Four_Seasons {

  public static void main(String args[]) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the month number: ");
    int month = scnr.nextInt();
    if (month == 4 || month == 5 || month == 6) 
        System.out.println("It is Summer Season");
    else if (month == 7 || month == 8 || month == 9) 
        System.out.println("It is Rainy Season");
    else if (month == 10 || month == 11 || month == 12 || month == 1) 
        System.out.println("It is Winter Season");
    else if (month == 2 || month == 3) 
        System.out.println("It is Spring Season");
    else 
        System.out.println("*** Invalid Choice ***");
    scnr.close();
  }
}
