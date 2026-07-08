/* TechNumber.java */

public class Tech_Number
{
    public static void main(String args[]) {
        for (int num = 1000; num <= 9999; num++)
        {
            int firstHalf = num / 100;
            int secondHalf = num % 100;
            int sumHalves = firstHalf + secondHalf;
            int squareSumHalves = sumHalves * sumHalves;
            if (num == squareSumHalves)
            System.out.println(num + " is a Tech Number");
        }
    }
}
