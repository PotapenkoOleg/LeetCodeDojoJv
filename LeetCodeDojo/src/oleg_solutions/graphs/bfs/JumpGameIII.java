package oleg_solutions.graphs.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class JumpGameIII {
    public static boolean canReach(int[] arr, int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        arr[start] = -arr[start];
        while (!queue.isEmpty()) {
            var current = queue.poll();
            if (arr[current] == 0) {
                return true;
            }
            var left = current - arr[current];
            if (0 <= left && left < arr.length && arr[left] >= 0) {
                queue.offer(left);
                arr[left] = -arr[left];
            }
            var right = current + arr[current];
            if (0 <= right && right < arr.length && arr[right] >= 0) {
                queue.offer(right);
                arr[right] = -arr[right];
            }
        }
        return false;
    }
}
