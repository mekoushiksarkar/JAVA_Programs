// Write a program to enter a sentence from the keyboard and count the number of times a particular word occurs in it. Display the frequency of the search word.

import java.util.Scanner;

public class WordOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string/sentence:");
        String str = sc.nextLine();
        System.out.println("Enter word to search:");
        String search = sc.nextLine();
        
        // Add a space at the end to ensure the last word is processed
        str = str.trim() + " ";
        
        String word = "";
        int count = 0;
        
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
                // Compare search word
                if (word.equalsIgnoreCase(search)) 
                {
                    count += 1;                    
                }

                // Reset word for the next iteration
                word = "";
            }
            
        }
		
        System.out.println("Search word occurs: " + count);
        
        sc.close();
    }
}