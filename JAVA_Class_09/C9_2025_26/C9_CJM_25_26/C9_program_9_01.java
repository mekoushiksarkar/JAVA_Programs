// A nested loop contains a loop within another loop

class NestedLoop {

  public static void main(String[] args) {
    int i, j;
    for (i = 0; i <= 5; i++) {
      for (j = 1; j <= i; j++) {
        System.out.print(i + "\t");
      }
      System.out.println();
    }
  }
}

// o/p

// 1
// 2	2
// 3	3	3
// 4	4	4	4
// 5	5	5	5	5

// === Code Execution Successful ===
