// Using method

import java.util.*;

class Prime
{
  int check(int n)
  {   
      int i,c=0,f=0;
      for(i=1;i<=n;i++)
      {
          if(n%i==0)
            c=c+1;      
      }
      if(c==2)
          f=1;
      return(f);
  }
  public static void main(String[]args)
  {
    int k,a;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a no.:");
    a=sc.nextInt();
    Prime ob=new Prime();
    k=ob.check(a);
    if(k==1)
      System.out.println("Prime no.");  
    else
       System.out.println("Not a prime no.");
  }
}

// o/p
 
//  Enter a no.:
// 7
// Prime no.
