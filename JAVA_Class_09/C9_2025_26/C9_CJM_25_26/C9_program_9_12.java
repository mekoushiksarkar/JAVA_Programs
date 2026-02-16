// A nested for loop pattern

class NestedLoop {

  public static void main(String[] args) {
    int i, j;
    for (i = 7; i >= 1; i = i - 2) {
      for (j = 1; j <= i; j++) 
        System.out.print(j + "");
      System.out.println();
    }
  }
}

// o/p

// 1234567
// 12345
// 123
// 1

// === Code Execution Successful ===
