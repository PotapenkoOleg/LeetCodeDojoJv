package oleg_solutions.hashes;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    public static int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}
