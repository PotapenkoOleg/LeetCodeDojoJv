package oleg_solutions.hashes;

import java.util.HashMap;
import java.util.Map;

public class MinimumConsecutiveCardsToPickUp {
    public static int solution(int[] cards) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < cards.length; i++) {
            if (map.containsKey(cards[i])) {
                ans = Math.min(ans, i - map.get(cards[i]) + 1);
            }
            map.put(cards[i], i);
        }
        return (ans == Integer.MAX_VALUE) ? -1 : ans;
    }
}
