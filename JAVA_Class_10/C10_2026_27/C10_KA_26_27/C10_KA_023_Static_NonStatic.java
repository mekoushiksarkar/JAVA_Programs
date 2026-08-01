/** Demonstrating the differnce between static and non-static methods with the help of an example by creating a class named 
    Static_NonStatic. The program defines two methods: one static (FindCubeStatic) and the other non-static (FindCube).
 */
/* Static_NonStatic.java */
public class Static_NonStatic
{
    public static int FindCubeStatic (int y)
    {
        int result;
        result = y * y * y;
        return result;
    }
    public int FindCube(int x)
    {
        int result;
        result = x * x * x;
        return result;
    }
    public static void main(String args[])
    {
        int a, b;
        Static_NonStatic classObject = new Static_NonStatic();
        a = classObject.FindCube(4);
        System.out.println("Non-static method result: " + a);
        b = Static_NonStatic.FindCubeStatic(4);
        System.out.println("Static method result: " + b);
    }
}