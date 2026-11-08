// To check whether the number is prime or not

import java.util.*;
public class Prime
{
    int n;
    Prime()
    {
        n = 0;
    }
    void input(int x)
    {
        n = x;
    }
    void display()
    {
        int i,c=0;
        for(i = 1; i <= n; i++)
        {
           if(n % i == 0)
           {
                c = c + 1;
            }  
         }
         if(c == 2)
           System.out.println(n + " is a prime number");
        else
           System.out.println(n + " is not a prime number");
    }
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int num = in.nextInt();
      Prime ob = new Prime();
      ob.input(num);
      ob.display();
   }
}

// o/p
// Enter a number: 7
// 7 is a prime number
