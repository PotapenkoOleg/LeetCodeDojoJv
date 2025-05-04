package oleg_solutions.hashes;

import java.util.*;

public class IntersectionOfMultipleArrays {
    public static List<Integer> solution(int[][] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                map.put(nums[i][j], map.getOrDefault(nums[i][j], 0) + 1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (Integer key : map.keySet()) {
            if (map.get(key) == 3) {
                ans.add(key);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}