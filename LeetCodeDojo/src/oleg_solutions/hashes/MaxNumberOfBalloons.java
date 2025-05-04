package oleg_solutions.hashes;

import java.util.HashMap;
import java.util.Map;

public class MaxNumberOfBalloons {
    public static int solution(String text) {
        Map<Character, Integer> counts = new HashMap<>();
        for (char ch : text.toCharArray()) {
            counts.merge(ch, 1, Integer::sum);
        }
        int ans = Integer.MAX_VALUE;
        for (char ch : "balon".toCharArray()) {
            int cur = counts.getOrDefault(ch, 0);
            if ((ch == 'l') || (ch == 'o')) {
                cur /= 2;
            }
            ans = Math.min(ans, cur);
        }
        return ans;
    }
}
