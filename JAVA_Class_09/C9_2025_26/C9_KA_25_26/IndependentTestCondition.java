/* IndependentTestConditionWhile.java */

public class IndependentTestCondition {

  public static void main(String args[]) {
    boolean finished = false;
    int i = 1;
    while (!finished) {
      System.out.println(i);
      if (i % 5 == 0) {
        finished = true;
        System.out.println("Exiting....");
      }
      i++;
    }
  }
}
