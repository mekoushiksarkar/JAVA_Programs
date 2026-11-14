/** Write a program to assign 10 country names to an array of strings. Sort them in ascending order using Bubble Sort technique.
 */
/* BubbleSort.java */

public class BubbleString
{
    public static void main(String args[])
    {
        String list[]  = {"India", "Canada", "Brazil", "America", "Peru", "Zimbabwe", "South Africa", "Italy", "France", "Germany"};
        int len;
        String tmpStr = "";
        len = list.length;
        for(int i = 0; i < len-1; i++)
        {
            for(int j = 0; j < len - i - 1; j++)
            {
                if(list[j].compareTo(list[j+1]) > 0)
                {
                    tmpStr = list[j];
                    list[j] = list[j+1];
                    list[j+1] = list[j];
                }
            }
        }
        System.out.println("Sorted list is: ");
        for (int i = 0; i < len; i++)
        System.out.println(list[i]);
    }
}