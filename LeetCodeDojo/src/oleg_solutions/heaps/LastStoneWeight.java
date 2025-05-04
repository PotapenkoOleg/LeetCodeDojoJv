package oleg_solutions.heaps;

import java.lang.reflect.Array;
import java.util.*;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        var heap = new PriorityQueue<Integer>(Comparator.reverseOrder());
        for (var stone : stones) {
            heap.add(stone);
        }
        while (heap.size() > 1) {
            var s1 = heap.poll();
            var s2 = heap.poll();
            if (s1 != s2) {
                heap.offer(s1 - s2);
            }
        }
        return heap.isEmpty() ? 0 : heap.poll();
    }
}
