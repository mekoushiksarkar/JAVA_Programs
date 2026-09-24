/* UsingMethod2DBlueJ.Java */

public class Array2DBlueJ
{
    public static void main(char array2D[][])
    {
        System.out.println("Two dimensional matrix is: ");
        for( int i = 0; i < 2; i++)
        {
            for ( int j = 0; j < 3; j++)
            {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}