public class FactorialRunner {
    public static void main(String[] args) {
      // non-recursive: for loop
      System.out.println(factorialForLoop(5));
      System.out.println(factorialForLoop(10));
  
      // non-recursive: while loop
      System.out.println(factorialWhileLoop(5));
      System.out.println(factorialWhileLoop(10));
  
      // recursive
      System.out.println(factorialRecursive(5));
      System.out.println(factorialRecursive(10));
    }
  
    public static int factorialRecursive(int num) {
      if (num == 1) {
        return 1;
      } else {
        return (num * factorialRecursive(num - 1));
      }
    }
  
    public static int factorialRecursiveAlt(int num) {
      if (num > 1) {
        return (num * factorialRecursive(num - 1));
      } else {
        return 1;
      }
    }
  
    public static int factorialForLoop(int num) {
      int factorial = 1;
      for (int i = num; i >= 1; i--) {
        factorial *= i;
      }
      return factorial;
    }
  
    public static int factorialWhileLoop(int num) {
      int factorial = 1;
      while (num > 0) {
        factorial *= num;
        num--;
      }
      return factorial;
    }
}
  