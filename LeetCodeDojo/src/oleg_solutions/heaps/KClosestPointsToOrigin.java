package oleg_solutions.heaps;

import java.util.PriorityQueue;

record Point(int distance, int index) {
}

public class KClosestPointsToOrigin {
    public static int[][] solution(int[][] points, int k) {
        var heap = new PriorityQueue<Point>((l, r) -> l.distance() - r.distance());
        for (var i = 0; i < points.length; i++) {
            var distance = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            heap.offer(new Point(distance, i));
        }
        var ans = new int[k][];
        for (var i = 0; i < k; i++) {
            var cur = heap.poll();
            ans[i] = points[cur.index()];
        }
        return ans;
    }
}
