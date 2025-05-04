package oleg_solutions.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    private final List<List<Integer>> ans = new ArrayList<>();
    private int[] nums;

    public List<List<Integer>> solution(int[] nums) {
        this.nums = nums;
        backtrack(new ArrayList<>());
        return ans;
    }

    private void backtrack(List<Integer> cur) {
        if (cur.size() == nums.length) {
            ans.add(new ArrayList<>(cur));
            return;
        }
        for (var n : nums) {
            if (!cur.contains(n)) {
                cur.add(n);
                backtrack(cur);
                cur.remove(cur.size() - 1);
            }
        }
    }
}
