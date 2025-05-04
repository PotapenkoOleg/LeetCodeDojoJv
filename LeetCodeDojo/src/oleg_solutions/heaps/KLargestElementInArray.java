package oleg_solutions.heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KLargestElementInArray {
    public int findKthLargest(int[] nums, int k) {
        var heap = new PriorityQueue<Integer>();
        for (var n : nums) {
            heap.offer(n);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        return heap.peek();
    }
}
