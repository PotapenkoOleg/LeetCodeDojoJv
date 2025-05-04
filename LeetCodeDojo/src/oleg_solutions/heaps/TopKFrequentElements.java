package oleg_solutions.heaps;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

record KVPair(int key, int value) {
}

public class TopKFrequentElements {
    public static int[] solution(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (var num : nums) {
            map.merge(num, 1, Integer::sum);
        }
        var heap = new PriorityQueue<KVPair>((n1, n2) -> n1.key() - n2.key());
        for (var key : map.keySet()) {
            var pair = new KVPair(map.get(key), key);
            heap.offer(pair);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        var ans = new int[k];
        for (var i = k - 1; i >= 0; i--) {
            ans[i] = heap.poll().value();
        }
        return ans;
    }
}
