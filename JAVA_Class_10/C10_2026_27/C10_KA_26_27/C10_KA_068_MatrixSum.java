/** Write a program in Java that computes the sum of two 3 x 3 matrices and displays their sum.
 *  Hint: For two 3 x 3 matrices, their sum is computed as:
 *          --                  ---         ---                  ---        ---                                         ---
 *         | a11    a12     a13    |       | b11    b12     b13     |      | a11 + b11      a12 + b12       a13 + b13      |
 *         | a21    a22     a23    |   +   | b21    b22     b23     |   =  | a21 + b21      a22 + b22       a23 + b23      |
 *         | a31    a32     a33    |       | b31    b32     b33     |      | a31 + b31      a32 + b32       a33 + b33      |
 *          --                  ---         ---                  ---        ---                                         ---
 */
/* MatrixSum.java */

public class MatrixSum
{
    public static void main(String args[])
    {
        int matrixA[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int matrixB[][] = {{11, 12, 13}, {14, 15, 16}, {17, 18, 19}};
        int matrixC[][] = new int[3][3];
        for (int i =0; i < 3; i++)
        {
            for (int j =0 ; j < 3; j++)
            {
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        for(int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.println();
        }
    }
}
