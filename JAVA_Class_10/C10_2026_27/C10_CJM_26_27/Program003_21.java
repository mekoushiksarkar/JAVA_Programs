// Program to display perfect and buzz numbers using menu driven program

import java.util.*;
class N_um
{
    public static void main(String[] args)
    {
        int i,n,s,j;
        int m[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        for(i=0;i<5;i++)
            m[i]=sc.nextInt();
        System.out.println("Menu Driven Program:");
        System.out.println("1.To display all perfect nos.");
        System.out.println("2.To display all buzz nos.");
        System.out.println("Enter your choice:");
        n=sc.nextInt();
        switch(n)
        {
          case 1:
            for(i=0;i<5;i++)
            {
                s=0;
                for(j=1;j<m[i];j++)
                {
                    if(m[i]%j==0)
                    s=s+j;
                }
             if(s==m[i])
               System.out.println(m[i]);
             }
             break;
          case 2:
              for(i=0;i<5;i++)
              {
                  if(m[i]%7==0 || m[i]%10==7)
                  System.out.println(m[i]);
              }
              break;
           default:
              System.out.println("Invalid choice!!!");
        }
    }    
}


// o/p

// Enter 5 numbers:
// 45
// 49
// 27
// 2
// 30
// Menu Driven Program:
// 1.To display all perfect nos.
// 2.To display all buzz nos.
// Enter your choice:
// 2
// 49
// 27

// === Code Execution Successful ===