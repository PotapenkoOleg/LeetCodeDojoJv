package oleg_solutions.greedy;

import java.util.Arrays;
import java.util.Collections;


public class BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        var ans = 0;
        Arrays.sort(people);
        var light = 0;
        var heavy = people.length - 1;
        while (light <= heavy) {
            if (people[heavy] + people[light] <= limit) {
                light++;
            }
            heavy--;
            ans++;
        }
        return ans;
    }
}
