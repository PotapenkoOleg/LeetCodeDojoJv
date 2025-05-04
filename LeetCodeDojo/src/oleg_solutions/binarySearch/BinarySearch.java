package oleg_solutions.binarySearch;

public class BinarySearch {
    public int solution(int[] nums, int target) {
        var left = 0;
        var right = nums.length - 1;
        while (left <= right) {
            var mid = left + (right - left) / 2;
            var num = nums[mid];
            if (num == target) {
                return mid;
            }
            if (num > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
