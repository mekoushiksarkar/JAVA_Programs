//Mathematical library methods

import java.util.*;

class Methods {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number:");
    double a = sc.nextDouble();
    System.out.println("Enter the second number:");
    double b = sc.nextDouble();
    //int c=Math.max(a,b);
    //System.out.println("The largest number is:"+c);
    //double d=Math.min(a,b);
    //System.out.println("The smallest number is:"+d);
    double e = Math.pow(a, b);
    System.out.println("The number is:" + e);
    /*int f=math.sqrt(a);
        int g=math.cbrt(a);
        int h=math.log(a);
        int i=math.abs(a);
        int j=math.round(a);
        int k=math.rint(a);
        int l=math.ceil(a);
        int m=math.floor(a);
        int n=(math.random()*a)+1;*/
  }
}

// output:-
// Enter the first number:
// 2.0
// Enter the second number:
// 8.0
// The number is:256.0

// === Code Execution Successful ===
