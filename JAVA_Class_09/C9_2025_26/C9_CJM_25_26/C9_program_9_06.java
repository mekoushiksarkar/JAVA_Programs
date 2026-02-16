// A nested for loop pattern

class NestedLoop {

  public static void main(String[] args) {
    int i, j;
    for (i = 1; i <= 5; i++) {
      for (j = 1; j <= 3; j++) {
        if (i * j > 10) 
            continue;
        System.out.print(i * j + "\t");
      }
    }
  }
}

// o/p

// 1	2	3	2	4	6	3	6	9	4	8	5	10
// === Code Execution Successful ===
