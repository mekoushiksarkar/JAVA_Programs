// To generate random characters

import java.util.*;
class Random
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        char c;
        int n,i;
        System.out.println("Random Uppercase letters are:");
        for(i=1;i<=10;i++)
        {
            n=(int)(Math.random()*9)+1;
            c=(char)(n+64);
            System.out.println(c);
        }
        
    }
    
}

// o/p

// Random Uppercase letters are:
// I
// A
// B
// G
// F
// G
// F
// I
// B
// A

// === Code Execution Successful ===