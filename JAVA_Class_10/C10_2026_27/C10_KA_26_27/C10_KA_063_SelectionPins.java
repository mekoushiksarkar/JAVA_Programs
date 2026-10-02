/** Define a class pin code and store the given pin codes in a single dimension array. Sort these pin codes in ascending order using 
 *  the Selection Sort technique only. Display the sorted array.
 *  110061, 110001, 110029, 110023, 110006, 110019, 110033
 */

public class SelectionPins
{
    public static void main(String args[])
    {
        int list[] = {110061, 110001, 110029, 110023, 110035, 110006, 110019, 110033};
        int len = list.length;
        //The outer loop tells which position array list[] to fill next
        for( int i = 0; i < len-1; i++)
        {
            //Find the minimum element in the unsorted part of the array
            int minIndex = i;
            for ( int j = i+1; j < len; j++)
            {
                if(list[j] < list[minIndex])
                minIndex = j;
            }
            //Swap the minimum element with the position to fill
            int temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;
        }
        //Print the sorted array
        System.out.println("Sorted array is:");
        for (int i = 0; i < len; i++)
        {
            System.out.println(list[i]);
        }
    }
}