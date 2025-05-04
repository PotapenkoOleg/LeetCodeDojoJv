package oleg_solutions.heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

class MedianFinder {
    private final PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    private final PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

    public MedianFinder() {
    }

    public void addNum(int num) {
        maxHeap.offer(num);
        var cur = maxHeap.poll();
        minHeap.offer(cur);
        if (minHeap.size() > maxHeap.size()) {
            var cur1 = minHeap.poll();
            maxHeap.offer(cur1);
        }
    }

    public double findMedian() {
        if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek();
        }
        return (maxHeap.peek() + minHeap.peek()) / 2.0;
    }
}
