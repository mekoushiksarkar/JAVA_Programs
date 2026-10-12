// Program to calculate the sum of elements in each column of a 2x2 matrix in Java

import java.util.*;
class DDA
{
    public static void main(String[] args)
    {
        int i,j,c;
        int m[][]=new int[2][2];
        int n[][]=new int[2][2];
        Scanner sc=new Scanner(System.in);
        System.out.println("The elements of 2*2 Matrix are:");
        for(i=0;i<2;i++)
        {
             for(j=0;j<2;j++)
                 m[i][j]=sc.nextInt();
             }
              System.out.println("Elements of the matrix:");
              for(i=0;i<2;i++)
              {
                  for(j=0;j<2;j++)
                  {
                      System.out.print(m[i][j]+" ");
                  }
                  System.out.println();
              }
                   System.out.println("Sum of each column:");
                   for(i=0;i<2;i++)
                   { 
                       c=0;
                      for(j=0;j<2;j++)
                      {
                          c=c+m[j][i];
                      }
                      System.out.println("Sum of the elements of"+(i+1)+"column="+c);
                   }
        }
    }
	
// o/p

// The elements of 2*2 Matrix are:
// 54
// 63
// 20
// 8
// Elements of the matrix:
// 54 63 
// 20 8 
// Sum of each column:
// Sum of the elements of1column=74
// Sum of the elements of2column=71

// === Code Execution Successful ===