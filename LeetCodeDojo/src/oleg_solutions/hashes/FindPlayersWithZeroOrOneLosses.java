package oleg_solutions.hashes;

import java.util.*;

public class FindPlayersWithZeroOrOneLosses {
    public static List<List<Integer>> solution(int[][] matches) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] match : matches) {
            int winner = match[0];
            if (!map.containsKey(winner)) {
                map.put(winner, 0);
            }
            int loser = match[1];
            map.merge(loser, 1, Integer::sum);
        }
        List<Integer> notLost = new ArrayList<>();
        List<Integer> lostOnce = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            var key = entry.getKey();
            var value = entry.getValue();
            if (value == 0) {
                notLost.add(key);
            }
            if (value == 1) {
                lostOnce.add(key);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        Collections.sort(notLost);
        ans.add(notLost);
        Collections.sort(lostOnce);
        ans.add(lostOnce);
        return ans;
    }
}
