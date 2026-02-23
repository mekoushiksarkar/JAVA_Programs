/* Inner_Continue.java */

public class Inner_Continue {

  public static void main(String args[]) {
    for (int i = 1; i <= 3; i++) {
      for (int j = 1; j <= 3; j++) {
        if (i == j) {
          continue;
        }
        System.out.println("(" + i + ", " + j + ")");
      }
      System.out.println("Inner loop complete");
    }
    System.out.println("Outer loop complete");
  }
}
