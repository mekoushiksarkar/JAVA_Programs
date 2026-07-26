/** Demonstrating overloading methods by creating a class named maxOverload to find the maximum in three different cases using
    different parameters
 */
/* OverloadingMethods.java */
public class maxOverload
{
    //find the maximum of two int values
    public static int max(int num1, int num2)
    {
        if( num1 > num2)
            return num1;
        else
            return num2;
    }
    //find the maximum of two double values
    public static double max(double num1, double num2)
    {
        if( num1 > num2)
            return num1;
        else
            return num2;
    }
    //find the maximum of three double values
    public static double max(double num1, double num2, double num3)
    {
        return max(num1, max(num2, num3));
    }
    public static void main(String args[])
    {
        System.out.println("Invoking the max() method with int values 11 and 13");
        System.out.println("Maximum value is: " + max(11, 13));
        System.out.println("Invoking the max() method with double values 21.3 and 20.9");
        System.out.println("Maximum value is: " + max(21.3, 20.9));
        System.out.println("Invoking the max() method with three double values 33.3, 33.7 and 33.0");
        System.out.println("Maximum value is: " + max(33.3, 33.7, 33.0));
    }
}