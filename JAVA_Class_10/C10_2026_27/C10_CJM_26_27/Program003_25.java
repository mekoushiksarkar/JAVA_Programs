// Program to calculate the sum of elements in each row of a 2x2 matrix in Java

import java.util.*;
class DDA
{
    public static void main(String[] args)
    {
        int i,j,r;
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
                  for(i=0;i<2;i++)
                  {
                    for(j=0;j<2;j++)
                        n[i][j]=m[i][j];
                  }
                   System.out.println("Sum of each row:");
                   for(i=0;i<2;i++)
                   { 
                       r=0;
                      for(j=0;j<2;j++)
                      {
                          r=r+m[i][j];
                      }
                      System.out.println("Sum of the elements of"+(i+1)+"row="+r);
                   }
        }
    }
	
// o/p

// The elements of 2*2 Matrix are:
// 52
// 4
// 91
// 22
// Elements of the matrix:
// 52 4 
// 91 22 
// Sum of each row:
// Sum of the elements of1row=56
// Sum of the elements of2row=113

// === Code Execution Successful ===