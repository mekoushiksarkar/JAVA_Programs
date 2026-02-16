// A nested for loop pattern

class NestedLoop {

  public static void main(String[] args) {
    int i, j;
    outer: 
    for (i = 1; i <= 5; i++) {
      for (j = 1; j <= 3; j++) {
        System.out.print(i * j + "\t");
        if (j == 2) 
            break outer;
      }
    }
  }
}

// o/p

// 1	2
// === Code Execution Successful ===
