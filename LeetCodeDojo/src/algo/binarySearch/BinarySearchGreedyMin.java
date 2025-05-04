package algo.binarySearch;

public class BinarySearchGreedyMin {

    // Binary Search for Greedy Problems
    // If Looking for a Minimum
    public int fn(int[] arr) {
        int left = Integer.MIN_VALUE /* MINIMUM_POSSIBLE_ANSWER */;
        int right = Integer.MAX_VALUE /* MAXIMUM_POSSIBLE_ANSWER */;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (check(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public boolean check(int x) {
        // this function is implemented depending on the problem
        return true /* BOOLEAN */;
    }
}
