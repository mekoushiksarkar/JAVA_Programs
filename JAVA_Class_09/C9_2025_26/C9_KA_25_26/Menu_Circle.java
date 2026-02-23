/* MenuCircle.java */

import java.util.*;

public class Menu_Circle {

  public static void main(String args[]) {
    Scanner scnr = new Scanner(System.in);
    // display menu
    System.out.println("         Cicle Menu");
    System.out.println("         ==========");
    System.out.println("        1. Calculate Diameter");
    System.out.println("        2. Calculate Circumference");
    System.out.println("        3. Calculate Area");
    System.out.println();
    System.out.println("     Enter your choice:  ");
    int choice = scnr.nextInt();
    double radius;
    switch (choice) {
      case 1:
        System.out.println("Please enter radius:");
        radius = scnr.nextDouble();
        System.out.println("Diameter is: " + (2 * radius));
        break;
      case 2:
        System.out.println("Please enter radius:");
        radius = scnr.nextDouble();
        System.out.println("Circumference is: " + (2 * Math.PI * radius));
        break;
      case 3:
        System.out.println("Please enter radius: ");
        radius = scnr.nextDouble();
        System.out.println("Area is: " + (Math.PI * radius * radius));
        break;
      default:
        System.out.println("**** Invalid option entered ****");
    }
    scnr.close();
  }
}
