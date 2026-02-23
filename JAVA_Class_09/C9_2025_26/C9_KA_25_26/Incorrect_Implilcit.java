/* A program where an incorrect result is produced due to implicit conversion*/

public class Incorrect_Implilcit {

  public static void main(String args[]) {
    int dog = 86, dogfood = 47;
    double division;
    division = dog / dogfood;
    System.out.println("The division is " + division);
  }
}
