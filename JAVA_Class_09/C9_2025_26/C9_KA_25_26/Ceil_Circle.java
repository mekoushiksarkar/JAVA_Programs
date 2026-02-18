/* CeilCircle.java */

import java.util.*;

public class Ceil_Circle {

  public static void main(String args[]) {
    double diameter, circumference, area;
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the radius; ");
    double radius = scnr.nextDouble();
    diameter = 2 * radius;
    circumference = 2 * Math.PI * radius;
    area = Math.PI * radius * radius;
    System.out.println("Diameter is : " + Math.ceil(diameter));
    System.out.println("Circumference is : " + Math.ceil(circumference));
    System.out.println("Area is : " + Math.ceil(area));
    scnr.close();
  }
}
