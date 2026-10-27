/** Write a program to assign a full path and the name as given below. Using library functions, extract and output the file path,
 * file name and file extention separately as shown.
 * Sample Input: C:\Users\admin\Pictures\flower.jpg
 * Sample Output:
 * Path: C:\Users\admin\Pictures\flower.jpg
 * File Name: flower
 * File extention: jpg
 */
/*PathFile.java */
import java.util.*;
public class PathFile
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String path, name, ex;
        int posLastSlash, posDot;
        System.out.println("Enter a string:");
        String inputString = scan.nextLine();
        posLastSlash = inputString.lastIndexOf('\\');
        posDot = inputString.lastIndexOf('.');
        path = inputString.substring(0, posLastSlash +1);
        name = inputString.substring(posLastSlash+1, posDot);
        ex = inputString.substring(posDot+1);
        System.out.println("Path: " + path);
        System.out.println("File Name: " +  name);
        System.out.println("File Extention: " + ex);
        scan.close();
    }
}