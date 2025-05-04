package oleg_solutions.greedy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeastNumOfUniqueElemAfterKDel {
    public static int solution(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.merge(arr[i], 1, Integer::sum);
        }
        var frequencies = new int[map.size()];
        int i = 0;
        for (var value : map.values()) {
            frequencies[i] = value;
            i++;
        }
        Arrays.sort(frequencies);
        var cur = 0;
        while (k > 0) {
            if (frequencies[cur] <= k) {
                k -= frequencies[cur];
                cur++;
            } else {
                break;
            }
        }
        return frequencies.length - cur;
    }
}
