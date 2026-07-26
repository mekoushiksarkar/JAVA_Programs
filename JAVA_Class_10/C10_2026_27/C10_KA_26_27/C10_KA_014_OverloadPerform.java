/** Define a class to overload the method perform as follows:
    double perform(double r, double h)              to calculate and return the value of Curved surface area of cone
                                                    CSA = pi*r*l        l = Math.sqrt(r^2 + h^2)
    void perform(int r, int c)                      Use NESTED FOR LOOP to generate the following format:
                                                    r = 4, c = 5 output - 1   2   3   4   5
                                                                          1   2   3   4   5
                                                                          1   2   3   4   5
                                                                          1   2   3   4   5
    void perform(int m, int n, char c)              to print the quotient of the division of m and n if ch is Q, else print the
                                                    remainder of the division of m and n if ch is R.
 */
public class OverloadPerform
{
    public double perform(double r, double h)
    {
        double l = Math.sqrt(Math.pow(r, 2) + Math.pow(h,2));
        double CSA = Math.PI * r * l;
        return CSA;
    }
    public void perform(int r, int c)
    {
        for (int i = 1; i <= r; i++)
        {
            for (int j = 1; j <= c; j++)
            {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }
    public void perform(int m, int n, char c)
    {
        if (c == 'Q')
        {
            System.out.println("Quotient of " + m + " / " + n + " = " + (m / n));
        }
        else if (c == 'R')
        {
            System.out.println("Remainder of " + m + " / " + n + " = " + (m % n));
        }
        else
        {
            System.out.println("Invalid character provided.Please provide 'Q' for quotient or 'R' for remainder.");
        }
    }
    public static void main(String args[])
    {
        OverloadPerform obj = new OverloadPerform();
        double r = 3.0;
        double h = 4.0;
        System.out.println("Curved Surface Area of cone: " + obj.perform(r, h));
        int rows = 4;
        int cols = 5;
        System.out.println("Nested Loop Output: ");
        obj.perform(rows, cols);
        int m = 10;
        int n = 3;
        char ch = 'Q';
        obj.perform(m, n, ch);
        ch = 'R';
        obj.perform(m, n, ch);
    }
}