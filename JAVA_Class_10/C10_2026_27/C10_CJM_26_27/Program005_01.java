// Sum of 2 no.s using method

import java.util.*;

public class Sum 
{
  public int Add(int m,int n)
  {
    int s=0;
    s=m+n;
    return(s);
  }
  public static void main(String[]args)
  {
    int a,b,p;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 2 no.s");
    a=sc.nextInt();
    b=sc.nextInt();
    Sum ob=new Sum();
    p=ob.Add(a,b);
    System.out.println("Sum="+p);
  }
}

// o/p
// Enter 2 no.s
// 58
// 16
// Sum=74