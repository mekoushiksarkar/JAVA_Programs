// Program to find the frequency of a character in a string/sentence

import java.util.Scanner;

public class char_frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string/sentence:");
        String str = sc.nextLine();

        System.out.println("Enter character to search:");
        char search = sc.next().charAt(0);
        
        // Add a space at the end to ensure the last word is processed
        str = str.trim() + " ";
        int count =0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == search ) 
                {
                    count += 1;                    
                }
            }
        System.out.println("Search character occurs: " + count);

        sc.close();
    }
}
