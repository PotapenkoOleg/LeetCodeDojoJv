package oleg_solutions.binarySearch;

import java.util.Arrays;

public class SpellsAndPotionsPairs {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        var ans = new int[spells.length];
        for (var i = 0; i < spells.length; i++) {
            var insertionPoint = binarySearch(potions, success / (double) spells[i]);
            ans[i] = potions.length - insertionPoint;
        }
        return ans;
    }

    private int binarySearch(int[] potions, double target) {
        var left = 0;
        var right = potions.length - 1;
        while (left <= right) {
            var mid = left + (right - left) / 2;
            if (potions[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
