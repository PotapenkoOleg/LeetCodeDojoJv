package oleg_solutions.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    private int n;
    private int k;

    private final List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        this.k = k;
        backtrack(new ArrayList<>(), 1);
        return ans;
    }

    private void backtrack(List<Integer> cur, int start) {
        if (cur.size() == k) {
            ans.add(new ArrayList<>(cur));
            return;
        }
        for (var num = start; num <= n; num++) {
            cur.add(num);
            backtrack(cur, num + 1);
            cur.remove(cur.size() - 1);
        }
    }
}
