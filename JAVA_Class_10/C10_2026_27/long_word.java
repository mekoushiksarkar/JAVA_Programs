// Write a program in Java to enter a string/sentence and display the longest word and the length of the longest word present in the string.

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string/sentence:");
        String str = sc.nextLine();
        
        // Add a space at the end to ensure the last word is processed
        str = str.trim() + " ";
        
        String word = "";
        String longestWord = "";
        int maxLen = 0;
        
        for (int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i);
            
            if (ch != ' ') 
            {
                // Build the current word character by character
                word += ch;
            } 
            else 
            {
                // Compare the length of the completed word with maxLen
                if (word.length() > maxLen) 
                {
                    maxLen = word.length();
                    longestWord = word;
                }
                // Reset word for the next iteration
                word = "";
            }
        }
        
        System.out.println("The longest word: " + longestWord);
        System.out.println("The length of the word: " + maxLen);
        
        sc.close();
    }
}