/* SumOfNumbers.java */

public class Sum_of_Numbers
{
    public static void main(String args[]) {
        int i = 1;
        int sum = 0;
        while (i <= 100)
        {
            sum+=i;
            i++;
        }
        System.out.println("The sum of numbers from 1 to 100 is " + sum);
    }
}
