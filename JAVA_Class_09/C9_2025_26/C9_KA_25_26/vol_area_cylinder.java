/* WAP which calculates the volume and surface area of a cylinder 
 * Surface area = 2*3.14*r*(r+h)
 * Volume = 3.14*r*r*h
 */

import java.util.*;   
public class vol_area_cylinder
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE RADIUS OF THE CYLINDER : ");
        Double r = sc.nextDouble();
        System.out.println("ENTER THE HEIGHT OF THE CYLINDER : ");
        Double h = sc.nextDouble();
        Double area, volume;
        area =  2*3.14*r*(r+h);
        System.out.println("The surface area of the cylinder is" + " " + area);
        volume =  3.14*r*r*h;
        System.out.println("The volume of the cylinder is" + " " + volume);
    }   
}    