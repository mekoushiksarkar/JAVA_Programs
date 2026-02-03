//to find the value of angles in cosine(cos)

import java.util.*;

class Conversions {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the angle:");
    double a = sc.nextDouble();
    double b = (22.0 / (7.0 * 180)) * a;
    double c = Math.tan(b);
    //double d=Math.PI/180*a;
    //double e=Math.tan(d);
    //double f=Math.toRadians(a);
    //double g=Math.tan(f);
    System.out.println("The value of the angle is:" + c);
    //System.out.println("The value of the angle is:"+e);
    //System.out.println("The value of the angle is:"+g);
  }
}

// Output

// Enter the angle:
// 45
// The value of the angle is:1.0006324445845896

// === Code Execution Successful ===
