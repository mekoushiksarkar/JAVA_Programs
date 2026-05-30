// OddEvenSum.java

public class Odd_Even_Sum {

  public static void main(String args[]) {
    int i = 1;
    int sumEven = 0, sumOdd = 0;
    while (i <= 50) {
      if (i % 2 == 0) 
        sumEven += i;
      else 
        sumOdd += i;
      i++;
    }
    System.out.println("The sum of even numbers is " + sumEven);
    System.out.println("The sum of odd numbers is " + sumOdd);
  }
}
