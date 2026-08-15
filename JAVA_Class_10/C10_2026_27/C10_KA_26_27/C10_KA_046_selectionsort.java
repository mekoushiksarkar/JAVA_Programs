/* SelectionSort.java */

public class selectionsort
{
    public static void main(String args[]) 
    {
        int list[] = {55, 67, 40, 3, 33, 72, 45, 23};
        int len = list.length;
        //The outer loop tells which position in array list[] to fill next
        for (int i = 0; i < len-1; i++)
        {
            //Find the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i+1; j < len; j++)
            {
                if( list[j] < list[minIndex])
                minIndex = j;
            }
            //Swap the minimum element with the position to fill
            System.out.println("Pass " + (i+1) + " => Swap " + list[i] + " and " + list[minIndex]);
            int tmp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = tmp;
        }
        //Print the sorted array
        System.out.println("Sorted array is: ");
        for(int i = 0; i <len; i++)
        {
            System.out.println(list[i]);
        }
    }
}