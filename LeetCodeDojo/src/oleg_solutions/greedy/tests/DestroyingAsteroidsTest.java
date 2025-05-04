package oleg_solutions.greedy.tests;

import oleg_solutions.greedy.DestroyingAsteroids;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class DestroyingAsteroidsTest {
    @Test
    void solutionTest1() {
        var mass = 10;
        var asteroids = new int[]{3, 9, 19, 5, 21};
        var actual = DestroyingAsteroids.solution(mass, asteroids);
        assertTrue(actual);
    }
}