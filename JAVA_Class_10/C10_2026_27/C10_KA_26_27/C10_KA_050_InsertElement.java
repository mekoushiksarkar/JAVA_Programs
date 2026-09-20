/** INPUT:
 *      Original array : [1, 2, 3, 4, 5]
 *      Element to insert: 17
 *      Index of insertion: 2
 *  OUTPUT:
 *      Array after insertion : [1, 2, 17, 3, 4, 5]
 *  APPROACH:
 *      1. Create an insertElement method takes three parameters: the original array, the element to insert, and the index
 *         at which to insert the element.
 *      2. Create a new array with a length one greater than the original array.
 *      3. Copy all the elements of the original array before the insertion point into the new array.
 *      4. Insert the new element ar the specified index.
 *      5. Copy all the elements of the original array after the insertion point into the new array.
 */

public class InsertElement
{
    public static int[] insertElement(int[] array, int element, int index)
    {
        int[] newArray = new int[array.length + 1];
        //Copy elements before the insertion point
        for(int i = 0; i < index; i++)
        {
            newArray[i] = array[i];
        }
        //Insert the new element
        newArray[index] = element;
        //Copy elements after the insertion point
        for(int i = index + 1 ; i < newArray.length; i++)
        {
            newArray[i] = array[i - 1];
        }
        return newArray; 
    }
    public static void main(String [ ] args)
    {
        int[] array = {1, 2, 3, 4, 5};
        int element = 17;
        int index = 2;
        int[] newArray = insertElement(array, element,index);
        for(int i = 0; i < newArray.length; i++)
        {
            System.out.print(newArray[i] + " ");
        }
    }
}