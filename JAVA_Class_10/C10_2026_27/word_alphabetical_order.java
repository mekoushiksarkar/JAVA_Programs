// Program to sort words in alphabetical order from a string/sentence

import java.util.Scanner;

public class WordAlphabeticalOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string/sentence:");
        String str = sc.nextLine();
        
        str = str.trim() + " ";
        String word = "";
        
        // Array to store completed words and a counter for how many words we find
        String[] words = new String[str.length()];
        int wordCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') 
			{                
                word += ch;
            } else 
			{                
				words[wordCount] = word;
				wordCount++;                    
									
				word = "";            
            }
        }

        // Sort the extracted words alphabetically (Case-Insensitive)
        for (int i = 0; i < wordCount - 1; i++) {
            for (int j = 0; j < wordCount - 1 - i; j++) {
                if (words[j].compareToIgnoreCase(words[j + 1]) > 0) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
        
        System.out.println("\nWords in alphabetical order:");
        for (int i = 0; i < wordCount; i++) {
            System.out.println(words[i]);
        }

        sc.close();
    }
}
