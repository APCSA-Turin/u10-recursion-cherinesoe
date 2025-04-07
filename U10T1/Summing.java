public class Summing {  
    public static void main(String[] args) {      
      System.out.println(sum(6));  // should print 21
      System.out.println(sum(10)); // should print 55
      System.out.println(sum(100)); // should print 5050
    }
  
    public static int sum(int n) {
      // Write a RECURSIVE implementation of this method
      if (n < 0) {
        return 0;
      } else {
        return n + sum(n - 1);
      }
    }
  }
  