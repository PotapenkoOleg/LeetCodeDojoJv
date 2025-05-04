package algo.arrays;

public class FixedWindow {

    // Fixed Window
    public int solution(int[] nums, int k) {
        int cur = 0; // 1 for multiplication
        int ans = 0; // answer variable, probably equal to curr here depending on the problem
        // build the first window
        for (int i = 0; i < k; i++) {
            // Do something with curr or other variables to build first window
        }
        // ans = cur (window product)
        for (int i = k; i < nums.length; i++) {
            // Add arr[i] to window
            // Remove arr[i - k] from window
            // Update ans
        }
        return ans;
    }
}
