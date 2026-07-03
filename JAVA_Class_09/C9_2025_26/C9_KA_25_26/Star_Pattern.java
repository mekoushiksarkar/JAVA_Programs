/* RightAngledTrianglePattern2.java */

import java.util.*;
public class Star_Pattern
{
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter number of rows: ");
        int numRows = scnr.nextInt();
        for (int i = 1; i <= numRows; i++){
            for (int j = i; j <= numRows; j++) {
                if (j == numRows)
                System.out.print(i + "  ");
                else
                System.out.print("* ");
            }
            System.out.println();
        }
        scnr.close();
    }
}
