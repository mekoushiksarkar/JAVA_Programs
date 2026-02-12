// Displaying Even numbers

class Even_Number {

  public static void main(String[] args) {
    int a = 0;
    System.out.println("The even numbers are:");
    do {
      a++;
      if (a % 2 != 0) 
        continue;
      System.out.println(a);
    } while (a <= 10);
  }
}

// o/p

// The even numbers are:
// 2
// 4
// 6
// 8
// 10
