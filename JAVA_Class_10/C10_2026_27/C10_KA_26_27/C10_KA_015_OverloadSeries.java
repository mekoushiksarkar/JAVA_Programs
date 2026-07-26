/** Design a class to overload a function series() as follows:
    void series(int x, int n)           To display the sum of the series given below:
                                        x^1 + x^2 + x^3 + ..............x^n terms
    void series(int p)                  To display the following series:
                                        0, 7, 26, 63, .........p terms
    c.void series()                     To display the sum of the series given below:
                                        1/2 + 1/3 + 1/4 ...........1/10
 */
class OverloadSeries
{
    public static void series(int x, int n)
    {
        long sum = 0;
        for(int i = 1; i <= n; i++)
            sum += (long)Math.pow(x, i);
        System.out.println("Sum of the series is: " + sum);
    }
    public static void series(int p)
    {
        for(int i = 1; i <= p; i++)
        {
            int term = (int)Math.pow(i, 3) - 1;
            System.out.print(term + ", ");
        }
        System.out.println();
    }
    public static void series()
    {
        double sum = 0.0;
        for(int i = 2; i <= 10; i++)
            sum += 1.0 / i;
        System.out.println("Sum of the series is: " + sum);
    }
    public static void main(String args[])
    {
        series(1, 10);
        series(10);
        series();
    }
}