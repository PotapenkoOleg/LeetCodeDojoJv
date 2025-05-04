package oleg_solutions.greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ReduceArraySizeToTheHalf {
    public static int minSetSize(int[] arr) {
        Map<Integer, Integer> mapCounts = new HashMap<>();
        for (var element : arr) {
            mapCounts.merge(element, 1, Integer::sum);
        }
        var counts = new ArrayList<>(mapCounts.values());
        counts.sort(Comparator.reverseOrder());
        var ans = 0;
        var numOfElements = 0;
        var target = arr.length / 2;
        for (var count : counts) {
            if (numOfElements + count < target) {
                ans++;
                numOfElements += count;
            } else {
                break;
            }
        }
        return ans + 1;
    }
}
