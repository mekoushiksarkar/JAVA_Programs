/** INPUT:
 *      arr1 = [1, 3, 5, 7, 9]
 *      arr2 = [2, 4, 6, 8, 10]
 *  OUTPUT:
 *      Merged array : [1, 3, 5, 7, 9, 2, 4, 6, 8, 10]
 */

public class MergeArrays
{
    public static int[] merge(int[] arr1, int[] arr2)
    {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] merged = new int[len1 + len2];
        int ml = merged.length;

        for (int i = 0; i < len1; i++)
        {
            merged[i] = arr1[i];
        }   
        int k=0;
        for(int j = len1; j < ml; j++,k++)
        {
            merged[j] = arr2[k];
        }
        return merged;
    }
    public static void main(String[] args)
    {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        int[] mergedArray = merge(arr1, arr2);
        for(int i = 0;i< mergedArray.length; i++)
        {
            System.out.print(mergedArray[i] + " ");
        }
    }
    
}