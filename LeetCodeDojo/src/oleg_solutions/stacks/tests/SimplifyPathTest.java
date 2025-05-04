package oleg_solutions.stacks.tests;


import oleg_solutions.stacks.SimplifyPath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimplifyPathTest {
    @Test
    void solutionTest1() {
        var input = "/var/usr/../////usr/./tst/";
        var actual = SimplifyPath.solution(input);
        var expected = "/var/usr/tst";
        assertEquals(expected, actual);
    }

    @Test
    void solutionTest2() {
        var input = "/var/./tst/";
        var actual = SimplifyPath.solution(input);
        var expected = "/var/tst";
        assertEquals(expected, actual);
    }

    @Test
    void solutionTest3() {
        var input = "/var/usr/../usr/tst";
        var actual = SimplifyPath.solution(input);
        var expected = "/var/usr/tst";
        assertEquals(expected, actual);
    }

    @Test
    void solutionTest4() {
        var input = "/../";
        var actual = SimplifyPath.solution(input);
        var expected = "/";
        assertEquals(expected, actual);
    }
    //

    @Test
    void solutionTest5() {
        var input = "/a//b////c/d//././/..";
        var actual = SimplifyPath.solution(input);
        var expected = "/a/b/c";
        assertEquals(expected, actual);
    }
}