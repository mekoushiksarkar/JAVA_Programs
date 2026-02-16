// A nested for loop pattern

class NestedLoop {

  public static void main(String[] args) {
    int i, j;
    for (i = 1; i <= 5; i++) {
      for (j = 1; j <= 3; j++) {
        System.out.print(i * j);
      }
      if (i > 2) 
        break;
      System.out.println("****");
    }
  }
}

// o/p

// 123****
// 246****
// 369
// === Code Execution Successful ===
