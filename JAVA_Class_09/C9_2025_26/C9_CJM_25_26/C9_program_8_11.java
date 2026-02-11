// Display Odd number using while loop and continue statement

class Odd_Number {

  public static void main(String[] args) {
    int a = 0;
    System.out.println("The odd numbers are:");
    while (a < 10) {
      a++;
      if (a % 2 == 0) 
        continue;
      System.out.println(a);
    }
  }
}

// o/p

// The odd numbers are:
// 1
// 3
// 5
// 7
// 9

// === Code Execution Successful ===
