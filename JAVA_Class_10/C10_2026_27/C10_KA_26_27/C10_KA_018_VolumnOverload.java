/**  Design a class to overload a method volumn() as follows:
     double volumn(double r)                        with radius 'r' as an argument, returns the volumn of sphere using formula:
                                                    v = 4/3 * 22/7 * r^3
    double volumn(double h, double r)               with height 'h' and radius 'r' as the argument, returns the volumn of a cylinder
                                                    using the formula:
                                                    v = 22/7 * r^2 * h
    double volumn(double l, double b, double h)     with length 'l', breadth 'b' and height 'h' as the arguments, returns the volumn of
                                                    cuboid using the formula:
                                                    v = l * b * h
 */
public class VolumnOverload
{
    double volumn(double r)
    {
        double vol = 4.0 / 3 * 22 / 7.0 * Math.pow(r,3);
        return vol;
    }
    double volumn(double h, double r)
    {
        double v = 22.0 / 7 * Math.pow(r, 2) * h;
        return v;
    }
    double volumn(double l, double b, double h)
    {
        double v = l * b * h;
        return v;
    }
    public static void main(String args[])
    {
        VolumnOverload obj = new VolumnOverload();
        double r = 77;
        System.out.println("The volumn of the sphere of radius " + r + " units is: " + obj.volumn(r) + " cube units");
        double h = 34, ra = 66;
        System.out.println("The volumn of the cylinder with height " + h + " units and radius " + r + " units is: "
                            + obj.volumn(h, ra) + " cube units");
        double l = 55, b = 12, ht = 99;
        System.out.println("The volumn of the cuboid with length " + l + " units, breadth " + b + " units and height " + h + " units is: "
                            + obj.volumn(l, b, ht) + " cube units");
    }
}