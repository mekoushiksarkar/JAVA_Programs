// Program to sort words from shortest to longest in a string/sentence

import java.util.Scanner;

public class WordShortToLong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string/sentence:");
        String str = sc.nextLine();
        
        // Add a space at the end to ensure the last word is processed
        str = str.trim() + " ";
        String word = "";
        
        // Array to store completed words and a counter for how many words we find
        String[] words = new String[str.length()];
        int wordCount = 0;
        
        // String longestWord = "";
        // int maxLen = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') 
            {                
                word += ch;
            } 
            else 
            {         
                words[wordCount] = word;
                wordCount++;                    

                word = "";
            }
        }

        // Sort the words array from shortest to longest (Bubble Sort)
        for (int i = 0; i < wordCount - 1; i++) {
            for (int j = 0; j < wordCount - i - 1; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        // Display words from shortest to longest
        System.out.println("\nWords from shortest to longest:");
        for (int i = 0; i < wordCount; i++) {
            System.out.println(words[i]);
        }

        sc.close();
    }
}
