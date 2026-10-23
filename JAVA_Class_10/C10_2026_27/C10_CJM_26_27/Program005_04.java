// Factorial using method

import java.util.*;

class Factorial
{
  public void fact()
  {
    int n=5,f=1,i;
    for(i=1;i<=n;i++)
       f=f*i;
    System.out.println("Fact="+f);
  }
  public static void main(String[]args)
  {
    Factorial ob=new Factorial();
    ob.fact();
  }
}

// o/p

// Fact=120