package algo.arrays;

public class SlidingWindow {

    // Sliding Window
    public int solution(int[] nums) {
        int left = 0;
        int ans = 0;
        int curr = 0;

        for (int right = 0; right < nums.length; right++) {
            // do logic here to add nums[right] to curr
            while (1 == 1/*WINDOW_CONDITION_BROKEN*/) {
                // remove nums[left] from curr
                left++;
            }
            // update ans
            // ans += right - left + 1; // number of sub arrays
        }
        return ans;
    }
}