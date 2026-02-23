/* Labelled_Break.java */

public class Labelled_Break {

  public static void main(String args[]) {
    outer: for (int i = 1; i <= 3; i++) {
      // The loop iterates twice as the value of j ranges from 1 to 2
      for (int j = 1; j <= 2; j++) {
        if (i == 3) {
          System.out.println("Terminating the Outer loop");
          break outer;
        }
        System.out.println("i = " + i + " ; j = " + j);
      }
    }
  }
}
