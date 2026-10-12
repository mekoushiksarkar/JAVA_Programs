// Program to find the minimum and maximum elements in a 2x2 matrix in Java

import java.util.*;
class DDA
{
    public static void main(String[] args)
    {
        int i,j,min,max;
        int m[][]=new int[2][2];
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
                  min=m[0][0];
                  max=m[0][0];
                  for(i=0;i<2;i++)
                  {
                    for(j=0;j<2;j++)
                    {
                        if(min>m[i][j])
                          min=m[i][j];
                        if(max<m[i][j])
                          max=m[i][j];
                    }
                  }
                   System.out.println("Min:"+min);
                   System.out.println("Max:"+max);
        }
    }
	
o/p
	
// The elements of 2*2 Matrix are:
// 45
// 5
// 36
// 69
// Elements of the matrix:
// 45 5 
// 36 69 
// Min:5
// Max:69

// === Code Execution Successful ===