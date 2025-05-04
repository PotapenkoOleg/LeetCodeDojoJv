package oleg_solutions.heaps;

import java.util.PriorityQueue;

public class KthLargest {
    private PriorityQueue<Integer> heap = new PriorityQueue<>();
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (var num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        heap.offer(val);
        if (heap.size() > k) {
            heap.poll();
        }
        return heap.peek();
    }
}