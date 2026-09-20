/** INPUT: 
 *      arr1 = [1, 3, 5, 7, 9]
 *      arr2 = [2, 4, 6, 8, 10]
 *  OUTPUT:
 *      Merged array: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 *  APPROACH:
 *  1. We iterate through both arrays simulteneously using three counters: i for arr1; j for arr2, and k for merged.
 *  2. At each step, we compare the elements pointed by i and j, and copy the smaller one to merged.
 *  3. After copying all elements from one of the arrays, we copy the remaining elements from the other array to merged.
 *  4. Finally, we return the merged array, which is sorted.
 */

public class MergeArrays2
{
    public static int[] merge(int[] arr1, int[] arr2)
    {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] merged = new int[len1 + len2];
        int i = 0, j = 0, k = 0;
        while(i < len1 && j < len2)
        {
            if (arr1[i] < arr2[j])
            {
                merged[k++] = arr1[i++];
            }
            else
            {
                merged[k++] = arr2[j++];
            }
        }
        while (i < len1)
        {
            merged[k++] = arr1[i++];
        }
        while (j < len2)
        {
            merged[k++] = arr1[j++];
        }
        return merged;
    }
    public static void main(String[] args)
    {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        int[] mergedArray = merge(arr1, arr2);
        for(int i = 0; i <  mergedArray.length; i++)
        {
            System.out.print(mergedArray[i] + " ");
        }
    }
}