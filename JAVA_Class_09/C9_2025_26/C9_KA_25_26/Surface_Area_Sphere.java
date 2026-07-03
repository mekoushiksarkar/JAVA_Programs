/* A program to claculate the surface area of a sphere with a radius 7cm 
   (Hint: area = 4*pi*r*r, where pi = 3.14 and r is the radius of the sphere */

public class Surface_Area_Sphere
{
    public static void main(String args[]) {
        final double pi = 3.14;
        double radius = 7.0;
        double surface_area;
        surface_area = 4 * pi * radius * radius;
        
        System.out.println("The surface area of the sphere with radius " + radius + " cm is " + surface_area + " square cm.");
    }
}
