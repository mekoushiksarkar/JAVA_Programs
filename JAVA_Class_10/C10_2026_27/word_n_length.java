// Write a program to input a sentence and print each word of the string along with its length in tabular form.

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string/sentence:");
        String str = sc.nextLine();
        
        // Add a space at the end to ensure the last word is processed
        str = str.trim() + " ";
        
        String word = "";
        
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
                System.out.println( word + "----- length: " + word.length());
                // Reset word for the next iteration
                word = "";
            }
            
        }        
        sc.close();
    }
}