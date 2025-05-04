package algo.arrays;

public class TwoPointersExhaustBoth {

    // Two pointers: Two Inputs, Exhaust Both
    public int fn(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int ans = 0;

        while (i < arr1.length && j < arr2.length) {
            // do some logic here
            if (1 == 1/*CONDITION*/) {
                i++;
            } else {
                j++;
            }
        }

        while (i < arr1.length) {
            // do logic
            i++;
        }

        while (j < arr2.length) {
            // do logic
            j++;
        }

        return ans;
    }
}
