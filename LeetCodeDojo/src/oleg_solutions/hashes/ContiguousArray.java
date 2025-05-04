package oleg_solutions.hashes;

import java.util.HashMap;

public class ContiguousArray {
    public static int solution(int[] nums) {
        var map = new HashMap<Integer, Integer>();
        map.put(0, -1);
        var ans = 0;
        var count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 0 ? 1 : -1);
            if (!map.containsKey(count)) {
                map.put(count, i);
            } else {
                ans = Math.max(ans, i - map.get(count));
            }
        }
        return ans;
    }
}
