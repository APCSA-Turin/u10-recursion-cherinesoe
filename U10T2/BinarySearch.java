package U10T2;

public class BinarySearch {
    public static int recursiveCount = 0;
    public static int iterativeCount = 0;
    // RECURSIVE IMPLEMENTATION
    public static int recursiveBinarySearch(int[] elements, int lowPosition, int highPosition, int target) {
        if (lowPosition > highPosition) {
            System.out.println(recursiveCount);
            return -1;  // base case: target was not found, return -1
        } else {
            int midPosition = (lowPosition + highPosition) / 2;

            if (elements[midPosition] < target) {
                recursiveCount++;
                /* ------ COMPLETE ME with a recursive call ------ */
                return recursiveBinarySearch(elements, midPosition + 1, highPosition, target);
            } else if (elements[midPosition] > target) {
                recursiveCount++;
                /* ------ COMPLETE ME with a recursive call ------ */
                return recursiveBinarySearch(elements, lowPosition, midPosition - 1, target);
            } else {
                // otherwise, target found, return that index
                return midPosition;
            }
        }
    }

    // ITERATIVE, NON-RECURSIVE IMPLEMENTATION -- FOR COMPARISON
    public static int iterativeNonRecursiveBinarySearch(int[] elements, int target) {
        int lowPosition = 0;
        int highPosition = elements.length - 1;

        while (lowPosition <= highPosition) {
            iterativeCount++;
            int midPosition = (lowPosition + highPosition) / 2;

            if (elements[midPosition] < target) {
                lowPosition = midPosition + 1;
            } else if (elements[midPosition] > target) {
                highPosition = midPosition - 1;
            } else {
                // else, target found, return its index
                return midPosition;
            }
        }
        // target was not found, return -1
        System.out.println(iterativeCount);
        return -1;
    }
}
