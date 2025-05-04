package oleg_solutions.greedy;

import java.util.Arrays;

public class MaxNumOfApplesInBasket {
    public int maxNumberOfApples(int[] weight) {
        int maxWeight = 5000;
        Arrays.sort(weight);
        var ans = 0;
        for (var apple : weight) {
            if (maxWeight - apple >= 0) {
                ans += 1;
                maxWeight -= apple;
            } else {
                break;
            }
        }
        return ans;
    }
}
