/* TrianglePatternWithMenu.java */

import java.util.*;
public class Triange_Menu
{
    public static void main(String args[]) {
        int choice;
        int numRows;
        Scanner scnr = new Scanner(System.in);
        System.out.println("  Pattern Menu  ");
        System.out.println("  ============  ");
        System.out.println("1. Triangle");
        System.out.println("2. Inverted Triangle");
        System.out.println("3. Exit");
        System.out.println();
        System.out.print("Enter your choice: ");
        choice = scnr.nextInt();
        if (choice == 3){
            System.out.println("Exiting...");
            System.exit(0);
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of rows: ");
        numRows = input.nextInt();
        switch(choice) {
            case 1:
                for(int i = 1; i <= numRows; i++) {
                    for(int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for(int i = 1; i <= numRows; i++) {
                    for (int j = i; j <= numRows; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("*** Invalid option entered ***");
        }
    }
}
