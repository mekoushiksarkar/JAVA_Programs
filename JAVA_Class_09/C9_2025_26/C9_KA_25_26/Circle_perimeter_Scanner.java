import java.util.Scanner;

public class Circle_perimeter_Scanner {

  public static void main(String args[]) {
    final double pi = 3.14;
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the radius of the circle");
    double radius = scnr.nextDouble();
    scnr.close();
    double perimeter = 2 * pi * radius;
    System.out.println("The perimeter of the circle with radius " + radius +" cm is " + perimeter +" cm.");
  }
}
