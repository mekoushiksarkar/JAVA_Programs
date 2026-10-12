// Program to calculate the sum of elements in a 3x4 matrix in Java

import java.util.*;
class DDA
{
    public static void main(String[] args)
    {
        int i,j,s;s=0;
        int m[][]=new int[3][4];
        Scanner sc=new Scanner(System.in);
        System.out.println("The elements of 3*4 Matrix are:");
        for(i=0;i<3;i++)
        {
             for(j=0;j<4;j++)
                 m[i][j]=sc.nextInt();
             }
              System.out.println("Elements of the matrix:");
              for(i=0;i<3;i++)
              {
                  for(j=0;j<4;j++)
                  {
                      System.out.print(m[i][j]+" ");
                  }
                  System.out.println();
              }
                  for(i=0;i<3;i++)
                  {
                    for(j=0;j<4;j++)
                    {
                        s=s+m[i][j];
                    }
                  }
                   System.out.println("Sum="+s);
        }
    }


// o/p

// The elements of 3*4 Matrix are:
// 12
// 96
// 25
// 78
// 50
// 63
// 14
// 2
// 85
// 36
// 17
// 59
// Elements of the matrix:
// 12 96 25 78 
// 50 63 14 2 
// 85 36 17 59 
// Sum=537

// === Code Execution Successful ===