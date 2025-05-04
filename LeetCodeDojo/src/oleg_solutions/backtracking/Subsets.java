package oleg_solutions.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    private final List<List<Integer>> ans = new ArrayList<>();
    private int[] nums;

    public List<List<Integer>> solution(int[] nums) {
        this.nums = nums;
        backtrack(new ArrayList<>(), 0);
        return ans;
    }

    private void backtrack(List<Integer> cur, int start) {
        if (start > nums.length) {
            return;
        }
        ans.add(new ArrayList<>(cur));
        for (var j = start; j < nums.length; j++) {
            cur.add(nums[j]);
            backtrack(cur, j + 1);
            cur.remove(cur.size() - 1);
        }
    }
}
