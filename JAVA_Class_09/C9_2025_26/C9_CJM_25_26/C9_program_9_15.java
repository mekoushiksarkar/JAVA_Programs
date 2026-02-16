// A nested for loop pattern

class NestedLoop {

  public static void main(String[] args) {
    int i, j;
    for (i = 1; i <= 5; i++) {
      for (j = 1; j <= i; j++) 
        System.out.print("*" + "");
      System.out.println();
    }
  }
}

// o/p

// *
// **
// ***
// ****
// *****

// === Code Execution Successful ===
