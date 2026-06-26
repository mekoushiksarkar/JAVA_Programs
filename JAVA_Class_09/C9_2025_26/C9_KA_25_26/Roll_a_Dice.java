/* RollDice.java  Write a program to roll a dice */

public class Roll_a_Dice
{
    public static void main(String args[]) {
        int min = 1, max = 6;
        int range = max - min + 1;
        int num1 = (int) (range * Math.random() + min);
        int num2 = (int) (range * Math.random() + min);
        System.out.println("First throw  : " + num1);
        System.out.println("Second throw : " + num2);
    }
}
