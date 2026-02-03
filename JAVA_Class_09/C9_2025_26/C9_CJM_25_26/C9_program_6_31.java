// value in tan degrees

import java.util.*;

class Value {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the ratio:");
    double a = sc.nextDouble();
    //double k=Math.atan(a);
    //double d=(k*7*180)/22;
    double rad = Math.atan(a);
    double tanD = Math.toDegrees(rad);
    //double e=Math.atan(a);
    //double f=((a*180)/Math.PI);
    //System.out.println("The angle of tan value is"+Math.round(d)+"degree");
    System.out.println(
      "The angle of tan value is" + Math.round(tanD) + "degree"
    );
    //System.out.println("The angle of tan value is"+Math.round(f)+"degree");
  }
}

// Output

// Enter the ratio:
// 1.732
// The angle of tan value is60degree

// === Code Execution Successful ===
