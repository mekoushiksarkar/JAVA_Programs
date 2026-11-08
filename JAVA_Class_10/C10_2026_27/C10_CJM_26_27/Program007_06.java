// To display a word in Piglatin form

import java.util.*;
class Piglatin
{
    int i, p;
    String wd, st1, st2;
    char chr;
    Piglatin()
    {
        wd = "";
    }
    void input(String word)
    {
        wd = word;
        wd = wd.toLowerCase();
    }
    void display()
    {
        p = wd.length();
        for(i = 0; i < p; i++)
        {
            chr = wd.charAt(i);
            if(chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u')
            break;
        }
        st1=wd.substring(i,p);
        st2=wd.substring(0,i);
        System.out.println("The piglatin form of word:");
        System.out.println(st1+st2+"ay");
    }
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter a word: ");
       String word = in.nextLine();
       Piglatin ob = new Piglatin();
       ob.input(word);
       ob.display();
    } 
}

// o/p
// Enter a word: SANCHARI
// The piglatin form of word:
// ancharisay

