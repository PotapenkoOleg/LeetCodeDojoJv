package oleg_solutions.graphs.dfs;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class KeysAndRooms {
    private final Set<Integer> seen = new HashSet<>();

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        seen.add(0);
        dfs(0, rooms);
        return seen.size() == rooms.size();
    }

    private void dfs(int node, List<List<Integer>> rooms) {
        for (var neighbor : rooms.get(node)) {
            if (!seen.contains(neighbor)) {
                seen.add(neighbor);
                dfs(neighbor, rooms);
            }
        }
    }

    private void dfsIter(int node, List<List<Integer>> rooms) {
        Stack<Integer> stack = new Stack<>();
        stack.push(node);
        while (!stack.empty()) {
            var cur = stack.pop();
            for (var neighbor : rooms.get(cur)) {
                if (!seen.contains(neighbor)) {
                    seen.add(neighbor);
                    stack.push(neighbor);
                }
            }
        }
    }
}
