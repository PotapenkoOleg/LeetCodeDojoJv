package oleg_solutions.greedy;

import java.util.Arrays;

public class DestroyingAsteroids {
    public static boolean solution(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long newMass = mass; // overflow
        for (var i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > newMass) {
                return false;
            }
            newMass += asteroids[i];
        }
        return true;
    }
}
