// Write a program to input a string and print each word of the string in the reverse order.

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        String[] words = str.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) 
        {
			// For Printing Words
            //System.out.println("Word: " + words[i]);
            String word = words[i];
            String reversedWord = "";
            
            // Reverse each individual word
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord += word.charAt(j);
            }
            result += reversedWord + " ";
        }
        
        System.out.println("Reverse order: " + result.trim());
        
        sc.close();
    }
}