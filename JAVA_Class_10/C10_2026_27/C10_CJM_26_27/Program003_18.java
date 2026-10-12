// Program to count the number of even, odd and multiples of 4 in an array of integers in Java

import java.util.*;
class N_um
{
    public static void main(String[] args)
    {
        int i,c1=0,c2=0,c3=0;
        int m[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        for(i=0;i<5;i++)
            m[i]=sc.nextInt();
        for(i=0;i<5;i++)
        {
            if(m[i]%2==0)
              c1++;
            if(m[i]%2!=0)
              c2++;
            if(m[i]%4==0)
              c3++;
        }
        System.out.println("Total no. of even numbers\t:"+c1);
        System.out.println("Total no. of odd numbers\t:"+c2);
        System.out.println("Total no. of multiples of 4\t:"+c3);
    }    
}


// o/p

// Enter 5 numbers:
// 45
// 16
// 22
// 8
// 59
// Total no. of even numbers	:3
// Total no. of odd numbers	:2
// Total no. of multiples of 4	:2

// === Code Execution Successful ===