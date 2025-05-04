package oleg_solutions.queues;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {
    private final int size;
    private long sum;
    private final Queue<Integer> queue = new LinkedList<>();

    public MovingAverage(int size) {
        this.size = size;
    }

    public double next(int val) {
        sum += val;
        queue.offer(val);
        while (!queue.isEmpty() && queue.size() > size) {
            sum -= queue.poll();
        }
        return (sum * 1.0) / queue.size();
    }
}
