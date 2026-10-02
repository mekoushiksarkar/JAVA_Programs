/**Define a class to accept values in integer array of size 10. Find sum of one digit number and sum of two digit numbers entered.
 * Display them separately.
 * Example:
 * Input:   a[] = {2, 12, 4, 9, 18, 25, 3, 32, 20, 1}
 * Output:  Sum of one digit numbers: 2 + 4 + 9 + 3 + 1 = 19
 *          Sum of two digit numbers: 12 + 18 + 25 + 32 + 20 = 107
 */

import java.util.Scanner;
public class SumNumbers
{
    public static void main(String[]  args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int oneDigitSum = 0;
        int twoDigitSum = 0;
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++)
        {
            numbers[i]  = scanner.nextInt();
        }
        for(int i =0; i< numbers.length; i++)
        {
            if (numbers[i] >= 10 && numbers[i] <= 99)
            twoDigitSum+= numbers[i];
            else if(numbers[i] >= 1 && numbers[i] <= 9)
            oneDigitSum+= numbers[i];
        }
        System.out.println("Sum of one digit numbers:" + oneDigitSum);
        System.out.println("Sum of two digit numbers: " + twoDigitSum);
    }
}