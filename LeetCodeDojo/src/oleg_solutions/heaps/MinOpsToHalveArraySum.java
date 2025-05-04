package oleg_solutions.heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MinOpsToHalveArraySum {
    public int halveArray(int[] nums) {
        var heap = new PriorityQueue<Double>(Comparator.reverseOrder());
        var sum = 0.0;
        for (double num : nums) {
            heap.offer(num);
            sum += num;
        }
        sum /= 2;
        var ans = 0;
        while (sum > 0) {
            ans++;
            var cur = heap.poll() / 2;
            sum -= cur;
            heap.offer(cur);
        }
        return ans;
    }
}
