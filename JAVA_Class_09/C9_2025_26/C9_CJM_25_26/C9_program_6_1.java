//Mathematical library methods

import java.util.*;

class Methods {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number:");
    int a = sc.nextInt();
    System.out.println("Enter the second number:");
    int b = sc.nextInt();
    int c = Math.max(a, b);
    System.out.println("The largest number is:" + c);
    /*int d=math.min(a,b);
        int e=math.pow(a,b);
        int f=math.sqrt(a);
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

// OUTPUT:-
// Enter the first number:
// 5
// Enter the second number:
// 8
// The largest number is:8

// === Code Execution Successful ===
