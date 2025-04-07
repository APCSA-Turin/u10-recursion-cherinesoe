package U10T1L3;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    long startTime = System.nanoTime();
    int fibRec = fibonacci(40);
    long endTime = System.nanoTime();
    long recursiveTime = endTime - startTime;


    startTime = System.nanoTime();
    int fibIter = iterativeFibonacci(40);
    endTime = System.nanoTime();
    long iterativeTime = endTime - startTime;
    System.out.println("Fibonacci(" + 40 + ")");

    System.out.println("Recursive: " + fibRec + " | Time: " + recursiveTime / 1e6 + " ms");
    System.out.println("Iterative: " + fibIter + " | Time: " + iterativeTime / 1e6 + " ms");

  }

  private static int fibonacci(int x) {
    if (x == 1) {
        return 0;
    }
    if (x == 2) {
        return 1;
    }
    // double recursive method call
    return fibonacci(x - 1) + fibonacci(x - 2);
  }

  private static int iterativeFibonacci(int x) {
    int prev2 = 0;
    int prev = 1;
    int sum = 0;
    for (int i = 2; i < x; i++) {
      sum = prev2 + prev;
      prev2 = prev;
      prev = sum;
    }
    return sum;
  }
}

