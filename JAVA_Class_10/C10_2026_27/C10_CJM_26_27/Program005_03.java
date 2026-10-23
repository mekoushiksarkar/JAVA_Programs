// Factorial of two no.s using method

import java.util.*;

class Factorial
{
  public void fact(int x)
  {
    int f=1,i;
    for(i=1;i<=x;i++)
       f=f*i;
    System.out.println("Fact="+f);
  }
  public static void main(String[]args)
  {
    int n=5,m=8;
    Factorial ob=new Factorial();
    ob.fact(n);
    ob.fact(m);
  }
}

// o/p

// Fact=120
// Fact=40320
