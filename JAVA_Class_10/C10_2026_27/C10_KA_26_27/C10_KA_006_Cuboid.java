/** Concept of costructor overloading by creating a class Cuboid to compute the volumn of a cuboid. */
/* Cuboid.java */
public class Cuboid
{
    int length;
    int width;
    int height;
    public Cuboid()     //constructor without any parameter
    {
        System.out.println("Invoking constructor with no parameters");
        length = 20;
        width = 15;
        height = 10;
    }
    public Cuboid(int len)     //constructor with one parameter
    {
        System.out.println("Invoking constructor with one parameter");
        length = len;
        width = 15;
        height = 10;
    }
    public Cuboid(int len, int wd)    //Constructor with two parameters
    {
        System.out.println("Invoking constructor with two parameters");
        length = len;
        width = wd;
        height = 10;
    }
    public Cuboid(int len, int wd, int ht)      //Constructor with three parameters
    {
        System.out.println("Invoking constructor with three paramters");
        length = len;
        width = wd;
        height = ht;
    }
    void Volumn()
    {
        int volumn;
        volumn = length * width * height;
        System.out.println("Dimensions of the cuboid are: ");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Volumn of the cuboid is:   " +volumn);
        System.out.println();
    }
    public static void main(String args[])
    {
    Cuboid cuboid1 = new Cuboid();
    cuboid1.Volumn();
    Cuboid cuboid2 = new Cuboid(50);
    cuboid2.Volumn();
    Cuboid cuboid3 = new Cuboid(102,40);
    cuboid3.Volumn();
    Cuboid cuboid4 = new Cuboid(46, 30, 14);
    cuboid4.Volumn();
    }
}