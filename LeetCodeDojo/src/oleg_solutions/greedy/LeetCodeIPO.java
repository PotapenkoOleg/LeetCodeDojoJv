package oleg_solutions.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

record Project(int capital, int profit) {
}

public class LeetCodeIPO {
    public static int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        var n = profits.length;
        var projects = new Project[n];
        for (var i = 0; i < n; i++) {
            projects[i] = new Project(capital[i], profits[i]);
        }
        Arrays.sort(projects, (left, right) -> Integer.compare(left.capital(), right.capital()));
        var heap = new PriorityQueue<Integer>(Comparator.reverseOrder());
        var ans = w;
        var cur = 0;
        for (var iteration = 0; iteration < k; iteration++) {
            while (cur < n && projects[cur].capital() <= ans) {
                heap.offer(projects[cur].profit());
                cur++;
            }
            if (heap.isEmpty()) {
                return ans;
            }
            ans += heap.poll();
        }
        return ans;
    }
}
