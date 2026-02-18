/* A program demonstrating the use of implicit conversion to get correct results*/

public class Correct_Implicit {

  public static void main(String args[]) {
    int dog = 86, dogfood = 47;
    double division;
    division = (double) dog / dogfood;
    System.out.println("The division is " + division);
  }
}
