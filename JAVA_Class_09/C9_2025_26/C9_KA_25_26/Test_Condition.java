/* TestCondition.java */

public class Test_Condition
{
    public static void main(String args[]) {
        boolean finished = false;
        for (int i = 1; !finished; i++)
        {
            System.out.println(i);
            if (i % 5 == 0)
            {
                finished = true;
                System.out.println("Exiting....");
            }
        }
    }
}
