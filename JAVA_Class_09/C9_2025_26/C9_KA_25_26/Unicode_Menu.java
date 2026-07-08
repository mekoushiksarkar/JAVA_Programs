/* UnicodeMenu.java */

import java.util.*;
public class Unicode_Menu
{
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("1. Display Unicode Values");
        System.out.println("2. Display Pattern");
        System.out.print("Enter your choice: ");
        int choice = scnr.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Letters  Unicode");
                for(char ch = 'A'; ch <= 'Z'; ch++) {
                    System.out.println(ch + "         " + (int)ch);
                }
                break;
            case 2:
                for(int i = 1; i <= 5; i++) {
                    for(int j = 1 ; j <= i; j++) {
                        System.out.print(j + "  ");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Invalid choice entered");
        }
        scnr.close();
    }
}
