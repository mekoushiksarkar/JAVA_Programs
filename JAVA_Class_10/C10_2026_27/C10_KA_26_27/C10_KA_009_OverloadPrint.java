/** Define a class to overload the function print as follows:
    void print()            to print the following format
                            1   1   1   1   1
                            2   2   2   2   2
                            3   3   3   3   3
                            4   4   4   4   4
                            5   5   5   5   5
    void print(int n)       to check whether the number is a lead number. A lead number is the one whose sum of even digits are equal
                            to sum of odd digits.
                            e.g.3669        odd digits sum = 3+9 = 12
                                            even digits sum = 6+6 = 12
                            3669 is a lead number
 */
public class OverloadPrint
{
    public static void print()
    {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= 5; j++)
            {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
    }
    public static void print(int number)
    {
        int saveNumber = number;
        int oddDigitSum = 0;
        int evenDigitSum = 0;
        while (number != 0)
        {
            int digit = number % 10;
            if (digit % 2 ==0)
            {
                evenDigitSum += digit;
            }
            else
            {
                oddDigitSum += digit;
            }
            number /= 10;
        }
        if(oddDigitSum == evenDigitSum)
            System.out.println(saveNumber + " is a lead number");
        else
            System.out.println(saveNumber + " is not a lead number");
    }
    public static void main(String args[])
    {
        print();
        print(3669);
        print(1000);
    }
}