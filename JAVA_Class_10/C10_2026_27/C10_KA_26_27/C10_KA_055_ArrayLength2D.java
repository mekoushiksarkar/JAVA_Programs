/* ArrayLength2D.java */

public class ArrayLength2D
{
    public static void main(String args[])
    {
        char array2D[][] = {{'S', 'U', 'N', 'D', 'A', 'Y'},{'M', 'O', 'N', 'D', 'A', 'Y'}};
        int rows = array2D.length;
        int columns = array2D[0].length;
        System.out.println("Number of rows are: " + rows);
        System.out.println("Number of columns are: " + columns);
    }
}