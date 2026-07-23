/** Design a class to overload a method Number() as follows:
    void Number(int num, int d)         To count and display the frequency of a digit in a number.
                                        Example:
                                        num = 2565685
                                        d = 5
                                        Frequency of digit 5 = 3
    void Number(int n1)                 To find and display the sum of even digits of a number
                                        Example:
                                        n1 = 29865
                                        Sum of even digits = 16
    Write a main method to create an object and invoke the above methods
 */
/* Overload.java */
public class Overload
{
    public void Number(int num, int d)
    {
        int count = 0;
        while(num > 0)
        {
            if (num % 10 == d)
                count++;
            num = num / 10;
        }
        System.out.println("Frequency of digit " + d + " = " + count);
    }
    public void Number(int n1)
    {
        int sum = 0;
        while ( n1 > 0)
        {
            if (n1 % 2 == 0)
                sum += n1 % 10;
            n1 = n1 / 10;
        }
        System.out.println("Sum of even digits = " + sum);
    }
    public static void main(String args[])
    {
        Overload obj = new Overload();
        obj.Number(2565685, 5);
        obj.Number(29865);
    }
}