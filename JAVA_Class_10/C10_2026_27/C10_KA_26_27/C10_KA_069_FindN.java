/** If arrays M and M+N are as shown below, write a program in Java to find the array N.
 *                 ---                  ---                            ---                  ---
 *                 | -1     0       2     |                            | -6     9       4     |
 *          M =    | -3     -1      6     |     and         M+N =      | 4      5       0     |
 *                 |  4      3      -1    |                            | 1      -2      -3    |
 *                 ---                  ---                            ---                  ---
 */
/* FindN.java*/

public class FindN
{
    public static void main(String[] args)
    {
        int matrixM[][] = {{-1, 0, 2}, {-3, -1, 6},{4, 3, -1}};
        int matrixMN[][] = {{-6, 9, 4},{4, 5, 0}, {1, -2, -3}};
        int matrixN[][] = new int[3][3];
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                matrixN[i][j] = matrixMN [i][j] - matrixM[i][j];
            }
        }
        for (int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(matrixN[i][j] + " ");
            }
            System.out.println();
        }
    }
}