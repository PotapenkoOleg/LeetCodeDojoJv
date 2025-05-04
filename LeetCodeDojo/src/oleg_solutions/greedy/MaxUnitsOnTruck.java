package oleg_solutions.greedy;

import java.util.Arrays;

public class MaxUnitsOnTruck {
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (left, right) -> right[1] - left[1]);
        var ans = 0;
        for (var boxType : boxTypes) {
            var boxes = Math.min(truckSize, boxType[0]);
            truckSize -= boxes;
            ans += boxes * boxType[1];
            if (truckSize == 0) {
                break;
            }
        }
        return ans;
    }
}
