package oleg_solutions.heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

record KVPair2(int key, int value) {
}

public class FindKClosestElements {
    public static List<Integer> solution(int[] arr, int k, int x) {
        var heap = new PriorityQueue<KVPair2>((left, right) ->
                Math.abs(left.key()) == Math.abs(right.key()) ?
                        right.value() - left.value() : Math.abs(right.key()) - Math.abs(left.key())
        );
        for (var num : arr) {
            heap.offer(new KVPair2(Math.abs(x - num), num));
            if (heap.size() > k) {
                heap.poll();
            }
        }
        var ans = new ArrayList<Integer>();
        for (var cur : heap) {
            ans.add(cur.value());
        }
        Collections.sort(ans);
        return ans;
    }
}
