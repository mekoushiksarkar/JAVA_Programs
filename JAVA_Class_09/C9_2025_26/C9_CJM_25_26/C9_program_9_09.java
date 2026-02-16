// A nested for loop pattern

class NestedLoop {

  public static void main(String[] args) {
    int i, j, p, q = 1;
    for (i = 1; i <= 5; i++) {
      p = q;
      for (j = 1; j <= i; j++) {
        System.out.print(p + "");
        p = p + 2;
      }
      q = q + 2;
      System.out.println();
    }
  }
}

// o/p

// 1
// 35
// 579
// 791113
// 911131517

// === Code Execution Successful ===
