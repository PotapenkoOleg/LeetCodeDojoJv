package oleg_solutions.hashes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class JewelsAndStones {
    public static int solution(String jewels, String stones) {
        Map<Character, Integer> map = new HashMap<>();
        for (var stone : stones.toCharArray()) {
            map.merge(stone, 1, Integer::sum);
        }
        int ans = 0;
        for (var jewel : jewels.toCharArray()) {
            if (map.containsKey(jewel)) {
                ans += map.get(jewel);
            }
        }
        return ans;
    }

    public static int solution2(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        for (var jewel : jewels.toCharArray()) {
            set.add(jewel);
        }
        var ans = 0;
        for (var stone : stones.toCharArray()) {
            if (set.contains(stone)) {
                ans++;
            }
        }
        return ans;
    }
}
