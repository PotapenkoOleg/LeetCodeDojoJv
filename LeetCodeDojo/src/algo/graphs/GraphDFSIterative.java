package algo.graphs;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class GraphDFSIterative {

    // Graph DFS Iterative
    public int fn(int[][] graph) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> seen = new HashSet<>();
        stack.push(0 /* START_NODE */);
        seen.add(0 /* START_NODE */);
        int ans = 0;

        while (!stack.empty()) {
            int node = stack.pop();
            // do some logic
            for (int neighbor : graph[node]) {
                if (!seen.contains(neighbor)) {
                    seen.add(neighbor);
                    stack.push(neighbor);
                }
            }
        }

        return ans;
    }
}
