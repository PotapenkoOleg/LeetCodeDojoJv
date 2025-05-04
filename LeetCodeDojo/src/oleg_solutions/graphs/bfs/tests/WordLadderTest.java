package oleg_solutions.graphs.bfs.tests;

import oleg_solutions.graphs.bfs.WordLadder;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordLadderTest {
    @Test
    void solutionTest1() {
        var beginWord = "hit";
        var endWord = "cog";
        var wordList = List.of("hot", "dot", "dog", "lot", "log", "cog");
        var solution = new WordLadder();
        var actual = solution.ladderLength(beginWord, endWord, wordList);
        var expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void solutionTest2() {
        var beginWord = "hit";
        var endWord = "cog";
        var wordList = List.of("hot", "dot", "dog", "lot", "log");
        var solution = new WordLadder();
        var actual = solution.ladderLength(beginWord, endWord, wordList);
        var expected = 0;
        assertEquals(expected, actual);
    }
}