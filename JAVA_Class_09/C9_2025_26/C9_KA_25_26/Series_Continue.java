/* SeriesWithContinue.java */

public class Series_Continue
{
    public static void main(String args[]) {
        for (int i = 1; i <= 19; i++)
        {
            if (i % 5 == 0)
            continue;
            System.out.print(i + "  ");
        }
    }
}
