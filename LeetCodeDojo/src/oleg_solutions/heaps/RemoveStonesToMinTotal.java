package oleg_solutions.heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class RemoveStonesToMinTotal {
    public int minStoneSum(int[] piles, int k) {
        var maxHeap = new PriorityQueue<Integer>(Comparator.reverseOrder());
        for (var pile : piles) {
            maxHeap.offer(pile);
        }
        for (var i = 0; i < k; i++) {
            var cur = maxHeap.poll();
            maxHeap.offer(cur - cur / 2);
        }
        var ans = 0;
        for (var cur : maxHeap) {
            ans += cur;
        }
        return ans;
    }
}
