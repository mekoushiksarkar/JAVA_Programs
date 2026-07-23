/** Illustrating the use of this keyword */
/* Area_this.java */
class Area_this
{
    int length, breadth;
    public Area_this(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    public void Display()
    {
        int area = length * breadth;
        System.out.println("Area is " + area);
    }
    public static void main(String args[])
    {
        Area_this area = new Area_this(2,3);
        area.Display();
    }
}