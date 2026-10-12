// Program to find the transpose of a 2x2 matrix in Java

import java.util.*;
class DDA
{
    public static void main(String[] args)
    {
        int i,j;
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
                   System.out.println("Transpose:");
                   for(i=0;i<2;i++)
                   {   
                      for(j=0;j<2;j++)
                      {
                          System.out.print(m[i][j]+" ");
                      }
                      System.out.println();
                   }
        }
    }
	
// o/p

// The elements of 2*2 Matrix are:
// 45
// 3
// 95
// 23
// Elements of the matrix:
// 45 3 
// 95 23 
// Transpose:
// 45 3 
// 95 23 

// === Code Execution Successful ===