// Program to demonstrate the use of array of characters in Java

import java.io.*;
class Main
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int i,j;
        char m[]=new char[5];
        System.out.println("Enter all the characters at a time:");
        for(i=0;i<5;i++)
        {
            m[i]=(char)(in.read());
        }
        System.out.println("The characters in the cells are:");
        for(j=0;j<5;j++)
            System.out.println("m["+j+"]:"+m[j]);
    }
}

// o/p

// Enter all the characters at a time:
// HEART
// The characters in the cells are:
// m[0]:H
// m[1]:E
// m[2]:A
// m[3]:R
// m[4]:T

// === Code Execution Successful ===