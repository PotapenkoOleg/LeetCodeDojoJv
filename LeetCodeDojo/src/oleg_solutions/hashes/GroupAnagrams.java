package oleg_solutions.hashes;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> solution(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        for (var str : strs) {
            var cur = str.toCharArray();
            Arrays.sort(cur);
            var key = new String(cur);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        List<List<String>> ans = new ArrayList<>();
        for (var key : map.keySet()) {
            ans.add(map.get(key));
        }
        return ans;
    }
}
