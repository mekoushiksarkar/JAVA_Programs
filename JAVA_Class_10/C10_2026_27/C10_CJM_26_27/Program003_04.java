// Program to demonstrate the use of array of integers in Java

import java.io.*;
class Main
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int i,sum;sum=0;
        int m[]=new int[5];
        System.out.println("The numbers are:");
        for(i=0;i<5;i++)
        {
            m[i]=Integer.parseInt(in.readLine());
        }
        for(i=0;i<5;i++)
            sum=sum+m[i];
        System.out.println("The sum of array elements="+sum);
    }
}

// o/p

// The numbers are:
// 7
// 15
// 96
// 25
// 8
// The sum of array elements=151

// === Code Execution Successful ===