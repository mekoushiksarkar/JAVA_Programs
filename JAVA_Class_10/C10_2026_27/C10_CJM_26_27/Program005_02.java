// Factorial of two no.s using method

import java.util.*;

class Factorial
{
  public int fact(int x)
  {
    int f=1,i;
    for(i=1;i<=x;i++)
       f=f*i;
    return(f);
  }
  public static void main(String[]args)
  {
    int n=5,m=8;
    Factorial ob=new Factorial();
    int p=ob.fact(n);
    System.out.println("Fact1="+p);
    int q=ob.fact(m);
    System.out.println("Fact2="+q);
  }
}

// o/p

// Fact1=120
// Fact2=40320
