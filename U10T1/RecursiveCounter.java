public class RecursiveCounter {
    public static void main(String [] args) {
        recursiveCounter(10);
    }

    public static void recursiveCounter(int number) {
        // write this method
        if (number > 1) {
            recursiveCounter(number - 1);
        }
        System.out.println(number);
    }
}
