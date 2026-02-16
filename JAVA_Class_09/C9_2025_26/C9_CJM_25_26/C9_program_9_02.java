// A nested for loop pattern

class NestedLoop {

  public static void main(String[] args) {
    int i, j, k = 1;
    for (i = 0; i < 5; i++) {
      for (j = 0; j < k; j++) {
        System.out.print("*" + "\t");
      }
      k = k + 2;
      System.out.println();
    }
  }
}

// o/p

// *
// *	*	*
// *	*	*	*	*
// *	*	*	*	*	*	*
// *	*	*	*	*	*	*	*	*

// === Code Execution Successful ===
