// WAP to find out all Armstrong number upto a given range e.g 153 = 1^3 + 5^3 + 3^3 = 1+125+27 = 153

import java.util.Scanner;

public class armstrong_num {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER A RANGE OF THE ARMSTRONG NUMBER");
    int n = sc.nextInt();
    System.out.println("Armstrong number upto a range of" + n + "are");
    int i, s, d, k;
    for (i = 1; i <= n; i++) {
      s = 0;
      k = i;
      while (k != 0) {
        d = k % 10;
        s = s + d * d * d;
        k = k / 10;
      }
      if (s == i) {
        System.out.println(i);
      }
    }
  }
}
