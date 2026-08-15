/* BubbleSort.java */

public class BubbleSort
{
    public static void main(String args[])
    {
        int list[] = {65, 47, 40, 9, 37, 72, 45, 17};
        int len = list.length;
        for (int i = 0; i < len-1; i++)
        {
            for (int j = 0; j < len-i-1; j++)
            {
                if (list[j] > list[j+1])
                {
                    //Swap the adjacent elements
                    int tmp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = tmp;
                }
            }
        }
        //Print the sorted array
        System.out.println("Sorted array is: ");
        for (int i = 0; i < len; i++)
        {
            System.out.println(list[i]);
        }
    }
}