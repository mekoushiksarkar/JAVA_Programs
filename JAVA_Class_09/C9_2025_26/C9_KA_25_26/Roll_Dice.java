/* RollDiceDemo.java */

public class Roll_Dice
{
    public static void main(String args[]) {
        int min = 1, max = 6;
        int range = max - min + 1;
        int counter = 0;
        while (true) 
        {
            counter++;
            int num = (int) (range * Math.random() + min);
            if (num == 6)
            {
                System.out.println(num);
                break;
            }
            if (num == 1)
            {
                System.out.println("Skipped");
                continue;
            }
            System.out.println(num);
        }
        System.out.println("Total iterations: " + counter);
    }
}
