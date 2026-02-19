/* FourSeasonsWithSwitchFallThrough.java */

import java.util.*;

public class Four_Seasons_FallThrough {

  public static void main(String args[]) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter month: ");
    int month = scnr.nextInt();
    switch (month) {
      case 4:
      case 5:
      case 6:
        System.out.println("It is Summer Season");
        break;
      case 7:
      case 8:
      case 9:
        System.out.println("It is Rainy Season");
        break;
      case 10:
      case 11:
      case 12:
      case 1:
        System.out.println("It is Winter Season");
        break;
      case 2:
      case 3:
        System.out.println("It is Spring Season");
        break;
      default:
        System.out.println("**** Invalid month entered ****");
    }
    scnr.close();
  }
}
