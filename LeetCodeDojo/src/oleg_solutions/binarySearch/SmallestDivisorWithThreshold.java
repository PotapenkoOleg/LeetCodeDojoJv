package oleg_solutions.binarySearch;

public class SmallestDivisorWithThreshold {
    public static int solution(int[] nums, int threshold) {
        var left = 1;
        var right = 1_000_000;
        while (left <= right) {
            var mid = left + (right - left) / 2;
            if (check(nums, mid, threshold)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private static boolean check(int[] nums, int divisor, int threshold) {
        var sum = 0;
        for (var num : nums) {
            sum += (int) Math.ceil((double) num / divisor);
        }
        return sum <= threshold;
    }
}
