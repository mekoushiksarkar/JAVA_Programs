/* ControlVariableIndependence.java */

public class ControlVariableDoWhile {

  public static void main(String args[]) {
    boolean finished = false;
    int i = 1;
    do {
      System.out.println(i);
      if (i % 5 == 0) {
        finished = true;
        System.out.println("Finishing...");
      }
      i++;
    } while (!finished);
  }
}
