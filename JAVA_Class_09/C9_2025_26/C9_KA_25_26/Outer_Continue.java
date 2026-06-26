// Outer loop continue statement example

public class Outer_Continue
{
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++)
        {
            if (i==3)
            continue;
            for(int j = 1; j <= 5; j++)
            {
                System.out.print(i + "  ");
            }
            System.out.println();
            System.out.println("Inner loop complete");
        }
        System.out.println("Outer loop complete");
    }
}
