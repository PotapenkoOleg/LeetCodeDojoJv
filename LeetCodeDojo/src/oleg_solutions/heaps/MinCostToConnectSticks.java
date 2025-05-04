package oleg_solutions.heaps;

import java.util.PriorityQueue;

public class MinCostToConnectSticks {
    public int connectSticks(int[] sticks) {
        var minHeap = new PriorityQueue<Integer>();
        for (var stick : sticks) {
            minHeap.offer(stick);
        }
        var ans = 0;
        while (minHeap.size() > 1) {
            var s1 = minHeap.poll();
            var s2 = minHeap.poll();
            var cost = s1 + s2;
            ans += cost;
            minHeap.offer(cost);
        }
        return ans;
    }
}
