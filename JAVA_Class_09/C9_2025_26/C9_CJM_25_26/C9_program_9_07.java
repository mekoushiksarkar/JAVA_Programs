// A nested for loop pattern

class NestedLoop {

  public static void main(String[] args) {
    int i, j;
    outer: 
    for (i = 1; i <= 5; i++) {
      for (j = 1; j <= 3; j++) {
        if (i % 2 == 0) 
            continue outer;
        System.out.print(i * j + "\t");
      }
    }
  }
}

// o/p

// 1	2	3	3	6	9	5	10	15
// === Code Execution Successful ===
