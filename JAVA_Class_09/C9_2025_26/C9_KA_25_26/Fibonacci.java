/* FibonacciSeries.java */
public class Fibonacci {

  public static void main(String args[]) {
    int num1 = 0, num2 = 1;
    int sum = 0;
    System.out.println("Fibonacci series is:  ");
    System.out.print(num1 + "  ");
    System.out.print(num2 + "  ");
    sum = num1 + num2;
    while (sum <= 100) {
      System.out.print(sum + "  ");
      num1 = num2;
      num2 = sum;
      sum = num1 + num2;
    }
  }
}
