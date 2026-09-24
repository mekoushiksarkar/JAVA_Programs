/* ArrayIni2D.java */

public class ArrayIni2D
{
    public static void main(String[] args)
    {
        int array2D[][] = {{1, 2, 3, 4},
                            {1, 3, 5, 7},
                            {2, 4, 6, 8}};
        for (int i = 0; i<3; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}