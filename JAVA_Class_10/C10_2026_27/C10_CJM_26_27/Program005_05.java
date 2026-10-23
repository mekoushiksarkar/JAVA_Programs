// Using method

import java.util.*;

class Ex
{
  void show(int x,int y)
  {
    x=x+2;
    y=y+2;
    System.out.println("Values frml="+x);
    System.out.println("Values frml="+y);   
  }
  public static void main(String[]args)
  {
    Ex ob=new Ex();
    int a=5,b=6;
    ob.show(a,b);
    System.out.println("Values act="+a);
    System.out.println("Values act="+b); 
  }
}

// o/p

// Values frml=7
// Values frml=8
// Values act=5
// Values act=6
