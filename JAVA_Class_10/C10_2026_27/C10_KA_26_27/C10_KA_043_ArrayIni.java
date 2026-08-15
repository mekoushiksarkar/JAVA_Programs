/* ArrayInitialisation */

public class ArrayIni
{
    public static void main(String args[])
    {
        int room[] = {35, 30, 20, 25, 45};
        System.out.println("Room No.\tCapacity");
        System.out.println("********\t*********");
        for (int i = 0; i < 5; i++)
        {
            System.out.println(i + "\t\t" + room[i]);
        }
    }
}