// value in sin degrees

import java.util.*;

class Value {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the ratio:");
    double a = sc.nextDouble();
    //double k=Math.asin(a);
    //double d=(k*7*180)/22;
    //double rad=Math.asin(a);
    //double sinD=Math.toDegrees(rad);
    double e = Math.asin(a);
    double f = ((a * 180) / Math.PI);
    //System.out.println("The angle of sin value is"+Math.round(d)+"degree");
    //System.out.println("The angle of sin value is"+Math.round(sinD)+"degree");
    System.out.println("The angle of sin value is" + Math.round(f) + "degree");
  }
}

// Output

// Enter the ratio:

// 0.0
// The angle of sin value is0degree

// === Code Execution Successful ===
