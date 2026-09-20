/** INPUT:
 *      Original array: [1, 2, 3, 4, 5]
 *      Index of element to delete: 2
 *  OUTPUT:
 *      Index of element to delete:2
 *      Array after deletion: [1, 2, 4, 5]
 *  APPROACH:
 *      1. Create a deleteElement method takes two paramenters: the original array and the index of the element to delete.
 *      2. Check if the index is valid. If the index is invalid(less than 0 or greater than or equal to the length of the array)
 *         , return the original array.
 *      3. Otherwise, create a new array with a length one less than the original array.
 *      4. Copy all original array elements before the deletion point into the new array.
 *      5. Copy all original array elements after the deletion point into the new array, skipping the element to delete.
 */

public class DeleteElement
{
    public static int[] DeleteElement(int[] array, int index)
    {
        if(index < 0 || index >= array.length)
        {
            //Invalid index, return the original array
            return array;
        }
        int[] NewArray= new int[array.length - 1];
        //Copy the elements before the deletion point
        for(int i = 0; i < index; i++)
        {
            NewArray[i] = array[i];
        }
        //Copy the elements after the deletion point
        for(int i = index+1; i < array.length; i++)
        {
            NewArray[i - 1] = array[i];
        }
        return NewArray;
    }
    public static void main(String[] args)
    {
        int[] array = {1, 2, 3, 4, 5};
        int index = 2;
        int[] newArray = DeleteElement(array, index);
        for(int i = 0; i < newArray.length; i++)
        {
            System.out.print(newArray[i] + " ");
        }
    }
}