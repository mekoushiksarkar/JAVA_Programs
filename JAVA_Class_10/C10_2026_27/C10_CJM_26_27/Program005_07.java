// Using method

import java.util.*;

class cal
{
  double area(double r)
  {   
      double ar1=22/7*r*r;
      return(ar1);
  }
  int area(int s)
  { 
      int ar2=s*s;
      return(ar2);
  }
  double area(double a,double b)
    {
        double ar3=a*b;
        return(ar3);
    }
  public static void main(String[]args)
  {
    int n;
    double m,p;
    cal ob=new cal();
    m=ob.area(5.3);
    n=ob.area(8);
    p=ob.area(6.2,3.6);
    System.out.println("Ar1="+m);
    System.out.println("Ar2="+n);
    System.out.println("Ar3="+p);
  }
}

// o/p

// Ar1=84.27
// Ar2=64
// Ar3=22.32
