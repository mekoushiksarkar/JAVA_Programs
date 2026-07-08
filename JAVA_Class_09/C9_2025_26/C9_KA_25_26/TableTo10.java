/* TableTo10.java */

public class TableTo10
{
    public static void main(String args[]) {
        int max = 10;
        for (int i = 1; i <= max; i++)
        {
            for (int j = 1; j <= max; j++)
            {
                System.out.print((i*j) + "\t");
            }
            System.out.println();
        }
    }
}
