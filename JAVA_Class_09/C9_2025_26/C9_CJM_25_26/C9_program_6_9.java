//Mathematical library methods

import java.util.*;

class Methods {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number:");
    double a = sc.nextDouble();
    //System.out.println("Enter the second number:");
    //double b=sc.nextDouble();
    //int c=Math.max(a,b);
    //System.out.println("The largest number is:"+c);
    //double d=Math.min(a,b);
    //System.out.println("The smallest number is:"+d);
    //double e=Math.pow(a,b);
    //System.out.println("The number is:"+e);
    //double f=Math.sqrt(a);
    //System.out.println("The number is:"+f);
    //double g=Math.cbrt(a);
    //System.out.println("The number is:"+g);
    //double h=Math.log(a);
    //System.out.println("The number is:"+h);
    //double i=Math.abs(a);
    //System.out.println("The number is:"+i);
    //double j=Math.round(a);
    //System.out.println("The number is:"+j);
    double k = Math.rint(a);
    System.out.println("The number is:" + k);
    /*int l=math.ceil(a);
        int m=math.floor(a);
        int n=(math.random()*a)+1;*/
  }
}

// output:-
// Enter the first number:
// 2.69
// The number is:3.0

// === Code Execution Successful ===
