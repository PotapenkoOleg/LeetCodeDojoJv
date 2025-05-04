package algo.graphs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class DijkstraAlgorithm {
//    record Pair<T0, T1>(T0 t0, T1 t1) {
//    }
//
//    public void dijkstra(int n, int source) {
//
//        int[] distances = new int[n];
//        Arrays.fill(distances, Integer.MAX_VALUE);
//        distances[source] = 0;
//
//        Queue<Pair<Integer, Integer>> heap = new PriorityQueue<Pair<Integer, Integer>>(Comparator.comparing(Pair::getKey));
//        heap.add(new Pair(0, source));
//
//        while (!heap.isEmpty()) {
//            Pair<Integer, Integer> curr = heap.remove();
//            int currDist = curr.getKey();
//            int node = curr.getValue();
//
//            if (currDist > distances[node]) {
//                continue;
//            }
//
//            for (Pair<Integer, Integer> edge : graph.get(node)) {
//                int nei = edge.getKey();
//                int weight = edge.getValue();
//                int dist = currDist + weight;
//
//                if (dist < distances[nei]) {
//                    distances[nei] = dist;
//                    heap.add(new Pair(dist, nei));
//                }
//            }
//        }
//    }
}
