package oleg_solutions.graphs.bfs;

import java.util.*;

public class MinimumGeneticMutation {
    public static int solution(String startGene, String endGene, String[] bank) {
        var ans = 0;
        var bankList = Arrays.asList(bank);
        var genes = new Character[]{'A', 'C', 'G', 'T'};
        Queue<String> queue = new LinkedList<>();
        Set<String> seen = new HashSet<>();
        queue.offer(startGene);
        seen.add(startGene);
        while (!queue.isEmpty()) {
            var levelLength = queue.size();
            for (var i = 0; i < levelLength; i++) {
                var current = queue.poll();
                if (current.equals(endGene)) {
                    return ans;
                }
                for (var gene : genes) {
                    for (var j = 0; j < current.length(); j++) {
                        var next = new StringBuilder();
                        next.append(current.subSequence(0, j));
                        next.append(gene);
                        next.append(current.substring(j + 1));
                        var nextStr = next.toString();
                        if (bankList.contains(nextStr) && !seen.contains(nextStr)) {
                            queue.offer(nextStr);
                            seen.add(nextStr);
                        }
                    }
                }
            }
            ans++;
        }
        return -1;
    }
}